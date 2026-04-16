package estados;

import pedidos.Pedido;

public class Nuevo implements Estado {
    public void pagar(Pedido pedido) {
        System.out.println("✅ Pedido pagado");
        pedido.setEstado(new Pagado());
    }
    public void enviar(Pedido pedido) {
        System.out.println("❌ No puedes enviar, aún no está pagado");
    }
}

