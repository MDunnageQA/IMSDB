package com.qa.ims.persistence.domain;
import java.util.ArrayList;

public class Orders {
	
	private long id;
	private int ordersNumItems;
	private double ordersCost;
	private String ordersDate;
	private long customerID;
	private ArrayList<Long> customerid = new ArrayList<Long>();
	
	public Orders(long id, int ordersNumItems, double ordersCost, String ordersDate) {
		this.id = id;
		this.ordersNumItems = ordersNumItems;
		this.ordersCost = ordersCost;
		this.ordersDate = ordersDate;
	}

	public Orders(int ordersNumItems, double ordersCost, String ordersDate) {
		this.ordersNumItems = ordersNumItems;
		this.ordersCost = ordersCost;
		this.ordersDate = ordersDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public int getOrdersNumItems() {
		return ordersNumItems;
	}

	public void setOrdersNumItems(int ordersNumItems) {
		this.ordersNumItems = ordersNumItems;
	}
	
	public double getOrdersCost() {
		return ordersCost;
	}
	
	public void setOrdersCost(double ordersCost) {
		this.ordersCost = ordersCost;
	}

	public String getOrdersDate() {
		return ordersDate;
	}

	public void setOrdersDate(String ordersDate) {
		this.ordersDate = ordersDate;
	}
	
	public long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(long customerID) {
		this.customerID = customerID;
	}
	
	

	public String toString() {
		return "id:" + id + " order cost:" + ordersCost + " order date " + ordersDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (customerID ^ (customerID >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		long temp;
		temp = Double.doubleToLongBits(ordersCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((ordersDate == null) ? 0 : ordersDate.hashCode());
		result = prime * result + ordersNumItems;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orders other = (Orders) obj;
		if (customerID != other.customerID)
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(ordersCost) != Double.doubleToLongBits(other.ordersCost))
			return false;
		if (ordersDate == null) {
			if (other.ordersDate != null)
				return false;
		} else if (!ordersDate.equals(other.ordersDate))
			return false;
		if (ordersNumItems != other.ordersNumItems)
			return false;
		return true;
	}
	

	

}
