package com.deliciasazucena.breakfast.application;

import com.deliciasazucena.breakfast.model.BreakfastCreator;
import com.deliciasazucena.breakfast.model.BreakfastDTO;
import org.apache.commons.lang3.Validate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/breakfast")
public class BreakfastController {

  final BreakfastCreator breakfastCreator;

  public BreakfastController(final BreakfastCreator theBreakfastCreator) {
    Validate.notNull(theBreakfastCreator,
      "The breakfast creator cannot be null.");
    breakfastCreator = theBreakfastCreator;
  }

  @PostMapping
  public void addBreakfast(@RequestBody BreakfastDTO breakfastDTO) {
    breakfastCreator.createBreakfast(breakfastDTO);
  }

}
