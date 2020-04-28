package com.qa.ims.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.qa.ims.persistence.domain.Orders;
import com.qa.ims.services.CrudServices;
import com.qa.ims.utils.Utils;


public class OrdersController implements CrudController<Orders>{
	
	public static final Logger LOGGER = Logger.getLogger(OrdersController.class);
	
	private CrudServices<Orders> ordersService;
	
	public OrdersController(CrudServices<Orders> ordersService) {
		this.ordersService = ordersService;
	}
	
	String getInput() {
		return Utils.getInput();
	}

	@Override
	public List<Orders> readAll() {
		List<Orders> orders = ordersService.readAll();
		for(Orders order: orders) {
			LOGGER.info(order.toString());
		}
		return orders;
	}

	@Override
	public Orders create() {
		LOGGER.info("Please enter number of items in order");
		Integer ordersNumItems = Integer.valueOf(getInput());
		
		LOGGER.info("Please enter the items ID for the order");
		Long itemsID = Long.valueOf(getInput());
		LOGGER.info("Please enter cost of order");
		Double ordersCost = Double.valueOf(getInput());
		LOGGER.info("Please enter date of order");
		String ordersDate = getInput();
		LOGGER.info("Please enter the customer Id for this order");
		Long customerID = Long.valueOf(getInput());
		Orders order = ordersService.create(new Orders(ordersNumItems, itemsID, ordersCost, ordersDate, customerID));
		LOGGER.info("Order created");
		return order;
	}

	@Override
	public Orders update() {
		LOGGER.info("Please enter the id of the order you would like to update");
		Long id = Long.valueOf(getInput());
		LOGGER.info("Please enter number of items in order");
		Integer ordersNumItems = Integer.valueOf(getInput());
		LOGGER.info("Please enter the items ID for the order");
		Long itemsID = Long.valueOf(getInput());
		LOGGER.info("Please enter cost of order");
		Double ordersCost = Double.valueOf(getInput());
		LOGGER.info("Please enter date of order");
		String ordersDate = getInput();
		LOGGER.info("Please enter the customer Id for this order");
		Long customerID = Long.valueOf(getInput());
		Orders order = ordersService.create(new Orders(id, ordersNumItems, itemsID, ordersCost, ordersDate, customerID));
		LOGGER.info("Order updated");
		return order;
	}

	@Override
	public void delete() {
		LOGGER.info("Please enter the id of the order you would like to delete");
		Long id = Long.valueOf(getInput());
		ordersService.delete(id);
	}
	

}
