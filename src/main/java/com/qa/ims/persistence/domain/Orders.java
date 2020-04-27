package com.qa.ims.persistence.domain;

public class Orders {
	
	private Long id;
	private Integer ordersNumItems;
	private Long itemsID;
	private Double ordersCost;
	private String ordersDate;
	private Long customerID;
	
	public Orders(Long id, Integer ordersNumItems,Long itemsID, Double ordersCost, String ordersDate, Long customerID) {
		this.id = id;
		this.ordersNumItems = ordersNumItems;
		this.itemsID = itemsID;
		this.ordersCost = ordersCost;
		this.ordersDate = ordersDate;
		this.customerID = customerID;
		
	}

	public Orders(Integer ordersNumItems, Long itemsID, Double ordersCost, String ordersDate, Long customerID) {
		this.ordersNumItems = ordersNumItems;
		this.itemsID = itemsID;
		this.ordersCost = ordersCost;
		this.ordersDate = ordersDate;
		this.customerID = customerID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Integer getOrdersNumItems() {
		return ordersNumItems;
	}

	public void setOrdersNumItems(Integer ordersNumItems) {
		this.ordersNumItems = ordersNumItems;
	}
	
	public double getOrdersCost() {
		return ordersCost;
	}
	
	public void setOrdersCost(Double ordersCost) {
		this.ordersCost = ordersCost;
	}

	public String getOrdersDate() {
		return ordersDate;
	}

	public void setOrdersDate(String ordersDate) {
		this.ordersDate = ordersDate;
	}

	public Long getItemsID() {
		return itemsID;
	}

	public void setItemsID(Long itemsID) {
		this.itemsID = itemsID;
	}

	public Long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}

	public String toString() {
		return "id: " + id + ", number of items: " + ordersNumItems + ", items ID: " 
	+ itemsID + ", order cost: " + ordersCost + ", order date: " + ordersDate
	+ ", customer ID: " + customerID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (customerID ^ (customerID >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (int) (itemsID ^ (itemsID >>> 32));
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
		if (itemsID != other.itemsID)
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
