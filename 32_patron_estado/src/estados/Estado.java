package estados;

import pedidos.Pedido;

public interface Estado {
    void pagar(Pedido pedido);
    void enviar(Pedido pedido);
}
