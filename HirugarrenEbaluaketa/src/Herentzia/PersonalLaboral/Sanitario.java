package Herentzia.PersonalLaboral;

public abstract class Sanitario implements IPersonalLaboral{
	
	protected String DNI;
	protected String nombre;
	protected double sueldoBase;
	protected int edad;
	
	public Sanitario(String dNI, String nombre, double sueldoBase, int edad) {
		DNI = dNI;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.edad = edad;
	}
	
	@Override
	public boolean jubilable() {
		if (edad >= 65) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Sanitario [DNI=" + DNI + ", nombre=" + nombre + ", sueldoBase=" + sueldoBase + ", edad=" + edad + "]";
	}

}
