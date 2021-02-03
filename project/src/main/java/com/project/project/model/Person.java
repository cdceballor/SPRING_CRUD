package com.project.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String phone;
	private String email;
	private String gender;
	private String disease;

	public Person() {
	}
	//https://www.youtube.com/watch?v=em5AXdz0gtY

	public Person(int id, String name, String phone, String email, String gender, String disease) {
		super();
		this.id=id;
		this.name=name;
		this.phone=phone;
		this.email=email;
		this.gender=gender;
		this.disease=disease;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail(){
		return email;
	}
	public String getGender(){
		return gender;
	}
	public String getDisease(){
		return disease;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
}
