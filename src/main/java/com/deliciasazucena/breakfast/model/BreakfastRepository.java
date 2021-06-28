package com.deliciasazucena.breakfast.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BreakfastRepository extends JpaRepository<Breakfast, Long> {

  @Query("FROM Breakfast b WHERE b.name=:breakfastName ")
  Breakfast findBreakfastByName(
      @Param(value = "breakfastName") String breakfastName);

}
