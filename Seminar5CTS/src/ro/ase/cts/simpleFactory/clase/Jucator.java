package ro.ase.cts.simpleFactory.clase;

public class Jucator {
	private String nume;
	private int varsta;
	
	public Jucator(String nume, int varsta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
	}
	public Jucator() {
		super();
	}
	
	public String getNume() {
		return nume;
	}
	public int getVarsta() {
		return varsta;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jucator [nume=");
		builder.append(nume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append("]");
		return builder.toString();
	}
	

}
