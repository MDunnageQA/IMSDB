package com.qa.ims.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.qa.ims.persistence.domain.Items;
import com.qa.ims.services.CrudServices;
import com.qa.ims.utils.Utils;

public class ItemsController implements CrudController<Items>{
	
public static final Logger LOGGER = Logger.getLogger(ItemsController.class);
	
	private CrudServices<Items> itemsService;
	
	public ItemsController(CrudServices<Items> itemsService) {
		this.itemsService = itemsService;
	}
	

	String getInput() {
		return Utils.getInput();
	}

	@Override
	public List<Items> readAll() {
		List<Items> items = itemsService.readAll();
		for(Items item: items) {
			LOGGER.info(item.toString());
		}
		return items;
	}

	@Override
	public Items create() {
		LOGGER.info("Please enter a name");
		String name = getInput();
		LOGGER.info("Please enter item price");
		Double itemsPrice = Double.valueOf(getInput());
		LOGGER.info("Please enter item's age restriction");
		Integer itemsAgeRestriction = Integer.valueOf(getInput());
		Items item = itemsService.create(new Items(name, itemsPrice, itemsAgeRestriction));
		LOGGER.info("Item created");
		return item;
	}

	@Override
	public Items update() {
		LOGGER.info("Please enter the id of the item you would like to update");
		Long id = Long.valueOf(getInput());
		LOGGER.info("Please enter item name");
		String name = getInput();
		LOGGER.info("Please enter item's price");
		Double itemsPrice = Double.valueOf(getInput());
		LOGGER.info("Please enter item's age restriction");
		Integer itemsAgeRestriction = Integer.valueOf(getInput());
		Items item = itemsService.update(new Items(id, name, itemsPrice, itemsAgeRestriction));
		LOGGER.info("Item Updated");
		return item;
	}

	@Override
	public void delete() {
		LOGGER.info("Please enter the id of the item you would like to delete");
		Long id = Long.valueOf(getInput());
		itemsService.delete(id);
	}
	
	

}
