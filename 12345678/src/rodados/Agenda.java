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
	
	public Servicio traerServicio(GregorianCalendar fecha) {
		Servicio servicio= null;
		int i = 0;
		while(i<= lstTurnosServicio.size()-1&&servicio==null) {
			if (Funciones.sonFechasHorasIguales(fecha, lstTurnosServicio.get(i).getFechaHora())) {
				servicio=lstTurnosServicio.get(i);
			}
		i++;
		}
	return servicio;
	}
	
	public boolean agregarlavado (GregorianCalendar fechaHora, String dominio, double precioBase, double precioEncerado, boolean encerado) throws Exception {
		boolean agregado=false;
		if (traerServicio(fechaHora)!=null) {
		throw new Exception("bgfnhghfdfbg");	
		}
		else {
			Servicio lavado = new Lavado (fechaHora, dominio, precioBase, precioEncerado, encerado);
			lstTurnosServicio.add(lavado);
			agregado=true;
		}
		return agregado;
	}
	
	public boolean agregarAlineacionBalanceo (GregorianCalendar fechaHora, String dominio, double precioBase, double precioCubiertas, int cantCubiertas) throws Exception {
		boolean agregado=false;
		if (traerServicio(fechaHora)!=null) {
		throw new Exception("bgfnhghfdfbg");	
		}
		else {
			Servicio balanceo = new AlineacionBalanceo (fechaHora, dominio, precioBase, precioCubiertas, cantCubiertas);
			lstTurnosServicio.add(balanceo);
			agregado=true;
		}
		return agregado;
	}
	
	public boolean agregarCambioAceite (GregorianCalendar fechaHora, String dominio, double precioBase, double precioFiltro, boolean cambioFiltro) throws Exception {
		boolean agregado=false;
		if (traerServicio(fechaHora)!=null) {
		throw new Exception("bgfnhghfdfbg");	
		}
		else {
			Servicio aceite = new CambioAceite (fechaHora, dominio, precioBase, precioFiltro, cambioFiltro);
			lstTurnosServicio.add(aceite);
			agregado=true;
		}
		return agregado;
	}
	

	@Override
	public String toString() {
		return "Agenda [fechaHoraInicio=" + Funciones.traerFechaCortaHora(fechaHoraInicio) + ", cantMaxima=" + cantMaxima + ", duracionTurnoMinutos="
				+ duracionTurnoMinutos + ", lstTurnosServicio=" + lstTurnosServicio + "]";
	}

	
}
