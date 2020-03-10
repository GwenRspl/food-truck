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
import com.example.demo.repository.ActualitesRepository;

@RestController
@RequestMapping("/api")
public class ActualiteApiController {

	@Autowired
	private ActualitesRepository repository;

	@GetMapping("")
	public List<Actualite> getAll() {
		return this.repository.findAll();
	}

	@GetMapping("/actualites")
	public ResponseEntity<List<Actualite>> list() {
		return new ResponseEntity<>(this.repository.findAll(), HttpStatus.OK);
	}

	@PostMapping("/actualites")
	public ResponseEntity<String> create(@RequestBody Actualite actualite) {
		if (!this.repository.existsById(actualite.getId())) {
			this.repository.save(actualite);
			return new ResponseEntity<>("Actualité créée", HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>("Erreur, l'actualité existe déjà", HttpStatus.CONFLICT);
		}
	}

	@GetMapping("/actualites/{id}")
	public ResponseEntity<Actualite> findById(@PathVariable(name = "id") Integer id) {
		if (this.repository.existsById(id)) {
			return new ResponseEntity<>(this.repository	.findById(id)
														.get(),
					HttpStatus.OK);
		} else {
			return new ResponseEntity<>(new Actualite(), HttpStatus.NOT_FOUND);
		}

	}

	@PutMapping("/actualites")
	public ResponseEntity<String> update(@RequestBody Actualite actualite) {
		if (this.repository.existsById(actualite.getId())) {
			this.repository.save(actualite);
			return new ResponseEntity<>("Actualité mise à jour", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Erreur, l'actualité n'existe pas", HttpStatus.NOT_MODIFIED);
		}
	}

	@DeleteMapping("/actualites/{id}")
	public ResponseEntity<String> delete(@PathVariable(name = "id") Integer id) {
		if (this.repository.existsById(id)) {
			Actualite a = this.repository	.findById(id)
											.get();
			this.repository.delete(a);
			return new ResponseEntity<>("Actualité supprimée", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Erreur, l'actualité n'existe pas", HttpStatus.NOT_FOUND);
		}
	}

}
