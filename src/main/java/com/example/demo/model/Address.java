package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	private int number;
	private String street;
	private String zipCode;
	private String city;
	private String country;
	private boolean isBillingAdress;

	@Version
	private int version;

	public Address() {
	}

	public Address(int id, User user, int number, String street, String zipCode, String city, String country,
			boolean isBillingAdress) {
		this.id = id;
		this.user = user;
		this.number = number;
		this.street = street;
		this.zipCode = zipCode;
		this.city = city;
		this.country = country;
		this.isBillingAdress = isBillingAdress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isBillingAdress() {
		return isBillingAdress;
	}

	public void setBillingAdress(boolean isBillingAdress) {
		this.isBillingAdress = isBillingAdress;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
