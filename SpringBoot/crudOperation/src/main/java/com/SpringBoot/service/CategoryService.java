package com.SpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.entity.Category;
import com.SpringBoot.repository.CategoryRepository;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(int id) {
       
    	Optional<Category> c= categoryRepository.findById(id);
    	if(c.isPresent())
    	{
    		return c.get();
    	}
    	return null;
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category updateCategory(int id, Category categoryDetails) {
    	Optional<Category> c= categoryRepository.findById(id);
    	if(c.isPresent())
    	{
    		categoryDetails.setId(id);
    		categoryRepository.save(categoryDetails);
    		return categoryDetails;
    		
    	}
    	return null;
    }

    public void deleteCategory(int id) {
       
    	Optional<Category> cat= categoryRepository.findById(id);
    	
    	if(cat.isPresent())
    	{
    		categoryRepository.deleteById(id);
    		System.out.println("Data Deleted!.");
    	}
    }
}
