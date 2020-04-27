package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
	
public class ItemsTest {
	
	private Items items;
	private Items other;
	
	@Before
	public void setUp() {
		items = new Items(1L, "Spoderman Akshun Figurr", 6.99, 3);
		other = new Items(1L, "Spoderman Akshun Figurr", 6.99, 3);
	}
	
	@Test
	public void settersTest() {
		assertNotNull(items.getId());
		assertNotNull(items.getName());
		assertNotNull(items.getItemsPrice());
		assertNotNull(items.getItemsAgeRestriction());
	}
	
	@Test
	public void gettersTest() {
		items.setId(null);
		assertNull(items.getId());
		items.setName(null);
		assertNull(items.getName());
		items.setItemsPrice(null);
		assertNull(items.getItemsPrice());
		items.setItemsAgeRestriction(null);
		assertNull(items.getItemsAgeRestriction());		
	}
	
	@Test
	public void equalsWithNull() {
		assertFalse(items.equals(null));
	}
	
	@Test
	public void equalsWithDifferentObject() {
		assertFalse(items.equals(new Object()));
	}
	
/*	@Test
	public void createItemsWithId() {
		assertEquals(1L, items.getId(), 0);
		assertEquals("Spook Chasers", items.getName());
		assertEquals(11.99, items.getItemsPrice(), 0);
		assertEquals(3, items.getItemsAgeRestriction(), 0);
	}*/
	
	@Test
	public void checkEquality() {
		assertTrue(items.equals(items));
	}
	
	@Test
	public void checkEqualityBetweenDifferentObjects() {
		assertTrue(items.equals(other));
	}
	
	@Test
	public void itemsNameNullButOtherNameNotNull() {
		items.setName(null);
		assertFalse(items.equals(other));
	}
	
	@Test
	public void itemsNamesNotEqual() {
		other.setName("Tom Nook's enforced labour: the game");
		assertFalse(items.equals(other));
	}
	
	@Test
	public void checkEqualityBetweenDifferentObjectsNullName() {
		items.setName(null);
		other.setName(null);
		assertTrue(items.equals(other));
	}
	
	@Test
	public void nullId() {
		items.setId(null);
		assertFalse(items.equals(other));
	}
	
	@Test
	public void nullIdOnBoth() {
		items.setId(null);
		other.setId(null);
		assertTrue(items.equals(other));
	}
	
	@Test
	public void otherIdDifferent() {
		other.setId(2L);
		assertFalse(items.equals(other));
	}
	
/*	@Test
	public void nullPrice() {
		items.setItemsPrice(null);
		assertFalse(items.equals(other));
	}*/
	
/*	@Test
	public void nullPriceOnBoth() {
		items.setItemsPrice(null);
		other.setItemsPrice(null);
		assertTrue(items.equals(other));
	}*/
	
	@Test
	public void otherPriceDifferent() {
		other.setItemsPrice(99.99);
		assertFalse(items.equals(other));
	}
	
	@Test
	public void nullAgeRestriction() {
		items.setItemsAgeRestriction(null);
		assertFalse(items.equals(other));
	}
	
	@Test
	public void nullAgeRestrictionOnBoth() {
		items.setItemsAgeRestriction(null);
		other.setItemsAgeRestriction(null);
		assertTrue(items.equals(other));
	}
	
	@Test
	public void otherAgeRestrictionDifferent() {
		other.setItemsAgeRestriction(10);
		assertFalse(items.equals(other));
	}
	
	@Test
	public void constructorWithoutId() {
		Items items = new Items("Fateful Findings", 44.99, 18);
		assertNotNull(items.getName());
		assertNotNull(items.getItemsPrice());
		assertNotNull(items.getItemsAgeRestriction());
	}
	
	@Test
	public void hashCodeTest() {
		assertEquals(items.hashCode(), other.hashCode());
	}
}
