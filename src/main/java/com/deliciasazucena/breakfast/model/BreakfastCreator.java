package com.deliciasazucena.breakfast.model;

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
      throw new RuntimeException("ya existe");
    }

    breakfast = new Breakfast(breakfastDTO.getName(),
      breakfastDTO.getDescription(), breakfastDTO.getPrice());

    breakfastRepository.save(breakfast);
  }

}
