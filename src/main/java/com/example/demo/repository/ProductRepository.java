package com.example.demo.repository;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Query("select p from Product p join OrderLine o on o.product.id = p.id left join Rating r on o.product.id = r.product.id group by o.product.id order by sum(o.quantity) desc")
	List<Product> findBestProducts(Pageable firstpage);

	
	
	
//	"select o.product.id, p.name , p.price , r.grade from OrderLine o inner join Product p on o.product.id = p.id left outer join Rating r on o.product.id = r.product.id group by o.product.id order by sum(o.quantity) desc limit 3"
	
// select order_line.product_id, name, price, image, grade from
// foodtruck.order_line inner join foodtruck.product on product_id=product.id
// left join foodtruck.rating on order_line.product_id=rating.product_id group
// by product_id order by sum(quantity) desc limit 3;
	
	
//	@Query(select
//	   ORDER_LINE.PRODUCT_ID,
//	   PRODUCT.NAME,
//	   PRODUCT.PRICE,
//	   PRODUCT.IMAGE,
//	   RATING.GRADE 
//	from
//	   ORDER_LINE o 
//	   inner join
//	      FOODTRUCK.PRODUCT p 
//	      on PRODUCT_ID = PRODUCT.ID 
//	   left outer join
//	      FOODTRUCK.RATING 
//	      on ORDER_LINE.PRODUCT_ID = RATING.PRODUCT_ID 
//	group by
//	   PRODUCT_ID 
//	order by
//	   sum(QUANTITY) desc limit 3
//	)
	
	
	
	
	
	// SELECT name, price, img FROM foodtruck.product order by price desc;
}
