package observador;

public class Usuario implements Observer {
    private final String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void recibir(String aviso) {
        System.out.println( nombre + " recibió: " + aviso);
    }
}
