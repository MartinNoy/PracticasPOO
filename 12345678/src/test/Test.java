package test;

import java.util.GregorianCalendar;

import rodados.*;

public class Test {

	public static void main(String[] args) {
		Agenda a = new Agenda(new GregorianCalendar(2018,12,25,12,30), 20, 30); 
		
		// 1)
		System.out.println(a.toString());
		
		try {
			a.agregarlavado(new GregorianCalendar(), "AAA000", 200, 50.0, true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(a.toString());
	}

}
