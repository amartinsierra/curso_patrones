package com.prototype.model;

public class Formato implements Cloneable{
	private String tipo;
	private int duracion;
	public Formato(String tipo, int duracion) {
		super();
		this.tipo = tipo;
		this.duracion = duracion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	
	@Override
	protected Formato clone() {
		// TODO Auto-generated method stub
		try {
			return (Formato)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public String toString() {
		return "Formato [tipo=" + tipo + ", duracion=" + duracion + "]";
	}
	
	
	
}
