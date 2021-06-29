package com.deliciasazucena.breakfast.application;

import java.util.ArrayList;
import java.util.List;

import com.deliciasazucena.breakfast.domain.model.Breakfast;
import com.deliciasazucena.breakfast.infrastructure.BreakfastDTO;
import com.deliciasazucena.breakfast.domain.model.BreakfastRepository;
import org.apache.commons.lang3.Validate;

public class BreakfastRequester {

  private final BreakfastRepository breakfastRepository;

  public BreakfastRequester(final BreakfastRepository theBreakfastRepository) {
    Validate.notNull(theBreakfastRepository,
      "The breakfast repository cannot be null.");

    breakfastRepository = theBreakfastRepository;
  }

  public List<BreakfastDTO> getBreakfast(){
    List<Breakfast> breakfasts = breakfastRepository.findAll();

    List<BreakfastDTO> breakfastDTOList = new ArrayList<>();

    for (Breakfast breakfast: breakfasts) {
      breakfastDTOList.add(
        new BreakfastDTO(breakfast.getName(),
          breakfast.getDescription(),
          breakfast.getPrice())
      );
    }

    return breakfastDTOList;
  }

}
