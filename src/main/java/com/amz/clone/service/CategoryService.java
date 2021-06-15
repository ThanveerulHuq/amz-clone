package com.amz.clone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amz.clone.model.Category;
import com.amz.clone.repository.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAllCategory(final String parent) {
        // try {

        if (parent == null)
            return categoryRepository.findAll();
        else
            return categoryRepository.findByParent(parent);

        // if (category.isEmpty()) {
        // return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        // }

        // } catch (Exception e) {
        // e.printStackTrace()
        //
    }

    public Category addCategory(final Category category) {
        return categoryRepository.save(category);
    }

}
