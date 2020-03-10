package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Profile {
	@Id
	@GeneratedValue
	private int id;
	private String role;
	
	@OneToMany(mappedBy="profile")
	private List<User> user;
	private int version;
	
	
//	ACCESSEURS
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}

	
//	CONSTRUCTEURS
	
	public Profile(int id, String role, int version) {
		super();
		this.id = id;
		this.role = role;
		this.version = version;
	}
	public Profile() {
		super();
	}

	
//	TOSTRING
	
	@Override
	public String toString() {
		return "Profile [id=" + id + ", role=" + role + "]";
	}
	
	
	
	
	
	
}
