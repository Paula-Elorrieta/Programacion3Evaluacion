package Herentzia.Astros;

public class Planetas extends Astros {
	
	private double distancia_sol;
	private double orbita;
	private boolean satelites;
	
	public Planetas(double radio_ecuatorial, int rotacion_eje, double masa, double temperatura, double gravedad,
			double distancia_sol, double orbita, boolean satelites) {
		super(radio_ecuatorial, rotacion_eje, masa, temperatura, gravedad);
		this.distancia_sol = distancia_sol;
		this.orbita = orbita;
		this.satelites = satelites;
	}

	public double getDistancia_sol() {
		return distancia_sol;
	}

	public void setDistancia_sol(double distancia_sol) {
		this.distancia_sol = distancia_sol;
	}

	public double getOrbita() {
		return orbita;
	}

	public void setOrbita(double orbita) {
		this.orbita = orbita;
	}

	public boolean isSatelites() {
		return satelites;
	}

	public void setSatelites(boolean satelites) {
		this.satelites = satelites;
	}

	@Override
	public String toString() {
		return super.toString() + "Planetas [distancia_sol=" + distancia_sol + ", orbita=" + orbita + ", satelites=" + satelites + "]";
	}	

}
