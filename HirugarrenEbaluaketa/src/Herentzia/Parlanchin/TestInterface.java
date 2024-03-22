package Herentzia.Parlanchin;

import Herentzia.Parlanchin.Perro.Raza;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IParlanchin p1 = new Perro("Lur", 8, "17/11/12", Raza.Boxer, false);
		IParlanchin g1 = new Gato("Wa", 5, "12/3/2022", "Marron", false);
		
		IParlanchin c1 = new Cucu("azul", "marca");
		
		hazleHablar(p1);
		hazleHablar(g1);
		hazleHablar(c1);
		
	}
	
	public static void hazleHablar(IParlanchin p1) {
		System.out.println(p1.habla());
	}

}
