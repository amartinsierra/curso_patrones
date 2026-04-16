package mediator;

import model.Usuario;

public interface ChatMediator {
    void enviarMensaje(String mensaje, Usuario emisor);
    void registrarUsuario(Usuario usuario);
}
