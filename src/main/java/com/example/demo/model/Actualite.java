package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Actualite {
	@Id
	@GeneratedValue
	private int id;
	private String title;
	private String description;
	private String imageUrl;
	private Date dateCreation;
	private Date dateFinValidite;
	private int userCreation;

	public Actualite() {
	}

	public Actualite(int id, String title, String description, String imageUrl, Date dateCreation, Date dateFinValidite,
			int userCreation) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.imageUrl = imageUrl;
		this.dateCreation = dateCreation;
		this.dateFinValidite = dateFinValidite;
		this.userCreation = userCreation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateFinValidite() {
		return dateFinValidite;
	}

	public void setDateFinValidite(Date dateFinValidite) {
		this.dateFinValidite = dateFinValidite;
	}

	public int getUserCreation() {
		return userCreation;
	}

	public void setUserCreation(int userCreation) {
		this.userCreation = userCreation;
	}

}
