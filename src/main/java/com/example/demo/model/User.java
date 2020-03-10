package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	private int id;
	private String name;
	private String firstname;
	private Date birthday;
	private String password;
	private String phonenumber;
	private String email;
	
	
	@ManyToOne 
	@JoinColumn(name="gender_id") 
	private Gender gender;
//	private Address address;
	@ManyToOne 
	@JoinColumn(name="society_id")
	private Society society;
	
	@ManyToOne 
	@JoinColumn(name="profile_id")
	private Profile profile;
	
	
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
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
//	@OneToMany(mappedBy="User")
//	public Address getAddress() {
//		return address;
//	}
//	public void setAdress(Address adress) {
//		this.address = address;
//	}
	
	
	public Society getSociety() {
		return society;
	}
	public void setSociety(Society society) {
		this.society = society;
	}
	
	
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

//	CONSTRUCT
	
	public User(int id, String name, String firstname, Date birthday, String password, String phonenumber,
			Gender gender, Society society, Profile profile, String email) {
		super();
		this.id = id;
		this.name = name;
		this.firstname = firstname;
		this.birthday = birthday;
		this.password = password;
		this.phonenumber = phonenumber;
		this.gender = gender;
//		this.address = address;
		this.society = society;
		this.profile = profile;
		this.email = email;
	}
	
	public User() {
		super();
	}
	

	
//	TOSTRING
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", firstname=" + firstname + ", birthday=" + birthday
				+ ", password=" + password + ", phonenumber=" + phonenumber + ", gender=" + gender + ", society="
				+ society + ", profile=" + profile + ", email=" + email + "]";
	}
	


}
