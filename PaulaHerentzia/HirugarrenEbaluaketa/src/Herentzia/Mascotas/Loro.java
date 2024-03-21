package Herentzia.Mascotas;

public class Loro extends Aves{
	
	public enum Origen{America, africa, asia, australia};
	public Origen origen;
	private String habla;

	public Loro(String nombre, int edad, Estado estado, String fechaNacimiento, double tamañoPico, boolean vuelo,
			Origen origen, String habla) {
		super(nombre, edad, estado, fechaNacimiento, tamañoPico, vuelo);
		this.origen = origen;
		this.habla = habla;
	}

	public Origen getOrigen() {
		return origen;
	}

	public void setOrigen(Origen origen) {
		this.origen = origen;
	}

	public String habla() {
		return habla;
	}

	public void setHabla(String habla) {
		this.habla = habla;
	}

	@Override
	public String toString() {
		return "Loro [origen=" + origen + ", habla=" + habla + "]" + super.toString();
	}
	
	public String saluda() {
		return "Hola";
	}

	@Override
	public boolean volar() {
		return true;
	}

	
}
