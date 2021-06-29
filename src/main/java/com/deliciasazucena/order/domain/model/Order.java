package com.deliciasazucena.order.domain.model;

import java.util.List;

import org.apache.commons.lang3.Validate;

public class Order {

  private Long id;

  private List<OrderDetail> orderDetails;

  private Double finalPrice;

  private String customerName;

  private String customerLastname;

  private DeliveryAddress deliveryAddress;


  public Order(List<OrderDetail> theOrderDetails,
               Double theFinalPrice,
               String theCustomerName,
               String theCustomerLastname,
               DeliveryAddress theDeliveryAddress) {

    Validate.notEmpty(theOrderDetails, "The order details cannot be empty.");
    Validate.notNull(theFinalPrice, "The final price cannot be null.");
    Validate.notEmpty(theCustomerName, "The customer name cannot be empty.");
    Validate.notEmpty(theCustomerLastname,
      "The customer last name cannot be empty.");
    Validate.notNull(theDeliveryAddress,
      "The delivery address cannot be null.");

    orderDetails = theOrderDetails;
    finalPrice = theFinalPrice;
    customerName = theCustomerName;
    customerLastname = theCustomerLastname;
    deliveryAddress = theDeliveryAddress;

  }
}
