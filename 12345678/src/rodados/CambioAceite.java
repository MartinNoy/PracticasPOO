package rodados;

import java.util.GregorianCalendar;

public class CambioAceite extends Servicio {

	private double precioFiltro;
	private boolean cambioFiltro;
	
	public CambioAceite(GregorianCalendar fechaHora, String dominio, double precioBase, double precioFiltro,
			boolean cambioFiltro) throws Exception {
		super(fechaHora, dominio, precioBase);
		this.precioFiltro = precioFiltro;
		this.cambioFiltro = cambioFiltro;
	}

	public double getPrecioFiltro() {
		return precioFiltro;
	}

	public void setPrecioFiltro(double precioFiltro) {
		this.precioFiltro = precioFiltro;
	}

	public boolean isCambioFiltro() {
		return cambioFiltro;
	}

	public void setCambioFiltro(boolean cambioFiltro) {
		this.cambioFiltro = cambioFiltro;
	}

	public String traerServicioBrindado () {
		return "Servicio de Cambio de Aceite";
	}
	
	@Override
	public String toString() {
		return "CambioAceite [fechaHora=" + fechaHora + ", dominio=" + dominio + ", precioBase=" + precioBase + "precioFiltro=" + precioFiltro + ", cambioFiltro=" + cambioFiltro + "]";
	}
	
}


