package ro.ase.cts.factorymethod.clase;

public class Fundas extends Jucator
{

	public Fundas(String nume, int meciuriJucate) {
		super(nume, meciuriJucate);
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
