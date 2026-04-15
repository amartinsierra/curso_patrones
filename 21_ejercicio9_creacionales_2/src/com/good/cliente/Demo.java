package com.good.cliente;

import com.good.composite.ComponenteReproducible;
import com.good.composite.ListaReproduccion;
import com.good.fachada.StreamingFachada;

public class Demo {
	public static void main(String[] args) {
        StreamingFachada facade = new StreamingFachada();

        // Crear películas con recursos compartidos (Flyweight)
        ComponenteReproducible matrix = facade.crearPeliculaPremium("Matrix", "Español", "Inglés", true);
        ComponenteReproducible lotr = facade.crearPeliculaPremium("El Señor de los Anillos", "Español", "Inglés", false);
        ComponenteReproducible serie = facade.crearSerie("Perdidos", 2,"Español", "Inglés");

        // Crear lista de reproducción (Composite)
        ListaReproduccion lista = facade.crearLista("Favoritas", matrix, lotr,serie);

        // Reproducir lista completa
        lista.reproducir();
    }


}
