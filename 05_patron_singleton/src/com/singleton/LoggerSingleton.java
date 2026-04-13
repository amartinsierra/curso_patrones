package com.singleton;

public class LoggerSingleton {
	private static LoggerSingleton singleton;
	
	private LoggerSingleton() {}

	public static LoggerSingleton getInstance() {
		if (singleton == null) {
			singleton = new LoggerSingleton();
		}
		return singleton;
	}
	// Método para registrar mensajes
	public void log(String mensaje) {
		System.out.println("[LOG] " + mensaje);
	}
}
