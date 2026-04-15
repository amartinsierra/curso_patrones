package comandos;

import model.Producto;
import repository.ProductoRepository;

public class CreateOrderCommand implements Command {
    private final ProductoRepository orderRepository;
    private Producto producto;
    public CreateOrderCommand(ProductoRepository orderRepository,Producto prod) {
        this.orderRepository = orderRepository;
        this.producto=producto;
    }
    @Override
    public void execute() {
        System.out.println("Pedido creado.");
        // lógica real: 
        orderRepository.save(producto);
    }
} 
