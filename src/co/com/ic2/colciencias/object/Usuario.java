package co.com.ic2.colciencias.object;

import java.io.Serializable;
import co.com.ic2.colciencias.gruplac.ClasificacionGrupo;

public class Usuario implements Serializable{

	/**
	 * 
	 */
	static final long serialVersionUID = -3181734816851852662L;

	private int codigoGrupo;
	private ClasificacionGrupo clasificacionGrupo;
	private String recomendacion;
	
	public int getCodigoGrupo() {
		return codigoGrupo;
	}
	public void setCodigoGrupo(int codigoGrupo) {
		this.codigoGrupo = codigoGrupo;
	}
	public ClasificacionGrupo getClasificacionGrupo() {
		return clasificacionGrupo;
	}
	public void setClasificacionGrupo(ClasificacionGrupo clasificacionGrupo) {
		this.clasificacionGrupo = clasificacionGrupo;
	}
	public String getRecomendacion() {
		return recomendacion;
	}
	public void setRecomendacion(String recomendacion) {
		this.recomendacion = recomendacion;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
