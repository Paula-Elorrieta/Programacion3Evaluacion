package Herentzia.Mascotas;

public abstract class Aves extends Mascotas {
	
	protected double tamañoPico;
	protected boolean vuelo;

	public Aves(String nombre, int edad, Estado estado, String fechaNacimiento, double tamañoPico, boolean vuelo) {
		super(nombre, edad, estado, fechaNacimiento);
		this.tamañoPico = tamañoPico;
		this.vuelo = vuelo;
	}

	public double getTamañoPico() {
		return tamañoPico;
	}

	public void setTamañoPico(double tamañoPico) {
		this.tamañoPico = tamañoPico;
	}

	public boolean isVuelo() {
		return vuelo;
	}

	public void setVuelo(boolean vuelo) {
		this.vuelo = vuelo;
	}
	
	public abstract boolean volar();

}
