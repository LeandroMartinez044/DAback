package com.deliciasazucena.breakfast.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.apache.commons.lang3.Validate;

@Entity
public class Breakfast {

  /**
   * The id (internal).
   */
  @Id
  @GeneratedValue
  private Long id;

  /**
   * The name of the breakfast. Never null.
   */
  private String name;

  /**
   * The description of the breakfast. Never null.
   */
  private String description;

  /**
   * The price of the breakfast. Never null.
   */
  private Double price;


  public Breakfast() {
  }

  public Breakfast(final String theName, final String theDescription,
                   final Double thePrice) {
    Validate.notEmpty(theName, "The name cannot be empty.");
    Validate.notEmpty(theDescription, "The name cannot be empty.");
    Validate.notNull(thePrice, "The price cannot be null");

    this.name = theName;
    this.description = theDescription;
    this.price = thePrice;
  }

  public void update(final String theName, final String theDescription,
                   final Double thePrice) {
    Validate.notEmpty(theName, "The name cannot be empty.");
    Validate.notEmpty(theDescription, "The name cannot be empty.");
    Validate.notNull(thePrice, "The price cannot be null");

    this.name = theName;
    this.description = theDescription;
    this.price = thePrice;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }
}
