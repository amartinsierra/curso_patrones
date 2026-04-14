package com.patronfactory.factory;

import com.patronfactory.dao.ProductosDao;
import com.patronfactory.dao.ProductosDaoJdbc;

public class JdbcProductosDaoFactory implements ProductosDaoFactory {

	@Override
	public ProductosDao create() {
		return new ProductosDaoJdbc();
	}

}
