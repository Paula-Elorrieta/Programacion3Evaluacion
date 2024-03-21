package Herentzia.Mascotas;

import java.util.ArrayList;
import java.util.Scanner;

import Herentzia.Mascotas.Canario.Color;
import Herentzia.Mascotas.Loro.Origen;
import Herentzia.Mascotas.Mascotas.Estado;
import Herentzia.Mascotas.Perro.Raza;
import Herentzia.ariketa1.Main;

public class mainMasc {

	
	public static void main(String[] args) {
		
		ArrayList<Mascotas> mascotas = new ArrayList<Mascotas>();
		
		Scanner teklatu = new Scanner(System.in);
		System.out.println("Aukeratu bat: \n");
		System.out.println("1. Animaliak sortu \n2. Ver perros \n3. Ver gatos \n4. Ver Loros \n5. Ver canarios");
		
		String katea = teklatu.nextLine();
		int aukera = Integer.parseInt(katea);
		
		switch (aukera) {
		case 1:
			
			Perro p1 = new Perro("Lur", 8, Estado.vivo, "17/11/2016", Raza.Boxer, false);
			Perro p2 = new Perro("Kaos", 1, Estado.vivo, "2/5/2022", Raza.PastorAleman, false);
			
			Gato g1 = new Gato("Oreo", 2, Estado.vivo, "14/7/2021", "Blanco y negro", false);
			Gato g2 = new Gato("Michi", 4, Estado.vivo, "5/8/2020", "Marron", false);

			Loro l1 = new Loro("Paco", 10, Estado.muerto, "7/9/2014", 12, true, Origen.africa, "Hola");
			Loro l2 = new Loro("Mango", 12, Estado.vivo, "1/4/2012", 12, true, Origen.australia, "Hola:3");
			
			Canario c1 = new Canario("Blanqui", 2, Estado.vivo, "2/6/2022", 2, true, Color.blanco, "Pio Pio Pio");	
			Canario c2 = new Canario("Green", 1, Estado.vivo, "27/8/2023", 3, true, Color.verde, "Pio Pio Pio");
			
			mascotas.add(p1);
			mascotas.add(p2);
			mascotas.add(g1);
			mascotas.add(g2);
			mascotas.add(l1);
			mascotas.add(l2);
			mascotas.add(c1);
			mascotas.add(c2);
			
			break;
			
		case 2:
			
			break;
		
		case 3:
			
			break;

		default:
			break;
		}
	}

}
