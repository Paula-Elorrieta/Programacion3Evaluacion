package Herentzia.trolla;

public class Zaldia {
	
	protected int Maxkapazitatea;
	protected int kopurua;
	protected Gerlari[] okupatzaileak;
	
	public Zaldia(int maxkapazitatea) {
		this.Maxkapazitatea = maxkapazitatea;
		this.kopurua = 0;
		okupatzaileak = new Gerlari[maxkapazitatea];
	}

	public int getMaxkapazitatea() {
		return Maxkapazitatea;
	}

	public void setMaxkapazitatea(int maxkapazitatea) {
		Maxkapazitatea = maxkapazitatea;
	}

	public int getKopurua() {
		return kopurua;
	}

	public void setKopurua(int kopurua) {
		this.kopurua = kopurua;
	}

	public Gerlari[] getOkupatzaileak() {
		return okupatzaileak;
	}

	public void setOkupatzaileak(Gerlari[] okupatzaileak) {
		this.okupatzaileak = okupatzaileak;
	}
	
	public int bilatuIzena(String izena) {
		int posizioa = -1;
		
		for(int i = 0; i < okupatzaileak.length; i++) {
			if (okupatzaileak[i].getIzenaString().equals(izena)) {
			  posizioa = i;
			}
		}
		return posizioa;
	}

	public String erakutsiGerlariPosizioa(int pos) {
		String emaitza = "";
		
		if (pos < kopurua && pos > 0) {
			emaitza = okupatzaileak[pos].toString();
		}else {
			emaitza = "No hay ese gerlari";
		}
		
		return emaitza;
	}
	
	public void zaldiraIgo(Gerlari gerlaria) {
		
		if (!gerlaria.getClass().getSimpleName().equals("Greziar")) {
			gerlaria.setHilda(true);
		}else {
			if (okupatzaileak.length < Maxkapazitatea) {
				gerlaria = okupatzaileak[okupatzaileak.length - 1];
			}
		}
		
	

		
	}
	
	
	
	
	
	
	
	

}
