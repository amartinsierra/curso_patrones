package client;

import service.UsuarioService;

public class Demo {

	public static void main(String[] args) {
		var service=new UsuarioService();
		System.out.println("Por departamento: "+service.buscar("departamento", "ADMIN"));
		System.out.println("Por nombre: "+service.buscar("nombre", "Ana"));

	}

}
