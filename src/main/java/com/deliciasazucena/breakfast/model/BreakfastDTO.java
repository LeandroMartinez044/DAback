package com.deliciasazucena.breakfast.model;

public class BreakfastDTO {

  private String name;

  private String description;

  private Double price;

  public BreakfastDTO() {
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
