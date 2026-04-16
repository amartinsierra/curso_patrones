package elements;

import visitor.FiguraVisitor;

public sealed interface Figura permits Circulo,Rectangulo{
    void accept(FiguraVisitor visitor);
}
