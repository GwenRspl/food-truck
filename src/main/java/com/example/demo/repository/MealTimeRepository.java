package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.MealTime;

@Repository
public interface MealTimeRepository extends JpaRepository<MealTime, Integer> {

}
