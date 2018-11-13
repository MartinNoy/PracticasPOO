package rodados;

import java.util.GregorianCalendar;

public class AlineacionBalanceo extends Servicio {

	private double precioCubierta;
	private int cantCubiertas;
	
	public AlineacionBalanceo(GregorianCalendar fechaHora, String dominio, double precioBase, double precioCubierta,
			int cantCubiertas) throws Exception {
		super(fechaHora, dominio, precioBase);
		this.precioCubierta = precioCubierta;
		this.cantCubiertas = cantCubiertas;
	}

	public double getPrecioCubierta() {
		return precioCubierta;
	}

	public void setPrecioCubierta(double precioCubierta) {
		this.precioCubierta = precioCubierta;
	}

	public int getCantCubiertas() {
		return cantCubiertas;
	}

	public void setCantCubiertas(int cantCubiertas) {
		this.cantCubiertas = cantCubiertas;
	}

	public String traerServicioBrindado () {
		return "Servicio de Alineacion y Balanceo";
	}
	
	@Override
	public String toString() {
		return "AlineacionBalanceo [fechaHora=" + fechaHora + ", dominio=" + dominio + ", precioBase=" + precioBase + "precioCubierta=" + precioCubierta + ", cantCubiertas=" + cantCubiertas + "]";
	}
	
}
