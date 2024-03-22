package Herentzia.Mascotas;

public class Perro extends Mascotas{

	public enum Raza{PastorAleman, Boxer, Corgi, SanBernardo, GoldenRetriever, PerroSalchicha};
	public Raza raza;
	private boolean pulgas;

	public Perro(String nombre, int edad, Estado estado, String fechaNacimiento, Raza raza, boolean pulgas) {
		super(nombre, edad, estado, fechaNacimiento);
		this.raza = raza;
		this.pulgas = pulgas;
	}


	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public boolean isPulgas() {
		return pulgas;
	}

	public void setPulgas(boolean pulgas) {
		this.pulgas = pulgas;
	}
	
	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", pulgas=" + pulgas + "]" + super.toString();
	}

	@Override
	public String habla() {
		return "Guau Guau";
	}
}
