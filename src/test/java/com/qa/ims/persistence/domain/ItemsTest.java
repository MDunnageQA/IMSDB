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
		
		items.setId(null);
		assertNull(items.getId());
		items.setName(null);
		assertNull(items.getName());
		items.setItemsPrice(null);
		assertNull(items.getItemsPrice());
		items.setItemsAgeRestriction(null);
		assertNull(items.getItemsAgeRestriction());
		
		
	}
}
