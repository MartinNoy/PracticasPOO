package test;

import java.util.GregorianCalendar;

import rodados.Agenda;

public class Test {

	public static void main(String[] args) {
		
		GregorianCalendar inicio = new GregorianCalendar(2018,11,30,8,0,0);
		GregorianCalendar lavado = new GregorianCalendar(2018,11,30,8,0,0);
		
		Agenda a = new Agenda(inicio, 20, 30); 
		
		// 1)
		System.out.println(a.toString());
		
		try {
			a.agregarlavado(lavado, "AAA000", 200, 50.0, true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(a.toString());
	}

}
