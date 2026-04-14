package com.patronfactory.client;

import com.patronfactory.dao.ProductosDao;
import com.patronfactory.factory.FactoryRegistry;

public class Demo {

	public static void main(String[] args) {
		ProductosDao productosDato=FactoryRegistry.getFactory("jdbc").create();
		

	}

}
