package com.SpringBoot.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	   int id;

	   String name;
	  
	   Double price;
	 
	
	   public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product( String name, Double price) {
		super();
		
		this.name = name;
		this.price = price;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price +  "]";
	}
}
