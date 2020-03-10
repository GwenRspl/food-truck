package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Gender {
	
	@Id
	private int id;
	private String gendername;
	
	@OneToMany(mappedBy="gender")
	private List<User> user;
	private int version;
	
	
//	ACCESSEURS
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	public String getGendername() {
		return gendername;
	}
	public void setGendername(String gendername) {
		this.gendername = gendername;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}

	
//	CONSTRUCTEURS 
	
	public Gender(int id, String gendername, int version) {
		super();
		this.id = id;
		this.gendername = gendername;
		this.version = version;
	}

	
//	TOSTRING
	
	@Override
	public String toString() {
		return "Gender [id=" + id + ", gendername=" + gendername + "]";
	}
	
	
	
}
