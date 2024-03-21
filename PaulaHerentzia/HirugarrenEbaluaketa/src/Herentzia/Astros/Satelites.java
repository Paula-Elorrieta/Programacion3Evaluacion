package Herentzia.Astros;

public class Satelites extends Astros {

	private double distancia_planeta;
	private double orbita_planetaria;
	private String planeta;
	
	public Satelites(double radio_ecuatorial, int rotacion_eje, double masa, double temperatura, double gravedad,
			double distancia_planeta, double orbita_planetaria, String planeta) {
		super(radio_ecuatorial, rotacion_eje, masa, temperatura, gravedad);
		this.distancia_planeta = distancia_planeta;
		this.orbita_planetaria = orbita_planetaria;
		this.planeta = planeta;
	}

	public double getDistancia_planeta() {
		return distancia_planeta;
	}

	public void setDistancia_planeta(double distancia_planeta) {
		this.distancia_planeta = distancia_planeta;
	}

	public double getOrbita_planetaria() {
		return orbita_planetaria;
	}

	public void setOrbita_planetaria(double orbita_planetaria) {
		this.orbita_planetaria = orbita_planetaria;
	}

	public String getPlaneta() {
		return planeta;
	}

	public void setPlaneta(String planeta) {
		this.planeta = planeta;
	}

	@Override
	public String toString() {
		return super.toString() + "Satelites [distancia_planeta=" + distancia_planeta + ", orbita_planetaria=" + orbita_planetaria
				+ ", planeta=" + planeta + "]";
	}
}
