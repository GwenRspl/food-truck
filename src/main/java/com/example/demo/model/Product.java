package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Version;
import javax.persistence.*;

@Entity
public class Product {
	
	@Id
	private int id;
	
	private String name; 
	private double price;
	
	
	@ManyToMany
	@JoinTable(name = "product_days", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "days_id"))
	private Days days;
	
	
	@ManyToMany
	@JoinTable(name = "product_mealtypes", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "mealtypes_id"))
	private List<MealType> mealtypes;
	private int stock;
	private String description;
	private String composition;
	private int nbventes;
	
	@Version
	private int version;

	
//	ACCESSEURS 
	
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Days getDays() {
		return days;
	}

	public void setDays(Days days) {
		this.days = days;
	}

	public List<MealType> getMealtypes() {
		return mealtypes;
	}

	public void setMealtypes(List<MealType> mealtypes) {
		this.mealtypes = mealtypes;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public int getNbventes() {
		return nbventes;
	}

	public void setNbventes(int nbventes) {
		this.nbventes = nbventes;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	
	
//	CONSTRUCTEURS

	public Product(int id, String name, double price, Days days, List<MealType> mealtypes, int stock,
			String description, String composition, int nbventes, int version) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.days = days;
		this.mealtypes = mealtypes;
		this.stock = stock;
		this.description = description;
		this.composition = composition;
		this.nbventes = nbventes;
		this.version = version;
	}

	public Product() {
		super();
	}


//	TOSTRING
	
	
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", days=" + days + ", stock=" + stock
				+ ", description=" + description + ", composition=" + composition + ", nbventes=" + nbventes + "]";
	}
	
	
	
	
}
