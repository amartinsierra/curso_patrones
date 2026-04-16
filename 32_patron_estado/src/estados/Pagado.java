package estados;

import pedidos.Pedido;

public class Pagado implements Estado {
    public void pagar(Pedido pedido) {
        System.out.println("❌ Ya está pagado");
    }
    public void enviar(Pedido pedido) {
        System.out.println("📦 Pedido enviado");
        pedido.setEstado(new Enviado());
    }
}

