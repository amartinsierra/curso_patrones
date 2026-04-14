package com.builder;

public class Demo {

	public static void main(String[] args) {
		Conector conector=new Conector.ConectorBuilder() //ConectorBuilder()
					.dir("http://....")
					.estado(false)
					.build();
		

	}

}
