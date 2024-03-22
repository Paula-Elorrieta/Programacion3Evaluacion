package Herentzia.PersonalLaboral;

public class Medico extends Sanitario{

	private String Especialidad;
	private int numeroPacientes;
	
	public Medico(String dNI, String nombre, double sueldoBase, int edad, String especialidad, int numeroPacientes) {
		super(dNI, nombre, sueldoBase, edad);
		Especialidad = especialidad;
		this.numeroPacientes = numeroPacientes;
	}
	
	public String getEspecialidad() {
		return Especialidad;
	}

	public void setEspecialidad(String especialidad) {
		Especialidad = especialidad;
	}

	public int getNumeroPacientes() {
		return numeroPacientes;
	}

	public void setNumeroPacientes(int numeroPacientes) {
		this.numeroPacientes = numeroPacientes;
	}

	@Override
	public double calculaSueldo() {
		return sueldoBase + numeroPacientes * (1.20);
	}

	@Override
	public String mostrar() {
		return "Medico [Especialidad=" + Especialidad + ", numeroPacientes=" + numeroPacientes + "]" + super.toString();
	}
}
