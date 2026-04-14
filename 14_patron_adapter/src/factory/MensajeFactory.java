package factory;

import adaptador.Adapter;
import interfaz.Mensaje;
import legacy.Info;

public class MensajeFactory {
	public static Mensaje crearMensaje() {
		return new Adapter(new Info());
	}
}
