package ro.ase.cts.composite.clase;

public class Item extends ComponentaMeniu {

	public Item(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afisareDescriere() {
	System.out.println("Item: "+this.getNume());
		
	}

	@Override
	public ComponentaMeniu getComponenta(int pozitie) throws Exception {
		throw new Exception("Nu se poate!");
	
	}

	@Override
	public void adaugaComponenta(ComponentaMeniu componenta) throws IllegalAccessException {
    throw new IllegalAccessException();
		
	}

	@Override
	public void stergeComponenta(ComponentaMeniu componenta) throws IllegalAccessException {
		   throw new IllegalAccessException();
		
	}

}
