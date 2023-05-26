package controladores;

import visual.VentanaEstadisticas;

public class VentanaEstadisticasControlador {
	
	static VentanaEstadisticas ventanaEstadisticas = new VentanaEstadisticas();
	
	public static void cerrar() {
		ventanaEstadisticas.setVisible(false);
	}
	
	public static void mostrar() {
		ventanaEstadisticas.setVisible(true);
	}
}