package formaciones;

import modalidades.Modalidad;

public class Curso extends Formacion {   
    public Curso(Modalidad modalidad) {
        super(modalidad);
    }
    @Override
    public void formar() {
        modalidad.impartir("Curso");
    }
}

