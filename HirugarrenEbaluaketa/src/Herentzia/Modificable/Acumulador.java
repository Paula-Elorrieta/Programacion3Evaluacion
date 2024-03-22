package Herentzia.Modificable;

public class Acumulador implements IModificable {

	protected int valor;

	public Acumulador(int valor) {
		super();
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	@Override
	public void incremento(int incremento) {
		this.valor = valor + incremento;
	}
	
}
