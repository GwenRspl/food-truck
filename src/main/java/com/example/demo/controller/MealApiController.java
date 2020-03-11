package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MealTime;
import com.example.demo.model.MealType;
import com.example.demo.repository.MealTimeRepository;
import com.example.demo.repository.MealTypeRepository;

@RestController
@RequestMapping("/api")
public class MealApiController {

	@Autowired
	private MealTimeRepository mealTimeRepository;

	@Autowired
	private MealTypeRepository mealTypeRepository;

	@GetMapping("/mealtimes")
	public ResponseEntity<List<MealTime>> listMealTimes() {
		return new ResponseEntity<>(this.mealTimeRepository.findAll(), HttpStatus.OK);
	}

	@GetMapping("/mealtypes")
	public ResponseEntity<List<MealType>> listMealTypes() {
		return new ResponseEntity<>(this.mealTypeRepository.findAll(), HttpStatus.OK);
	}

}
