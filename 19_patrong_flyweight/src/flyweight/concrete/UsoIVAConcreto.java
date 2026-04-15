package flyweight.concrete;

import flyweight.UsoIVA;

public class UsoIVAConcreto implements UsoIVA {
    private final double porcentaje;
    public UsoIVAConcreto(double porcentaje) {
    	System.out.println("Creación de objeto concreto");
        this.porcentaje = porcentaje;
    }
    @Override
    public double aplicarIVA(double baseImponible) {
        return baseImponible*(1+porcentaje/100);
    }
}

