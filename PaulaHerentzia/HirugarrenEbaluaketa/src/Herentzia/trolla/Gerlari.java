package Herentzia.trolla;

public abstract class Gerlari {
	
	protected String izenaString;
	protected int adina;
	protected int indarra;
	protected boolean zauritua = false;
	protected boolean hilda = false;
	
	public Gerlari(String izenaString, int adina, int indarra) {
		this.izenaString = izenaString;
		this.adina = egiaztuAdinaDEFAULT(adina);
		this.indarra = egiaztuIndarraDEFAULT(indarra);
	}
	
	public Gerlari() {
		
	}
	
	public String getIzenaString() {
		return izenaString;
	}

	public void setIzenaString(String izenaString) {
		this.izenaString = izenaString;
	}

	public int getAdina() {
		return adina;
	}

	public void setAdina(int adina) {
		this.adina = adina;
	}

	public int getIndarra() {
		return indarra;
	}

	public void setIndarra(int indarra) {
		this.indarra = indarra;
	}

	public boolean isZauritua() {
		return zauritua;
	}

	public void setZauritua(boolean zauritua) {
		this.zauritua = zauritua;
	}

	public boolean isHilda() {
		return hilda;
	}

	public void setHilda(boolean hilda) {
		this.hilda = hilda;
	}

	public abstract boolean erretiratu(); 

	public boolean egiaztuAdina(int adina) {
		if (adina < 15 || adina > 60) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean egiaztatuIndarra(int f) {
		if (f < 1 || f > 10) {
			return false;
		}else {
			return true;
		}
	}
	
	public int egiaztuAdinaDEFAULT(int adina) {
		if (egiaztuAdina(adina)) {
			return adina;
		}else {
			return 25;
		}
	}
	
	public int egiaztuIndarraDEFAULT(int f) {
		if (egiaztatuIndarra(f)) {
			return f;
		}else {
			return 5;
		}
	}

	@Override
	public String toString() {
		return "Gerlari [izenaString=" + izenaString + ", adina=" + adina + ", indarra=" + indarra + ", zauritua="
				+ zauritua + ", hilda=" + hilda + "]";
	}

}
