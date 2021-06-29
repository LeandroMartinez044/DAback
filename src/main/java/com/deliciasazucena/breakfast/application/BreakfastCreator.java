package com.deliciasazucena.breakfast.application;

import com.deliciasazucena.breakfast.domain.model.Breakfast;
import com.deliciasazucena.breakfast.infrastructure.BreakfastDTO;
import com.deliciasazucena.breakfast.domain.model.BreakfastRepository;
import com.deliciasazucena.breakfast.infrastructure.exceptions.BreakfastNameAlreadyExistsException;
import com.deliciasazucena.breakfast.infrastructure.exceptions.RequiredInfoException;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

public class BreakfastCreator {

  private final BreakfastRepository breakfastRepository;

  public BreakfastCreator(final BreakfastRepository theBreakfastRepository) {
    Validate.notNull(theBreakfastRepository,
      "The breakfast repository cannot be null.");

    breakfastRepository = theBreakfastRepository;
  }


  public void createBreakfast(final BreakfastDTO breakfastDTO) {

    Breakfast breakfast = breakfastRepository
      .findBreakfastByName(breakfastDTO.getName());

    if(breakfast != null) {
      throw new BreakfastNameAlreadyExistsException(
      "breakfast name already exists");
    }

    if(StringUtils.isEmpty(breakfastDTO.getName())){
      throw new RequiredInfoException("breakfast required name");
    }

    if(breakfastDTO.getDescription() == null){
      throw new RequiredInfoException("breakfast required description");
    }

    if(breakfastDTO.getPrice() == null){
      throw new RequiredInfoException("breakfast required price");
    }

    breakfast = new Breakfast(breakfastDTO.getName(),
      breakfastDTO.getDescription(), breakfastDTO.getPrice());

    breakfastRepository.save(breakfast);
  }

}
