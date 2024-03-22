package Herentzia.Parlanchin;

public abstract class Reloj implements IParlanchin{
	
	protected String color;
	protected String marca;
	
	public Reloj(String color, String marca) {
		this.color = color;
		this.marca = marca;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
}
