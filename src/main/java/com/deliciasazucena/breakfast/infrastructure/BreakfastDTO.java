package com.deliciasazucena.breakfast.infrastructure;

import org.apache.commons.lang3.Validate;

public class BreakfastDTO {

  private String name;

  private String description;

  private Double price;


  public BreakfastDTO() {
  }

  public BreakfastDTO(
      final String theName,
      final String theDescription,
      final Double thePrice) {

    Validate.notEmpty(theName, "The name cannot be empty.");
    Validate.notEmpty(theDescription, "The description cannot be empty.");
    Validate.notNull(thePrice, "The price cannot be null");

    name = theName;
    description = theDescription;
    price = thePrice;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }
}
