package com.crickinfo.Entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="signup")
public class signupEntity {
  @Id
  private int id;
  private String firstname;
  private String lastname;
  private String email;
  private String phone;
  private int age;
@Override
public String toString() {
	return "signupEntity [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
			+ ", phone=" + phone + ", age=" + age + "]";
}
public signupEntity() {
	super();
}
public signupEntity(int id, String firstname, String lastname, String email, String phone, int age) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.phone = phone;
	this.age = age;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
