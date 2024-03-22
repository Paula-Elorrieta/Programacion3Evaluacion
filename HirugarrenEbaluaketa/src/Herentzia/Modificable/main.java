package Herentzia.Modificable;

public class main {

	public static void main(String[] args) {
		
		Acumulador p1 = new Acumulador(25);
		
		p1.incremento(12);

		System.out.println(p1.getValor());
	}
}
