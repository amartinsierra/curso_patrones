package com.patronfactory.factory;

import com.patronfactory.dao.ProductosDao;
import com.patronfactory.dao.ProductosDaoJpa;

public class JpaProductosDaoFactory implements ProductosDaoFactory {

	@Override
	public ProductosDao create() {
		return new ProductosDaoJpa();
	}

}
