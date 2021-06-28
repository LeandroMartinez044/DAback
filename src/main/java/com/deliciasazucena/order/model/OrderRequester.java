package com.deliciasazucena.order.model;

import com.deliciasazucena.breakfast.model.Breakfast;
import com.deliciasazucena.breakfast.model.BreakfastRepository;
import org.apache.commons.lang3.Validate;

public class OrderRequester {

  private final BreakfastRepository breakfastRepository;


  public OrderRequester(BreakfastRepository theBreakfastRepository){
    Validate.notNull(theBreakfastRepository,
      "The breakfast repository cannot be empty.");
    this.breakfastRepository = theBreakfastRepository;
  }

  public void createOrder(){

  }

}
