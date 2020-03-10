package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.OrderLine;

@Repository
public interface OrderLineRepository extends JpaRepository<OrderLine, Integer> {

	// select order_line.product_id, name, price, image, grade from
	// foodtruck.order_line inner join foodtruck.product on product_id=product.id
	// left join foodtruck.rating on order_line.product_id=rating.product_id group
	// by product_id order by sum(quantity) desc limit 3;

}
