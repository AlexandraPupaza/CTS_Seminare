package ro.ase.cts.simpleFactory.clase;

public class Fundas  extends Jucator {

	public Fundas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fundas(String nume, int varsta) {
		super(nume, varsta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fundas []");
		builder.append(super.toString());
		return builder.toString();
	}

}
