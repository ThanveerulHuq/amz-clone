package com.amz.clone.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.amz.clone.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	  List<User> findByNameContaining(String title);
	}
