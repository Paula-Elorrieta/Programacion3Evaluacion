package Herentzia.PersonalLaboral;

import java.util.ArrayList;

import Herentzia.PersonalLaboral.Enfermero.Puesto;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Sanitario> sanitarios = new ArrayList<Sanitario>();
		
		Sanitario s1 = new Medico("123212", "Raul", 2000, 30, "Oidos", 120);
		Sanitario s2 = new Medico("365342", "Lara", 2100, 65, "Corazon", 400);
		Sanitario s3 = new Enfermero("1224313", "Sergio", 2500, 65, Puesto.Uci);
		Sanitario s4 = new Enfermero("1224313", "Paco", 2500, 30, Puesto.planta);
		Sanitario s5 = new Enfermero("4342344", "Paula", 1900, 32, Puesto.Uci);

		sanitarios.add(s1);
		sanitarios.add(s2);
		sanitarios.add(s3);
		sanitarios.add(s4);
		sanitarios.add(s5);
		
		for (Sanitario sx : sanitarios) {
			sx.calculaSueldo();
		}
		
		System.out.println("[1]");
		for (Sanitario sx : sanitarios) {
			System.out.println(sx.mostrar());
		}
		
		System.out.println("[2]");
		System.out.println("Subidos los sueldos");
		for (Sanitario sx : sanitarios) {
			sx.sueldoBase = sx.sueldoBase * 1.01;
		}
		
		System.out.println("[3]");
		for (Sanitario sx : sanitarios) {
			System.out.println(sx.mostrar());
		}
		
		System.out.println("[4]");
		for (Sanitario sx : sanitarios) {
			if (sx.jubilable()) {
				System.out.println(sx.mostrar());
			}
		}

		
	}

}
