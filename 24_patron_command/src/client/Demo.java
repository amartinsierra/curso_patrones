package client;

import service.PedidoService;

public class Demo {

	public static void main(String[] args) {
		var pedidoService=new PedidoService();
		pedidoService.crearPedido("pedido 1");

	}

}
