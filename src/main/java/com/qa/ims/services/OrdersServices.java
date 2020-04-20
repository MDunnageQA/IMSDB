package com.qa.ims.services;

import java.util.List;

import com.qa.ims.persistence.dao.Dao;
import com.qa.ims.persistence.domain.Orders;

public class OrdersServices implements CrudServices<Orders>{
	
	private Dao<Orders> ordersDao;
	
	public OrdersServices(Dao<Orders> ordersDao) {
		this.ordersDao = ordersDao;
	}

	@Override
	public List<Orders> readAll() {
		return ordersDao.readAll();
	}

	@Override
	public Orders create(Orders orders) {
		return ordersDao.create(orders);
	}

	@Override
	public Orders update(Orders orders) {
		return ordersDao.update(orders);
	}

	@Override
	public void delete(Long id) {
		ordersDao.delete(id);
	}

}
