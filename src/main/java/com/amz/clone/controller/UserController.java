package com.amz.clone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amz.clone.model.User;
import com.amz.clone.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserRepository UserRepository;

	/*@GetMapping("/Users")
	public ResponseEntity<List<User>> getAllUsers(@RequestParam(required = false) String title) {

	}

	@GetMapping("/Users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") String id) {

	}*/

	@PostMapping("/Users")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		try {
			User _user = UserRepository.save(new User(user.getName(), user.getEmail()));
			return new ResponseEntity<>(_user, HttpStatus.CREATED);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	/*@PutMapping("/Users/{id}")
	public ResponseEntity<User> updateUser(@PathVariable("id") String id, @RequestBody User user) {

	}

	@DeleteMapping("/Users/{id}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") String id) {

	}*/

}
