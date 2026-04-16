package publicador;

import observador.Observer;

public interface Subject {
    void registrar(Observer o);
    void eliminar(Observer o);
 
}


