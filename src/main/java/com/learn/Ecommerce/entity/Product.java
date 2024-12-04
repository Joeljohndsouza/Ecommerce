package com.learn.Ecommerce.entity;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Table(name = "product_details") will help to change table name
//@Table(name = "table-name")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_details")


public class Product {
	@Id
	private int productId;
	@Column(nullable = false)
	private String productName;
	@Column(nullable = false)
	private String description;
	@Column(nullable = false)
	private int productprice;
	@ManyToOne
	private Category category;
	
	@ManyToMany()
	private List<Order> orders;

}
