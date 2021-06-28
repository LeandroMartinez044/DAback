package com.deliciasazucena.order.model;

import org.apache.commons.lang3.Validate;

public class DeliveryAddress {

  private String street;

  private String number;

  private String apartment;

  private String postalCode;

  private String city;

  public DeliveryAddress(final String theStreet,
                         final String theNumber,
                         final String theApartment,
                         final String thePostalCode,
                         final String theCity) {

    Validate.notEmpty(theStreet, "The street cannot be empty.");
    Validate.notEmpty(theNumber, "The number cannot be empty.");
    Validate.notEmpty(theApartment, "The apartment cannot be empty.");
    Validate.notEmpty(thePostalCode, "The postal code cannot be empty.");
    Validate.notEmpty(theCity, "The city cannot be empty.");

    street = theStreet;
    number = theNumber;
    apartment = theApartment;
    postalCode = thePostalCode;
    city = theCity;
  }
}
