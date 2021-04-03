package ro.ase.cts.factorymethod.clase;

public class Atacant extends Jucator {

	public Atacant(String nume, int meciuriJucate) {
		super(nume, meciuriJucate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atacant []");
		builder.append(super.toString());
		return builder.toString();
	}
	
	

}
