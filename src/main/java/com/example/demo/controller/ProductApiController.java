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

import com.example.demo.model.Actualite;
import com.example.demo.model.Product;
import com.example.demo.repository.ActualitesRepository;
import com.example.demo.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class ProductApiController {
	
	@Autowired
	private ProductRepository prdctrepo;
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> list() {
		return new ResponseEntity<>(this.prdctrepo.findAll(), HttpStatus.OK);
	}
	@PostMapping("/products")
	public ResponseEntity<String> create(@RequestBody Product product) {
		if (!this.prdctrepo.existsById(product.getId())) {
			this.prdctrepo.save(product);
			return new ResponseEntity<>("Produit créé", HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>("Erreur, produit existe déjà", HttpStatus.CONFLICT);
		}
	}

	@GetMapping("/products/{id}")
	public ResponseEntity<Product> findById(@PathVariable(name = "id") Integer id) {
		if (this.prdctrepo.existsById(id)) {
			return new ResponseEntity<>(this.prdctrepo.findById(id).get(),HttpStatus.OK);
		} else {
			return new ResponseEntity<>(new Product(), HttpStatus.NOT_FOUND);
		}

	}

	@PutMapping("/products")
	public ResponseEntity<String> update(@RequestBody Product product) {
		if (this.prdctrepo.existsById(product.getId())) {
			this.prdctrepo.save(product);
			return new ResponseEntity<>("Produit mis à jour", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Erreur, produit n'existe pas", HttpStatus.NOT_MODIFIED);
		}
	}

	@DeleteMapping("/products/{id}")
	public ResponseEntity<String> delete(@PathVariable(name = "id") Integer id) {
		if (this.prdctrepo.existsById(id)) {
			Product p = this.prdctrepo.findById(id).get();
			this.prdctrepo.delete(p);
			return new ResponseEntity<>("Produit supprimé", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Erreur, produit  n'existe pas", HttpStatus.NOT_FOUND);
		}
	}
}
