package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Version;

@Entity
public class MealTime {
	@Id
	@GeneratedValue
	private int id;

	private String label;

	private boolean active;

	@ManyToMany
	@JoinTable(name = "mealtime_mealtype", joinColumns = @JoinColumn(name = "mealtime_id"), inverseJoinColumns = @JoinColumn(name = "mealtype_id"))
	private List<MealType> mealTypes;

	@Version
	private int version;

	public MealTime() {
	}

	public MealTime(int id, String label, boolean active, List<MealType> mealTypes, int version) {
		this.id = id;
		this.label = label;
		this.active = active;
		this.mealTypes = mealTypes;
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

	public List<MealType> getMealTypes() {
		return mealTypes;
	}

	public void setMealTypes(List<MealType> mealTypes) {
		this.mealTypes = mealTypes;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "MealTime [id=" + id + ", label=" + label + ", active=" + active + ", mealTypes=" + mealTypes + "]";
	}

}
