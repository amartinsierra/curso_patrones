package formaciones;

import modalidades.Modalidad;

public abstract class Formacion {
    protected Modalidad modalidad;
    public Formacion(Modalidad modalidad) {
        this.modalidad = modalidad;
    }
    public abstract void formar();
}
