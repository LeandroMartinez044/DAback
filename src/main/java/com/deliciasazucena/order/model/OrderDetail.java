package com.deliciasazucena.order.model;

import org.apache.commons.lang3.Validate;

public class OrderDetail {

  private Long breakfastId;

  private Integer amount;

  public OrderDetail(final Long theBreakfastId, final Integer theAmount){
    Validate.notNull(theBreakfastId, "The breakfastId cannot be null.");
    Validate.notNull(theAmount, "The amount cannot be null.");

    breakfastId = theBreakfastId;
    amount = theAmount;
  }

  public Long getBreakfastId() {
    return breakfastId;
  }

  public Integer getAmount() {
    return amount;
  }
}
