package co.com.ic2.colciencias.utilidades.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ParametrosProperties {

	private static ParametrosProperties instance = null;
	private Properties propiedadesPortal = new Properties();
	

	public Properties getPropiedadesPortal() {
		return propiedadesPortal;
	}

	public void setPropiedadesPortal(Properties propiedadesPortal) {
		this.propiedadesPortal = propiedadesPortal;
	}

	protected ParametrosProperties() {
		try {
			File jarPath=new File(ParametrosProperties.class.getProtectionDomain().getCodeSource().getLocation().getPath());
	        String rutaPropiedades=jarPath.getParentFile().getAbsolutePath();
	        System.out.println(" Ruta properties-"+rutaPropiedades);
	        propiedadesPortal.load(new FileInputStream(rutaPropiedades+"/ic2.portal.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static ParametrosProperties getInstance() {
		if (instance == null) {
			instance = new ParametrosProperties();
		}
		return instance;
	}
	
	public void limpiarParametros(){
		instance=null;
	}
}
