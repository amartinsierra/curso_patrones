package visitor;

import elements.Circulo;
import elements.Rectangulo;

public interface FiguraVisitor {
    void visit(Circulo c);
    void visit(Rectangulo r);
}

