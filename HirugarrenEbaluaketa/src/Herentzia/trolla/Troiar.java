package Herentzia.trolla;

public class Troiar extends Gerlari {

	public Troiar(String izenaString, int adina, int indarra) {
		super(izenaString, adina, indarra);
	}
	
	public Troiar() {
		super("TroiarX", 18, 10);
		
	}
	
	@Override
	public boolean erretiratu() {		
		if (zauritua) {
			System.out.println("Izena: " + izenaString + "\n" + "Adina: " + adina 
					+ " Indarra: " + indarra + "\nZauritua dago : Los troyanos nunca se retiran!");
		}else {
			System.out.println("No estas herido, no te retiras");
		}
		return false;
	}

	public String toString() {
		return super.toString();
	}
}
