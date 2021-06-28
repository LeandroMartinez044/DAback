package com.deliciasazucena.order.application;

import com.deliciasazucena.order.model.OrderRequester;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

  private final OrderRequester orderRequester;

  public OrderController(final OrderRequester theOrderRequester){
    orderRequester = theOrderRequester;
  }

  public ResponseEntity<OrderDTO> getOrder() {
    OrderDTO orderDTO = new OrderCommand();

    return ResponseEntity.ok(orderDTO);
  }

  @GetMapping
  public void requestOrder(){
    orderRequester.createOrder();
  }

}
