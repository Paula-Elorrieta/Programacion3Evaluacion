package Herentzia.PersonalLaboral;

public class Enfermero extends Sanitario{
	
	public enum Puesto{Uci, planta};
	public Puesto puesto;

	public Enfermero(String dNI, String nombre, double sueldoBase, int edad, Puesto puesto) {
		super(dNI, nombre, sueldoBase, edad);
		this.puesto = puesto;
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

	@Override
	public String mostrar() {
		return "Enfermero [puesto=" + puesto + "]" + super.toString();
	}

	@Override
	public double calculaSueldo() {
		if (puesto.equals(Puesto.Uci)) {
			return sueldoBase = sueldoBase + 200;
		}else {
			return sueldoBase;
		}
	}
	
	

}
