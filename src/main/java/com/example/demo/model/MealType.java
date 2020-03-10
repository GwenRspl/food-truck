package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Version;

@Entity
public class MealType {
	@Id
	@GeneratedValue
	private int id;

	private String label;

	private boolean active;

	@ManyToMany(mappedBy = "mealTypes")
	private List<MealTime> mealTimes;

	@ManyToMany(mappedBy = "mealtypes")
	private List<Product> products;

	@Version
	private int version;

	public MealType() {
	}

	public MealType(int id, String label, boolean active, List<MealTime> mealTimes, List<Product> products,
			int version) {
		this.id = id;
		this.label = label;
		this.active = active;
		this.mealTimes = mealTimes;
		this.products = products;
		this.version = version;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<MealTime> getMealTimes() {
		return mealTimes;
	}

	public void setMealTimes(List<MealTime> mealTimes) {
		this.mealTimes = mealTimes;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "MealType [id=" + id + ", label=" + label + ", active=" + active + "]";
	}

}
