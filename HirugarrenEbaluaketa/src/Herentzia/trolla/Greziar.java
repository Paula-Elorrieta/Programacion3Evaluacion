package Herentzia.trolla;

public class Greziar extends Gerlari {

	public Greziar(String izenaString, int adina, int indarra) {
		super(izenaString, adina, indarra);
	}
	
	public Greziar() {
		super("GreziarX", 20, 8);
	}

	@Override
	public boolean erretiratu() {		
		if (zauritua && !hilda) {
			System.out.println("Izena: " + izenaString + "\n" + "Adina: " + adina 
					+ " Indarra: " + indarra + "\nZauritua dago : RETIRADA");
			return true;
		}
		return false;
	}
	
	
	
	

}
