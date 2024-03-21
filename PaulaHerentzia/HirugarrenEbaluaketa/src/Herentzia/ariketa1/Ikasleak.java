package Herentzia.ariketa1;

public class Ikasleak extends Pertsona {
	
	
	String Zikloa;
	int Maila;

	
	public Ikasleak(String nan, String izena, String abizena) {
		super(nan, izena, abizena);
	}


	public Ikasleak(String nan, String izena, String abizena, String zikloa, int maila) {
		super(nan, izena, abizena);
		this.Zikloa = zikloa;
		this.Maila = maila;

	}

	

	public String getZikloa() {
		return Zikloa;
	}


	public void setZikloa(String zikloa) {
		this.Zikloa = zikloa;
	}


	public int getMaila() {
		return Maila;
	}


	public void setMaila(int maila) {
		this.Maila = maila;
	}
	
	
	@Override
	public String toString() {
		//deitu aitaren toString eta gehitu parametro berriak.

		String emaitza;
		emaitza = super.toString();
		emaitza += " -zikloa " + Zikloa + " - maila " + Maila ;
		return emaitza;
	}
	

	
	
}
