package service;

import composite.ModuleComponent;
import composite.Modulo;
import observer.AnalyticsSystem;
import observer.ObservableModule;

public class CursosService {
	public Modulo crearModulo(String nombre, ModuleComponent ... components) {
		ObservableModule modulo=new ObservableModule(nombre);
		modulo.addObserver(new AnalyticsSystem());
		for(ModuleComponent component:components) {
			modulo.add(component);
		}
		return modulo;
	}
}
