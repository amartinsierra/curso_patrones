package com.prototype;

import java.util.ArrayList;
import java.util.List;

import com.prototype.model.Formato;

public class Libro implements Cloneable{
	private String titulo;
	private String isbn;
	private String autor;
	private List<Formato> formatos;
	
	public Libro(String titulo, String isbn, String autor, ArrayList<Formato> formatos) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.formatos = formatos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public List<Formato> getFormatos() {
		return formatos;
	}

	public void setFormatos(List<Formato> formatos) {
		this.formatos = formatos;
	}

	@Override //(de Object)
	public Libro clone() {
		try {
			//llamada al método clone() heredado de Object
			return (Libro)super.clone();
		}catch(CloneNotSupportedException ex) {
			throw new AssertionError();
		}
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", formatos="+formatos+"]";
	}
}
