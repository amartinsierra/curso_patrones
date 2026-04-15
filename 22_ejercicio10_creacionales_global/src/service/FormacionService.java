package service;

import composite.Categoria;
import composite.Curso;
import composite.CursoComponente;

public class FormacionService {
	public Curso crearCurso(String nombre, double precio) {
		return new Curso(nombre, precio);
	}
	public Categoria crearCategoria(String nombre, CursoComponente... componentes) {
		Categoria categoria=new Categoria(nombre);
		for(CursoComponente curso:componentes) {
			categoria.agregar(curso);
		}
		return categoria;
	}
}
