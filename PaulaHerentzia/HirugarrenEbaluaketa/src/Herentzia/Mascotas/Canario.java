package Herentzia.Mascotas;

public class Canario extends Aves{
	
	public enum Color{blanco, amarillo, verde, marron, rojo};
	public Color color;
	private String canta;
	
	public Canario(String nombre, int edad, Estado estado, String fechaNacimiento, double tamañoPico, boolean vuelo,
			Color color, String canta) {
		super(nombre, edad, estado, fechaNacimiento, tamañoPico, vuelo);
		this.color = color;
		this.canta = canta;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getCanta() {
		return canta;
	}

	public void setCanta(String canta) {
		this.canta = canta;
	}

	@Override
	public boolean volar() {
		return true;
	}

	@Override
	public String habla() {
		return "Chio chio";
	}	
	
}
