package com.qa.ims.controller;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.persistence.domain.Items;
import com.qa.ims.services.ItemsServices;

@RunWith(MockitoJUnitRunner.class)
public class ItemsControllerTest {
	
	@Mock
	private ItemsServices itemsServices;
	
	@Spy
	@InjectMocks
	private ItemsController itemsController;
	
	@Test
	public void readAllTest() {
		ItemsController itemsController = new ItemsController(itemsServices);
		List<Items> items = new ArrayList<>();
		items.add(new Items("Bepis", 1.00, 0));
		items.add(new Items("Robert cop 2", 3.99, 3));
		items.add(new Items("PCP Station", 19.99, 3));
		Mockito.when(itemsServices.readAll()).thenReturn(items);
		assertEquals(items, itemsController.readAll());
	}
	
	@Test
	public void createTest() {
		String name = "Robert Cop 2";
		String priceInput = "3.99";
		String ageRestrictionInput = "3";
		Mockito.doReturn(name, priceInput, ageRestrictionInput).when(itemsController).getInput();
		Items items = new Items(name, 3.99, 3);
		Items savedItems = new Items(1L, "Robert Cop 2", 3.99, 3);
		Mockito.when(itemsServices.create(items)).thenReturn(savedItems);
		assertEquals(savedItems, itemsController.create());
	}
	
	@Test
	public void updateTest() {
		String id = "1";
		String name = "7 Grand Dad";
		String price = "10.00";
		String ageRestriction = "3";
		Mockito.doReturn(id, name, price, ageRestriction).when(itemsController).getInput();
		Items items = new Items(1L, name, 10.00, 3);
		Mockito.when(itemsServices.update(items)).thenReturn(items);
		assertEquals(items, itemsController.update());
	}
	
	@Test
	public void deleteTest() {
		String id = "1";
		Mockito.doReturn(id).when(itemsController).getInput();
		itemsController.delete();
		Mockito.verify(itemsServices, Mockito.times(1)).delete(1L);
	}

}
