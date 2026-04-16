package visitor;

import elements.Circulo;
import elements.Rectangulo;

public class DibujarVisitor implements FiguraVisitor {
    @Override
    public void visit(Circulo c) {
        System.out.println("Dibujando un círculo de radio " + c.radio);
    }
    @Override
    public void visit(Rectangulo r) {
        System.out.println("Dibujando un rectángulo " + r.ancho + "x" + r.alto);
    }
}
