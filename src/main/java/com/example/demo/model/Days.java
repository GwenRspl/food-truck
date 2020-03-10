package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Version;

@Entity
public class Days {
	
	@Id
	private int id;
	private String jour;
	
	@ManyToMany(mappedBy = "days")
	private Product product;
	
	
	@Version
	private int version;

//ACCESSEURS 
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getJour() {
		return jour;
	}


	public void setJour(String jour) {
		this.jour = jour;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}

//CONSTRUCTEURS
	
	public Days(int id, String jour) {
		super();
		this.id = id;
		this.jour = jour;
	}


	public Days() {
		super();
	}
	
//	TOSTRING
	
	
	
	
	
	
	
}
