package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.model.Days;

@Repository
public interface DaysRepository extends JpaRepository<Days, Integer>{

}
