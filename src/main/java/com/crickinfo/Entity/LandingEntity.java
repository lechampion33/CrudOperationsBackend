package com.crickinfo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Land")
public class LandingEntity {
   @Id
   @GeneratedValue
   private int id;
   private String name;
   private String country;
   private String franchise;
@Override
public String toString() {
	return "LandingEntity [id=" + id + ", name=" + name + ", country=" + country + ", franchise=" + franchise + "]";
}
public LandingEntity() {
	super();
}
public LandingEntity(int id, String name, String country, String franchise) {
	super();
	this.id = id;
	this.name = name;
	this.country = country;
	this.franchise = franchise;
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
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getFranchise() {
	return franchise;
}
public void setFranchise(String franchise) {
	this.franchise = franchise;
}
}
