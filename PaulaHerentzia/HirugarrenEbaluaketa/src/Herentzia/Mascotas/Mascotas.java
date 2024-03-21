package Herentzia.Mascotas;

public abstract class Mascotas {

	protected String nombre;
	protected int edad;
	protected enum Estado {vivo, muerto, enfermo};
	protected Estado estado;
	protected String fechaNacimiento;
	
	public Mascotas(String nombre, int edad, Estado estado, String fechaNacimiento) {
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public abstract String habla();
	
	@Override
	public String toString() {
		return "Mascotas [nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}
		
	public int cumpleaños() {
		return edad + 1;
	}
	
	public Estado morido() {
		return Estado.muerto;
	}

}
