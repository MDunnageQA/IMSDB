package com.qa.ims.persistence.domain;

public class Orders {
	
	private long id;
	private double ordersCost;
	private String date;
	
	public Orders(long id, double ordersCost, String date) {
		this.id = id;
		this.ordersCost = ordersCost;
		this.date = date;
	}
	
	public Orders(double ordersCost, String date) {
		this.ordersCost = ordersCost;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public double getOrdersCost() {
		return ordersCost;
	}
	
	public void setOrdersCost(double ordersCost) {
		this.ordersCost = ordersCost;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		long temp;
		temp = Double.doubleToLongBits(ordersCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(ordersCost) != Double.doubleToLongBits(other.ordersCost))
			return false;
		return true;
	}
	
	

}
