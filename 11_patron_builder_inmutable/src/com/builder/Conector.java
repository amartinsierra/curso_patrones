package com.builder;

public class Conector {
    private final String modo;
    private final int tipo;
    private final String dir;
    private final boolean estado;
    private final String protocolo;
    public Conector(ConectorBuilder builder) {
    	this.modo=builder.modo;
    	//inicializa atributos
    	this.tipo=builder.tipo;
    	this.dir=builder.dir;
    	this.estado=builder.estado;
    	this.protocolo=builder.protocolo;
    	
    }
    
	public String getModo() {
		return modo;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public String getDir() {
		return dir;
	}
	
	public boolean isEstado() {
		return estado;
	}
	
	public String getProtocolo() {
		return protocolo;
	}
	
	public static class ConectorBuilder {
		private  String modo;
	    private  int tipo;
	    private  String dir;
	    private  boolean estado;
	    private  String protocolo;
	    
	    public ConectorBuilder modo(String modo) {
	        this.modo=modo;
	        return this;
	    }
	    public ConectorBuilder tipo(int tipo) {
	    	this.tipo=tipo<0?0:tipo;
	        return this;
	    }
	    public ConectorBuilder dir(String dir) {
	        this.dir=dir;
	        return this;
	    }
	    public ConectorBuilder estado(boolean estado) {
	        this.estado=estado;
	        return this;
	    }
	    public ConectorBuilder protocolo(String protocolo) {
	        this.protocolo=protocolo;
	        return this;
	    }
	    public Conector build() {
	        return new Conector(this);
	    }     
	}

    
}
