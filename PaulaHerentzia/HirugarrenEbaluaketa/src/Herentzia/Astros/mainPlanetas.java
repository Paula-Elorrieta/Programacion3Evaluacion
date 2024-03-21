package Herentzia.Astros;

import java.util.ArrayList;

public class mainPlanetas {

	public static void main(String[] args) {
		
		ArrayList<Astros> astroList = new ArrayList<Astros>();
		
		Planetas p1 = new Planetas(1.2, 2, 2.2, 6.2, 12.2, 233.1, 34.1, true);
		astroList.add(p1);
		Planetas p2 = new Planetas(1.2, 2, 2.2, 6.2, 12.2, 233.1, 34.1, false);
		astroList.add(p2);
		
		Satelites s1 = new Satelites(2.3, 12, 2.0, 5.43, 33.2, 42.23, 23.3, "Tierra");
		astroList.add(s1);
		Satelites s2 = new Satelites(2.3, 12, 2.0, 5.43, 33.2, 42.23, 23.3, "Marte");
		astroList.add(s2);
		
		for (Astros a1 : astroList) {
			if (a1.getClass().getSimpleName().equals("Planetas")) {
				System.out.println("Planeta:");
				System.out.println(a1.toString());
			}else {
				System.out.println("Satelite:");
				System.out.println(a1.toString());
			}
		}
	}
}
