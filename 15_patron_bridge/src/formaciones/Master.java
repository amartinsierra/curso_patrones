package formaciones;

import modalidades.Modalidad;

public class Master extends Formacion {
    public Master(Modalidad modalidad) {
        super(modalidad);
    }
    @Override
    public void formar() {
        modalidad.impartir("Máster");
    }
}

