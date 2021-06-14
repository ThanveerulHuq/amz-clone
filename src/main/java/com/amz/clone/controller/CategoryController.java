package com.amz.clone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amz.clone.service.CategoryService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class CategoryController {

	@Autowired
	@Qualifier("categoryService")
	CategoryService CategoryService;

	@GetMapping("/Category")
	public String getAllCategory(@RequestParam(required = false) String title) {
		String response = (CategoryService.getAllCategory(title)).toString();
		return response;
	}

}
