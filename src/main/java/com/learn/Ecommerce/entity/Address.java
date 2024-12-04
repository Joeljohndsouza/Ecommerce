package com.learn.Ecommerce.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	
private int addressId;

private String addressLine1;

private String addressLine2;

private String city;

private String state;

private String pincode;

}
