package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Days {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String jour;

	@JsonIgnore
	@ManyToMany(mappedBy = "days")
	private List<Product> product;

	@Version
	private int version;

	// ACCESSEURS

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

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	// CONSTRUCTEURS

	public Days(int id, String jour) {
		super();
		this.id = id;
		this.jour = jour;
	}

	public Days() {
		super();
	}

	// TOSTRING

	@Override
	public String toString() {
		return "Days [id=" + id + ", jour=" + jour + "]";
	}

}
