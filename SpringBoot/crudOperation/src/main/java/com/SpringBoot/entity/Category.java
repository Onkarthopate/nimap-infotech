package com.SpringBoot.entity;


import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;


@Entity
public class Category {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	  int id;

      String name; 
      @OneToMany( cascade = CascadeType.ALL )
      @JoinColumn(name = "catagory_id")
       List<Product> products;


      public Category() {
		// TODO Auto-generated constructor stub
	}
	public Category( String name, List<Product> products) {
		super();
		
		this.name = name;
		this.products = products;
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


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}


	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", products=" + products + "]";
	}
      
      

}
