package com.deliciasazucena.breakfast.domain.model;

import com.deliciasazucena.breakfast.domain.model.Breakfast;
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
