package com.deliciasazucena;

import javax.persistence.EntityManager;

import com.deliciasazucena.breakfast.model.BreakfastCreator;
import com.deliciasazucena.breakfast.model.BreakfastRepository;
import com.deliciasazucena.order.model.OrderRepository;
import com.deliciasazucena.order.model.OrderRequester;
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

}
