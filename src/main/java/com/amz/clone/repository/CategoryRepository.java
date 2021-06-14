package com.amz.clone.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.amz.clone.model.Category;
@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
	  List<Category> findByNameContaining(String title);
	}
