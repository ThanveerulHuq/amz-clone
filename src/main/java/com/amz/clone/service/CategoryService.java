package com.amz.clone.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.amz.clone.model.Category;
import com.amz.clone.repository.CategoryRepository;

@Service("categoryService")
public class CategoryService {
	
	@Autowired
	CategoryRepository CategoryRepository;
	
	public ResponseEntity<List<Category>> getAllCategory(String title) {
		 try {
			    List<Category> category = new ArrayList<Category>();

			    if (title == null)
			    	CategoryRepository.findAll().forEach(category::add);
			    else
			    	CategoryRepository.findByNameContaining(title).forEach(category::add);

			    if (category.isEmpty()) {
			      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			    }

			    return new ResponseEntity<>(category, HttpStatus.OK);
			  } catch (Exception e) {
			    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			  }
	}

}
