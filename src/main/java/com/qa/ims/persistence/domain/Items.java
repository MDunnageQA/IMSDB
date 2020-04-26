package com.qa.ims.persistence.domain;

public class Items {
	
	private Long id;
	private String name;
	private Double itemsPrice;
	private Integer itemsAgeRestriction;
	
	public Items(String name, Double itemsPrice, Integer itemsAgeRestriction) {
		this.name = name;
		this.itemsPrice = itemsPrice;
		this.itemsAgeRestriction = itemsAgeRestriction;
	}
		
	public Items(Long id, String name, Double itemPrice, Integer itemsAgeRestriction) {
		this.id = id;
		this.name = name;
		this.itemsPrice = itemPrice;
		this.itemsAgeRestriction = itemsAgeRestriction;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getItemsPrice() {
		return itemsPrice;
	}
	
	public void setItemsPrice(Double itemsPrice) {
		this.itemsPrice = itemsPrice;
	}
	
	public int getItemsAgeRestriction() {
		return itemsAgeRestriction;
	}
	
	public void setItemsAgeRestriction(Integer itemsAgeRestriction) {
		this.itemsAgeRestriction = itemsAgeRestriction;
	}
	
	public String toString() {
		return "id:" + id + " name:" + name + " item price:" + itemsPrice + " age restriction "
				 + itemsAgeRestriction;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemsAgeRestriction;
		result = prime * result + (int) (id ^ (id >>> 32));
		long temp;
		temp = Double.doubleToLongBits(itemsPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Items other = (Items) obj;
		if (itemsAgeRestriction != other.itemsAgeRestriction)
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(itemsPrice) != Double.doubleToLongBits(other.itemsPrice))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}
