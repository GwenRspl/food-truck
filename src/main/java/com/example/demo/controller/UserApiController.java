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


import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserApiController {

	@Autowired
	private UserRepository userrepo;


	@GetMapping("/users")
	public ResponseEntity<List<User>> list() {
		return new ResponseEntity<>(this.userrepo.findAll(), HttpStatus.OK);
	}

	@PostMapping("/users")
	public ResponseEntity<String> create(@RequestBody User user) {
		if (!this.userrepo.existsById(user.getId())) {
			this.userrepo.save(user);
			return new ResponseEntity<>("User créé", HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>("Erreur, user existant", HttpStatus.CONFLICT);
		}
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<User> findById(@PathVariable(name = "id") Integer id) {
		if (this.userrepo.existsById(id)) {
			return new ResponseEntity<>(this.userrepo.findById(id).get(),HttpStatus.OK);
		} else {
			return new ResponseEntity<>(new User(), HttpStatus.NOT_FOUND);
		}

	}

	@PutMapping("/users")
	public ResponseEntity<String> update(@RequestBody User user) {
		if (this.userrepo.existsById(user.getId())) {
			this.userrepo.save(user);
			return new ResponseEntity<>("User mis à jour", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Erreur, le user n'existe pas", HttpStatus.NOT_MODIFIED);
		}
	}

	@DeleteMapping("/users/{id}")
	public ResponseEntity<String> delete(@PathVariable(name = "id") Integer id) {
		if (this.userrepo.existsById(id)) {
			User u = this.userrepo.findById(id).get();
			this.userrepo.delete(u);
			return new ResponseEntity<>("User supprimé", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Erreur,le user n'existe pas", HttpStatus.NOT_FOUND);
		}
	}

}
