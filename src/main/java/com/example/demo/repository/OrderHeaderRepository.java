package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.OrderHeader;

@Repository
public interface OrderHeaderRepository extends JpaRepository<OrderHeader, Integer> {

}
