package com.SpringBoot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.entity.Category;
import com.SpringBoot.entity.Product;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer>  {
}


