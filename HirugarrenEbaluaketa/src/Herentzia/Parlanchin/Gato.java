package Herentzia.Parlanchin;

public class Gato extends Animal {

	private String color;
	private boolean peloLargo;

	public Gato(String nombre, int edad, String fechaNacimiento, String color, boolean peloLargo) {
		super(nombre, edad, fechaNacimiento);
		this.color = color;
		this.peloLargo = peloLargo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPeloLargo() {
		return peloLargo;
	}

	public void setPeloLargo(boolean peloLargo) {
		this.peloLargo = peloLargo;
	}

	@Override
	public String habla() {
		return "Miau miau";
	}
	
}
