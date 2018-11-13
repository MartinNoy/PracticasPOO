package rodados;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Agenda {

	private GregorianCalendar fechaHoraInicio;
	private int cantMaxima;
	private int duracionTurnoMinutos;
	private List<Servicio> lstTurnosServicio;
	
	public Agenda(GregorianCalendar fechaHoraInicio, int cantMaxima, int duracionTurnoMinutos) {
		this.fechaHoraInicio = fechaHoraInicio;
		this.cantMaxima = cantMaxima;
		this.duracionTurnoMinutos = duracionTurnoMinutos;
		this.lstTurnosServicio = new ArrayList<Servicio>();
	}

	public GregorianCalendar getFechaHoraInicio() {
		return fechaHoraInicio;
	}

	public void setFechaHoraInicio(GregorianCalendar fechaHoraInicio) {
		this.fechaHoraInicio = fechaHoraInicio;
	}

	public int getCantMaxima() {
		return cantMaxima;
	}

	public void setCantMaxima(int cantMaxima) {
		this.cantMaxima = cantMaxima;
	}

	public int getDuracionTurnoMinutos() {
		return duracionTurnoMinutos;
	}

	public void setDuracionTurnoMinutos(int duracionTurnoMinutos) {
		this.duracionTurnoMinutos = duracionTurnoMinutos;
	}

	public List<Servicio> getLstTurnosServicio() {
		return lstTurnosServicio;
	}
	
	public boolean agregarlavado (GregorianCalendar fechaHora, String dominio, double precioBase, double precioEncerado, boolean encerado) throws Exception {
		Servicio lavado = new Lavado (fechaHora, dominio, precioBase, precioEncerado, encerado);
		lstTurnosServicio.add(lavado);
		return false;
	}
	
	public boolean agregarAlineacionBalanceo (GregorianCalendar fechaHora, String dominio, double precioBase, double precioCubiertas, int cantCubiertas) throws Exception {
		Servicio balanceo = new AlineacionBalanceo (fechaHora, dominio, precioBase, precioCubiertas, cantCubiertas);
		lstTurnosServicio.add(balanceo);
		return true;
	}
	
	public boolean agregarCambioAceite (GregorianCalendar fechaHora, String dominio, double precioBase, double precioFiltro, boolean cambioFiltro) throws Exception {
		Servicio aceite = new CambioAceite (fechaHora, dominio, precioBase, precioFiltro, cambioFiltro);
		lstTurnosServicio.add(aceite);
		return true;
	}
	

	@Override
	public String toString() {
		return "Agenda [fechaHoraInicio=" + Funciones.traerFechaCortaHora(fechaHoraInicio) + ", cantMaxima=" + cantMaxima + ", duracionTurnoMinutos="
				+ duracionTurnoMinutos + ", lstTurnosServicio=" + lstTurnosServicio + "]";
	}

	
}
