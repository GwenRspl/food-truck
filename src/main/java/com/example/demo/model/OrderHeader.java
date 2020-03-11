package com.example.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class OrderHeader {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	private Date orderDate;

	private double totalPrice;

	@ManyToOne
	@JoinColumn(name = "delivery_address_id")
	private Address deliveryAddress;

	@ManyToOne
	@JoinColumn(name = "billing_address_id")
	private Address billingAddress;

	private int receiptNumber;

	private boolean isDelivered;

	@ManyToOne
	@JoinColumn(name = "mealtime_id")
	private MealTime mealTime;

	@OneToMany(mappedBy = "orderHeader")
	private List<OrderLine> orderLines;

	@Version
	private int version;

	public OrderHeader() {
	}

	public OrderHeader(int id, User user, Date orderDate, double totalPrice, Address deliveryAddress,
			Address billingAddress, int receiptNumber, boolean isDelivered, MealTime mealTime,
			List<OrderLine> orderLines) {
		this.id = id;
		this.user = user;
		this.orderDate = orderDate;
		this.totalPrice = totalPrice;
		this.deliveryAddress = deliveryAddress;
		this.billingAddress = billingAddress;
		this.receiptNumber = receiptNumber;
		this.isDelivered = isDelivered;
		this.mealTime = mealTime;
		this.orderLines = orderLines;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Address getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public int getReceiptNumber() {
		return receiptNumber;
	}

	public void setReceiptNumber(int receiptNumber) {
		this.receiptNumber = receiptNumber;
	}

	public boolean isDelivered() {
		return isDelivered;
	}

	public void setDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}

	public MealTime getMealTime() {
		return mealTime;
	}

	public void setMealTime(MealTime mealTime) {
		this.mealTime = mealTime;
	}

	public List<OrderLine> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
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
