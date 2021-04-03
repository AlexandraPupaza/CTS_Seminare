package ro.ase.cts.factorymethod.clase;

public class Portar extends Jucator {

	public Portar(String nume, int meciuriJucate) {
		super(nume, meciuriJucate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Portar []");
		builder.append(super.toString());
		return builder.toString();
	}



}
