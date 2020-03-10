package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Gender;
import com.example.demo.model.Society;

@Repository
public interface SocietyRepository extends JpaRepository<Society, Integer> {

}
