package com.deliciasazucena.order.domain.model;

import javax.persistence.EntityManager;

import org.apache.commons.lang3.Validate;

public class OrderRepository {

  /**
   * The Jpa Entity Manager. never null.
   */
  private EntityManager entityManager;

  public OrderRepository(final EntityManager theEntityManager){
    Validate.notNull(theEntityManager, "The entity manager cannot be null.");
    entityManager = theEntityManager;
  }


  /**
   *
   * Adds a order to the repository.
   *
   * @param order The contract to add. Can not be null.
   */
  void add(final Order order) {
    Validate.notNull(order, "The order cannot be null.");
    entityManager.persist(order);
  }

}
