package com.example.spring_crud_app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;*/

/*import org.hibernate.annotations.GenericGenerator;*/
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

//@Data
//@NoArgsConstructor
//@Entity
//@AllArgsConstructor
//@Table(name = "employee")

@Document(collection = "employee")
public class Employee {
	//@Id
	//@GeneratedValue
   // @GenericGenerator(name = "system-uuid", strategy = "uuid")
	private int id;
	
	
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String name;


	private String code;
	private String address;
}
