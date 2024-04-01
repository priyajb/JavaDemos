package com.insuranceapp.model;

import java.util.List;

public class AppUser {
	private String username;
	private String password;
	private String email;
	private Integer userId;
	private List<String> authorities;
	public AppUser() {
		super();
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public List<String> getAuthorities() {
		return authorities;
	}
	public void setAuthorities(List<String> authorities) {
		this.authorities = authorities;
	}
	public AppUser(String username, String password, String email, Integer userId, List<String> authorities) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.userId = userId;
		this.authorities = authorities;
	}
	@Override
	public String toString() {
		return "AppUser [username=" + username + ", password=" + password + ", email=" + email + ", userId=" + userId
				+ ", authorities=" + authorities + "]";
	}
}