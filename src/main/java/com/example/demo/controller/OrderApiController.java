package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.OrderHeader;
import com.example.demo.repository.OrderHeaderRepository;

@RestController
@RequestMapping("/api")
public class OrderApiController {

	@Autowired
	private OrderHeaderRepository repository;

	@GetMapping("/orders")
	public ResponseEntity<List<OrderHeader>> list() {
		return new ResponseEntity<>(this.repository.findAll(), HttpStatus.OK);
	}

	@PostMapping("/orders")
	public ResponseEntity<String> create(@RequestBody OrderHeader order) {
		if (!this.repository.existsById(order.getId())) {
			this.repository.save(order);
			return new ResponseEntity<>("Commande créée", HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>("Erreur, la commande existe déjà", HttpStatus.CONFLICT);
		}
	}

	@GetMapping("/orders/{id}")
	public ResponseEntity<OrderHeader> findById(@PathVariable(name = "id") Integer id) {
		if (this.repository.existsById(id)) {
			return new ResponseEntity<>(this.repository	.findById(id)
														.get(),
					HttpStatus.OK);
		} else {
			return new ResponseEntity<>(new OrderHeader(), HttpStatus.NOT_FOUND);
		}

	}

	@PutMapping("/orders")
	public ResponseEntity<String> update(@RequestBody OrderHeader order) {
		if (this.repository.existsById(order.getId())) {
			this.repository.save(order);
			return new ResponseEntity<>("Commande mis à jour", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Erreur, la commande n'existe pas", HttpStatus.NOT_MODIFIED);
		}
	}

	@DeleteMapping("/orders/{id}")
	public ResponseEntity<String> delete(@PathVariable(name = "id") Integer id) {
		if (this.repository.existsById(id)) {
			OrderHeader order = this.repository	.findById(id)
												.get();
			this.repository.delete(order);
			return new ResponseEntity<>("Commande supprimé", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Erreur, la commande n'existe pas", HttpStatus.NOT_FOUND);
		}
	}

}
