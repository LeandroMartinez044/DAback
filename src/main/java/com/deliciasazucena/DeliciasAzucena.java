package com.deliciasazucena;

import javax.persistence.EntityManager;

import com.deliciasazucena.breakfast.application.BreakfastCreator;
import com.deliciasazucena.breakfast.application.BreakfastRequester;
import com.deliciasazucena.breakfast.domain.model.BreakfastRepository;
import com.deliciasazucena.order.domain.model.OrderRepository;
import com.deliciasazucena.order.domain.model.OrderRequester;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
public class DeliciasAzucena{


  @Bean
  public OrderRepository orderRepository(final EntityManager entityManager){
    return new OrderRepository(entityManager);
  }

  @Bean
  public OrderRequester orderRequester(
      final BreakfastRepository theBreakfastRepository){
    return new OrderRequester(theBreakfastRepository);
  }

  @Bean
  public BreakfastCreator breakfastCreator(
    final BreakfastRepository theBreakfastRepository){
    return new BreakfastCreator(theBreakfastRepository);
  }

  @Bean
  public BreakfastRequester breakfastRequester(
    final BreakfastRepository theBreakfastRepository){
    return new BreakfastRequester(theBreakfastRepository);
  }

}
