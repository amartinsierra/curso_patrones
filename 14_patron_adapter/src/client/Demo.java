package client;

import factory.MensajeFactory;
import interfaz.Mensaje;

public class Demo {
	public static void main(String[] args) {
        // Obtenemos un objeto Mensaje a través del factory method
        Mensaje mensaje = MensajeFactory.crearMensaje();

        // Usamos el adaptador como si fuera un Mensaje
        mensaje.send("Hola mundo");
        mensaje.send("Patrón Adapter con Factory Method");

    }
}
