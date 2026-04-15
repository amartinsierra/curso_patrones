package service;

import comandos.CommandDispatcher;
import comandos.CreateOrderCommand;
import comandos.SendConfirmationEmailCommand;
import comandos.StockCommand;
import model.Producto;
import repository.ProductoRepository;

public class PedidoService {
    private final CommandDispatcher dispatcher = new CommandDispatcher();
    private final ProductoRepository repository= new ProductoRepository();
   

    public void crearPedido(String pedidoId) {
        System.out.println("Pedido creado: " + pedidoId);

        // Encapsulamos las operaciones como comandos
        dispatcher.addCommand(new StockCommand());
        dispatcher.addCommand(new CreateOrderCommand(repository,new Producto()));
        dispatcher.addCommand(new SendConfirmationEmailCommand());

        // Ejecutamos los comandos
        dispatcher.dispatch();
    }
}

