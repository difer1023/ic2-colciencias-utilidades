package co.com.ic2.colciencias.utilidades.test;

import java.util.Properties;

import co.com.ic2.colciencias.utilidades.properties.ParametrosProperties;

public class TestPropiedades {

	public static void main(String[] args) {
		ParametrosProperties parametrosProperties=ParametrosProperties.getInstance();
		
		Properties propiedades=parametrosProperties.getPropiedadesPortal();
		
		System.out.println(propiedades.getProperty("servicio1"));
	}
}
