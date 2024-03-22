package Herentzia.ariketa1;

public class Pertsona  {

	String Nan;
	String Izena;
	String Abizena;
	
	
	
	public Pertsona(String nan, String izena, String abizena) {
		Nan = nan;
		Izena = izena;
		Abizena = abizena;
	}



	public String getNan() {
		return Nan;
	}



	public void setNan(String nan) {
		Nan = nan;
	}



	public String getIzena() {
		return Izena;
	}



	public void setIzena(String izena) {
		Izena = izena;
	}



	public String getAbizena() {
		return Abizena;
	}



	public void setAbizena(String abizena) {
		Abizena = abizena;
	}



	@Override
	public String toString() {
		String emaitza;
		emaitza = "Pertsona [Izena=" + Izena + ", Abizena=" + Abizena + "]";			
		return emaitza;
	}
	

	
}
