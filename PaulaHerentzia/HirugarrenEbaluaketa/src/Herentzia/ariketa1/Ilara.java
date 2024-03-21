package Herentzia.ariketa1;

import java.util.ArrayList;

public class Ilara extends ArrayList<Pertsona> {

	private static final long serialVersionUID = 1L;

	public Ilara() {

	}

	@Override
	public boolean add(Pertsona oPer) {
		super.add(oPer);
		return true;
	}

	public Pertsona kudeatu() {
		return super.remove(0);

	}
}
