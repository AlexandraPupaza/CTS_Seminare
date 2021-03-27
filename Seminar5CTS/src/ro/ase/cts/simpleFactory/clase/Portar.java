package ro.ase.cts.simpleFactory.clase;

public class Portar extends Jucator {


	public Portar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Portar(String nume, int varsta) {
		super(nume, varsta);
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
