package ro.ase.cts.factorymethod.clase;

public class Mijlocas extends Jucator{

	public Mijlocas(String nume, int meciuriJucate) {
		super(nume, meciuriJucate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mijlocas []");
		builder.append(super.toString());
		return builder.toString();
	}
	
	

}
