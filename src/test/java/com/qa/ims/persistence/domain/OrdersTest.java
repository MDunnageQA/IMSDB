package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
	
public class OrdersTest {
	
	private Orders orders;
	private Orders other;
	
	@Before
	public void setUp() {
		orders = new Orders(1L, 1, 1L, 24.99, "20/04/2020", 1L);
		other = new Orders(1L, 1, 1L, 24.99, "20/04/2020", 1L);
	}
	
	@Test
	public void settersTest() {
		assertNotNull(orders.getId());
		assertNotNull(orders.getOrdersNumItems());
		assertNotNull(orders.getItemsID());
		assertNotNull(orders.getOrdersCost());
		assertNotNull(orders.getOrdersDate());
		assertNotNull(orders.getCustomerID());
	}
	
/*	@Test
	public void gettersTest() {
		orders.setId(null);
		assertNull(orders.getId());
		orders.setOrdersNumItems(null);
		assertNull(orders.getOrdersNumItems());
		orders.setItemsID(null);
		assertNull(orders.getItemsID());
		orders.setOrdersCost(null);
		assertNull(orders.getOrdersCost());		
		orders.setOrdersDate(null);
		assertNull(orders.getOrdersDate());
		orders.setCustomerID(null);
		assertNull(orders.getCustomerID());
	}*/
	
	@Test
	public void equalsWithNull() {
		assertFalse(orders.equals(null));
	}
	
	@Test
	public void equalsWithDifferentObject() {
		assertFalse(orders.equals(new Object()));
	}
	
	@Test
	public void createordersWithId() {
		assertEquals(1L, orders.getId(), 0);
		assertEquals(1, orders.getOrdersNumItems(), 0);
		assertEquals(1L, orders.getItemsID(), 0);
		assertEquals(24.99, orders.getOrdersCost(), 0);
		assertEquals("20/04/2020", orders.getOrdersDate());
		assertEquals(1L, orders.getCustomerID(), 0);
		
	}
	
	@Test
	public void checkEquality() {
		assertTrue(orders.equals(orders));
	}
	
	@Test
	public void checkEqualityBetweenDifferentObjects() {
		assertTrue(orders.equals(other));
	}
	
	@Test
	public void ordersNumItemsNullButOtherNumITemsNotNull() {
		orders.setOrdersNumItems(null);
		assertFalse(orders.equals(other));
	}
	
	@Test
	public void ordersNumItemsNotEqual() {
		other.setOrdersNumItems(4);
		assertFalse(orders.equals(other));
	}
	
	@Test
	public void checkEqualityBetweenDifferentObjectsNullNumItems() {
		orders.setOrdersNumItems(null);
		other.setOrdersNumItems(null);
		assertTrue(orders.equals(other));
	}
	
	@Test
	public void nullId() {
		orders.setId(null);
		assertFalse(orders.equals(other));
	}
	
	@Test
	public void nullIdOnBoth() {
		orders.setId(null);
		other.setId(null);
		assertTrue(orders.equals(other));
	}
	
	@Test
	public void otherIdDifferent() {
		other.setId(2L);
		assertFalse(orders.equals(other));
	}
	
	@Test
	public void nullItemsID() {
		orders.setItemsID(null);
		assertFalse(orders.equals(other));
	}
	
	@Test
	public void nullItemsIDOnBoth() {
		orders.setItemsID(null);
		other.setItemsID(null);
		assertTrue(orders.equals(other));
	}
	
	@Test
	public void otherPriceDifferent() {
		other.setItemsID(2L);
		assertFalse(orders.equals(other));
	}
	
/*	@Test
	public void nullOrdersCost() {
		orders.setOrdersCost(null);
		assertFalse(orders.equals(other));
	}
	
	@Test
	public void nullOrdersCostOnBoth() {
		orders.setOrdersCost(null);
		other.setOrdersCost(null);
		assertTrue(orders.equals(other));
	}*/
	
	@Test
	public void otherOrdersCostDifferent() {
		other.setOrdersCost(99.99);
		assertFalse(orders.equals(other));
	}
	
	@Test
	public void nullOrdersDate() {
		orders.setOrdersDate(null);
		assertFalse(orders.equals(other));
	}
	
	@Test
	public void nullOrdersDateOnBoth() {
		orders.setOrdersDate(null);
		other.setOrdersDate(null);
		assertTrue(orders.equals(other));
	}
	
	@Test
	public void otherOrdersDateDifferent() {
		other.setOrdersDate("21/05/2020");
		assertFalse(orders.equals(other));
	}
	
	@Test
	public void nullCustomerID() {
		orders.setCustomerID(null);
		assertFalse(orders.equals(other));
	}
	
	@Test
	public void nullCustomerIDOnBoth() {
		orders.setCustomerID(null);
		other.setCustomerID(null);
		assertTrue(orders.equals(other));
	}
	
	@Test
	public void otherCustomerIDDifferent() {
		other.setCustomerID(4L);
		assertFalse(orders.equals(other));
	}
	
	@Test
	public void constructorWithoutId() {
		Orders orders = new Orders(1, 1L, 24.99, "20/04/2020", 1L);
		assertNotNull(orders.getOrdersNumItems());
		assertNotNull(orders.getItemsID());
		assertNotNull(orders.getOrdersCost());
		assertNotNull(orders.getOrdersDate());
		assertNotNull(orders.getCustomerID());
	}
	
	@Test
	public void hashCodeTest() {
		assertEquals(orders.hashCode(), other.hashCode());
	}
}
