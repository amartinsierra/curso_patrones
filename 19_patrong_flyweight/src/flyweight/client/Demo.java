package flyweight.client;

import flyweight.factory.UsoIVAFactory;
import flyweight.service.FacturacionService;

public class Demo {
	public static void main(String[] args) {
		var facturacionService=new FacturacionService(new UsoIVAFactory());
		
		System.out.println("Precio con iva reducido: "+facturacionService.calcularTotal("reducido", 200));
		System.out.println("Precio con iva superreducido: "+facturacionService.calcularTotal("superreducido", 200));
		System.out.println("Precio con iva reducido: "+facturacionService.calcularTotal("reducido", 400));
		
	}
}
