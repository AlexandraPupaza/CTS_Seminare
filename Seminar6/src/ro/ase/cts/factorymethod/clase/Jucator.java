package ro.ase.cts.factorymethod.clase;

public abstract class Jucator {
	private String nume;
	private int meciuriJucate;
	
	public Jucator(String nume, int meciuriJucate) {
		super();
		this.nume = nume;
		this.meciuriJucate = meciuriJucate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jucator [nume=");
		builder.append(nume);
		builder.append(", meciuriJucate=");
		builder.append(meciuriJucate);
		builder.append("]");
		return builder.toString();
	}
	
	

}
