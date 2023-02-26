package com.crickinfo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="login")
public class LoginEntity {
	@Id
	private String username;
	private String password;
	@Override
	public String toString() {
		return "LoginEntity [username=" + username + ", password=" + password + "]";
	}
	public LoginEntity() {
		super();
	}
	public LoginEntity(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
