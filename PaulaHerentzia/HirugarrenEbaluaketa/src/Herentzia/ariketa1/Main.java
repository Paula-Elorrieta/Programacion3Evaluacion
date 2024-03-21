package Herentzia.ariketa1;

import java.util.Scanner;

public class Main {
	public Scanner sc = new Scanner(System.in);
	Ilara ilara = new Ilara();

	public static void main(String[] args) {
		
		Main main = new Main();
		
		 main.iniciar();
//        // TODO Auto-generated method stub
//        Pertsona oPertsona = new Pertsona("12345", "Oier", "Zubiri");
//        Ikasleak oIkaslea = new Ikasleak("12345", "Markel", "Roman");
//        Ikasleak o2Ikaslea = new Ikasleak("12345", "Markel", "Roman", "Dam", 1);
//        System.out.println("oIkaslea" + oIkaslea.toString());
//        System.out.println("oPertsona" + oPertsona.toString());
//        System.out.println("o2Ikaslea" + o2Ikaslea.toString());

	}

	public void iniciar() {
		int opcion = 0;
		do {
			opcion = opcionMenuInicial();
			if (opcion != 0) {
				ejecutarOpcionMenuInicial(opcion);
			}
		} while (opcion != 0);
	}

	private int opcionMenuInicial() {
		int ret = 0;
		do {
			try {
				escribirMenuInicial();
				System.out.print("Elija una opcion: ");
				ret = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
				ret = -1;
			}
		} while ((ret < 0) || (ret > 8));
		return ret;
	}

	private void escribirMenuInicial() {
		System.out.println(" ");
		System.out.println("---- MENU ----");
		System.out.println("---- 0 - SALIR ");
		System.out.println("---- 1 - Sartu ikasleak ");
		System.out.println("---- 2 - Kontsultatu ikasleak NANaren bidez ");
		System.out.println("---- 3 - Ezabatu Ikasleak ");
		System.out.println("---- 4 - Atera taldeen zerrendak ");
		System.out.println("--------------");
	}

	private void ejecutarOpcionMenuInicial(int opcion) {
		System.out.println(" ");
		switch (opcion) {
		case 1: 
			ilara.add(ikasleakSartu(sc));
			
			break;
		case 2:
			
			System.out.println(NanKontsultatu(sc));
			
			break;
		case 3: 
			
			IkasleakEzabatu();
			
			break;
		case 4: 
			
			Zerrenda();
			
			break;
		default:
			System.out.println("Esta opcion no deberia salir...");
		}
	}
	
	private Ikasleak ikasleakSartu(Scanner sc) {
		
		System.out.println("Sartu NAN");
		String nan = sc.nextLine();
		
		System.out.println("Sartu izena");
		String izena = sc.nextLine();
		
		System.out.println("Sartu abizena");
		String abizena = sc.nextLine();
		
		System.out.println("Sartu zikloa");
		String zikloa = sc.nextLine();
		
		System.out.println("Sartu maila");
		int maila =  Integer.parseInt(sc.nextLine());
		
		Ikasleak ika = new Ikasleak(nan, izena, abizena, zikloa, maila);
		return ika;	
	}
	
	private String NanKontsultatu(Scanner sc) {
		
		System.out.println("Sartu nan bilatzeko:");
		String nan = sc.nextLine();
		String ikaslea = "Ez daude ikaslerik";
		
		for (Pertsona ikas : ilara) {
			if (nan.equals(ikas.getNan())) {
				ikaslea = ikas.toString();
				break;
			}
		}
		return ikaslea;
	}
	
	private void IkasleakEzabatu() {
		ilara.clear();
		System.out.println("Ezabatu dira");
	}
	
	private void Zerrenda() {
		
		for (Pertsona ikas : ilara) {
			System.out.println(ikas.toString());
		}
	}
	
}