package com.patronfactory.dao;

import java.util.List;

import com.patronfactory.model.Producto;

public interface ProductosDao {
	Producto save(Producto producto);
	List<Producto> findByCategory(String category);
}
