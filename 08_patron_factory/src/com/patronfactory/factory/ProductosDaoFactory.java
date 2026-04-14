package com.patronfactory.factory;

import com.patronfactory.dao.ProductosDao;

public interface ProductosDaoFactory {
	ProductosDao create();
}
