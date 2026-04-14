package com.patronfactory.dao;

import java.util.List;

import com.patronfactory.model.Producto;

public class ProductosDaoJpa implements ProductosDao {

	@Override
	public Producto save(Producto producto) {
		System.out.println("Salvando producto con JPA");
		return null;
	}

	@Override
	public List<Producto> findByCategory(String category) {
		System.out.println("Buscando producto con JPA");
		return null;
	}

}
