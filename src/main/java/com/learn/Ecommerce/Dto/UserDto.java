package com.learn.Ecommerce.Dto;

import com.learn.Ecommerce.validators.PasswordMatch;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//DTO- Data Transfer Obejcts
@Data
@AllArgsConstructor
@NoArgsConstructor
@PasswordMatch
public class UserDto {

	
	private String id;
	@NotNull
	@NotBlank(message = "firstname cannot be blank")
	@Size(min = 2,max = 50)
	private String firstName;
	@NotNull
	@NotBlank(message = "lastname cannot be blank")
	@Size(min = 2,max = 50)
	private String lastName;
	@NotNull
	@NotBlank(message = "emailid cannot be blank")
	@Pattern(regexp ="^((?!\\.)[\\w\\-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W])$")
	private String emailId;
	@NotNull
	@NotBlank(message = "password cannot be blank")

	@Pattern (regexp ="^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[^\\w\\d\\s:])([^\\s]){8,16}$")
	private String password;
	
	private String confirmpassword;
	@NotNull
	private String age;
	
}
