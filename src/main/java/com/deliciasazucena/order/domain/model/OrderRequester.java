package com.deliciasazucena.order.domain.model;

import com.deliciasazucena.breakfast.domain.model.BreakfastRepository;
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
