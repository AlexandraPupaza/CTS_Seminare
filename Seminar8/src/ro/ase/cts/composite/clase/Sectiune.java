package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune extends ComponentaMeniu{
	private List<ComponentaMeniu> componente;

	public Sectiune(String nume) {
		super(nume);
		this.componente =  new ArrayList<>();
	}

	@Override
	public void afisareDescriere() {
	System.out.println("Sectiune: "+this.getNume());
	for(ComponentaMeniu componenta: this.componente) {
		componenta.afisareDescriere();
	}
		
	}

	@Override
	public ComponentaMeniu getComponenta(int pozitie) throws Exception {
	if(pozitie < componente.size() && pozitie >= 0) {
		return componente.get(pozitie);
	}
	else {
		throw new IndexOutOfBoundsException();
	}
	}

	@Override
	public void adaugaComponenta(ComponentaMeniu componenta) {
	componente.add(componenta);
		
	}

	@Override
	public void stergeComponenta(ComponentaMeniu componenta) {
		componente.remove(componenta);
	}

}
