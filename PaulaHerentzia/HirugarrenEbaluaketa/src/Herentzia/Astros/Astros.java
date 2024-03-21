package Herentzia.Astros;

public abstract class Astros {
	
	protected double radio_ecuatorial;
	protected int rotacion_eje;
	protected double masa;
	protected double temperatura;
	protected double gravedad;
	
	public Astros(double radio_ecuatorial, int rotacion_eje, double masa, double temperatura, double gravedad) {
		this.radio_ecuatorial = radio_ecuatorial;
		this.rotacion_eje = rotacion_eje;
		this.masa = masa;
		this.temperatura = temperatura;
		this.gravedad = gravedad;
	}

	public double getRadio_ecuatorial() {
		return radio_ecuatorial;
	}

	public void setRadio_ecuatorial(double radio_ecuatorial) {
		this.radio_ecuatorial = radio_ecuatorial;
	}

	public int getRotacion_eje() {
		return rotacion_eje;
	}

	public void setRotacion_eje(int rotacion_eje) {
		this.rotacion_eje = rotacion_eje;
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public double getGravedad() {
		return gravedad;
	}

	public void setGravedad(double gravedad) {
		this.gravedad = gravedad;
	}

	@Override
	public String toString() {
		return "Astros [radio_ecuatorial=" + radio_ecuatorial + ", rotacion_eje=" + rotacion_eje + ", masa=" + masa
				+ ", temperatura=" + temperatura + ", gravedad=" + gravedad + "]";
	}
}
