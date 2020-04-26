package com.qa.ims.controller;

/*import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.persistence.domain.Orders;
import com.qa.ims.services.OrdersServices;

public class OrdersControllerTest {
	
	@Mock
	private OrdersServices ordersServices;
	
	@Spy
	@InjectMocks
	private OrdersController ordersController;
	
	@Test
	public void readAllTest() {
		OrdersController ordersController = new OrdersController(ordersServices);
		List<Orders> orders = new ArrayList<>();
		orders.add(new Orders(3, 1L, 34.99, "14/01/2020", 1L));
		orders.add(new Orders(1, 3L, 10.99, "16/01/2020", 2L));
		orders.add(new Orders(6, 5L, 124.99, "25/01/2020", 1L));
		Mockito.when(ordersServices.readAll()).thenReturn(orders);
		assertEquals(orders, ordersController.readAll());
	}
	
	@Test
	public void createTest() {
		String ordersNumItems = "3";
		String itemsID = "1";
		String ordersCost = "34.99";
		String ordersDate = "20/04/2020";
		String customerID = "1";
		Mockito.doReturn(ordersNumItems, itemsID, ordersCost, ordersDate, customerID).when(ordersController).getInput();
		Orders orders = new Orders(3, 1L, 34.99, ordersDate, 1L);
		Orders savedOrders = new Orders(3, 1L, 34.99, ordersDate, 1L);
		Mockito.when(ordersServices.create(orders)).thenReturn(savedOrders);
		assertEquals(savedOrders, ordersController.create());
	}
	
	@Test
	public void updateTest() {
		String id = "1";
		String ordersNumItems = "3";
		String itemsID = "1";
		String ordersCost = "34.99";
		String ordersDate = "20/04/2020";
		String customerID = "1";
		Mockito.doReturn(id, ordersNumItems, itemsID, ordersCost, ordersDate, customerID).when(ordersController).getInput();
		Orders orders = new Orders(1L, 3, 1L, 34.99, ordersDate, 1L);
		Mockito.when(ordersServices.update(orders)).thenReturn(orders);
		assertEquals(orders, ordersController.update());
	}
	
	@Test
	public void deleteTest() {
		String id = "1";
		Mockito.doReturn(id).when(ordersController).getInput();
		ordersController.delete();
		Mockito.verify(ordersServices, Mockito.times(1)).delete(1L);
	}

}*/
