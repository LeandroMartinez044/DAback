package com.deliciasazucena.breakfast.infrastructure;

import java.util.List;

import com.deliciasazucena.breakfast.application.BreakfastCreator;
import com.deliciasazucena.breakfast.application.BreakfastRequester;
import org.apache.commons.lang3.Validate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/breakfast")
public class BreakfastController {

  final BreakfastCreator breakfastCreator;
  final BreakfastRequester breakfastRequester;

  public BreakfastController(
      final BreakfastCreator theBreakfastCreator,
      final BreakfastRequester theBreakfastRequester) {
    Validate.notNull(theBreakfastCreator,
      "The breakfast creator cannot be null.");
    Validate.notNull(theBreakfastRequester,
      "The breakfast requester cannot be null.");
    breakfastCreator = theBreakfastCreator;
    breakfastRequester = theBreakfastRequester;
  }

  @PostMapping
  public ResponseEntity addBreakfast(@RequestBody BreakfastDTO breakfastDTO) {
    breakfastCreator.createBreakfast(breakfastDTO);
    return ResponseEntity.ok("Breakfast created");
  }

  @GetMapping
  public List<BreakfastDTO> getBreakfast(){
    return breakfastRequester.getBreakfast();
  }

}
