package com.amz.clone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amz.clone.model.Category;
import com.amz.clone.service.CategoryService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;


    @GetMapping
    public List<Category> getAllCategory(@RequestParam(required = false) final String title) {
        return categoryService.getAllCategory(title);
    }

    @PostMapping
    public Category addCategory(@RequestBody final Category category) {
        return categoryService.addCategory(category);
    }

}
