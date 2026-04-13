package com.prototype.client;

import java.util.ArrayList;
import java.util.List;

import com.prototype.Libro;
import com.prototype.model.Formato;

public class Demo {

	public static void main(String[] args) {
		Libro prototipo=new Libro("titulo test", "1111A", "anónimo",
				new ArrayList<Formato>(List.of(new Formato("Físico",100),new Formato("Digital",20))));
		Libro c1=prototipo.clone();
		Libro c2=prototipo.clone();
		
		c2.setIsbn("2222B");
		c2.getFormatos().remove(1);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1==prototipo);

	}

}
