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
<<<<<<< HEAD:project/src/main/java/com/project/project/model/Person.java
	private String disease;
=======
>>>>>>> c745332f47815d0592b516eb9d54eb26bfe8477f:project/src/main/java/com/project/project/model/Person.java
	
	public Person() {
		// TODO Auto-generated method stub
	}
<<<<<<< HEAD:project/src/main/java/com/project/project/model/Person.java
	public Person(int id, String name, String phone, String email, String gender, String disease) {
=======
	public Person(int id, String name, String phone, String email, String gender) {
>>>>>>> c745332f47815d0592b516eb9d54eb26bfe8477f:project/src/main/java/com/project/project/model/Person.java
		super();
		this.id=id;
		this.name=name;
		this.phone=phone;
		this.email=email;
		this.gender=gender;
<<<<<<< HEAD:project/src/main/java/com/project/project/model/Person.java
		this.disease=disease;
=======
>>>>>>> c745332f47815d0592b516eb9d54eb26bfe8477f:project/src/main/java/com/project/project/model/Person.java
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
<<<<<<< HEAD:project/src/main/java/com/project/project/model/Person.java
	public String getDisease(){
		return disease;
	}
=======
>>>>>>> c745332f47815d0592b516eb9d54eb26bfe8477f:project/src/main/java/com/project/project/model/Person.java
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
<<<<<<< HEAD:project/src/main/java/com/project/project/model/Person.java
	public void setDisease(String disease) {
		this.disease = disease;
	}
=======
>>>>>>> c745332f47815d0592b516eb9d54eb26bfe8477f:project/src/main/java/com/project/project/model/Person.java
}
