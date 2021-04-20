package ro.ase.cts.state.clase;

public class Masa {
	private int idMasa;
	private IStareMasa stareMasa;
	
	public Masa(int idMasa) {
		super();
		this.idMasa = idMasa;
		this.stareMasa = new Libera();
	}

	public IStareMasa getStareMasa() {
		return stareMasa;
	}

	void setStareMasa(IStareMasa stareMasa) {
		this.stareMasa = stareMasa;
	}
	
	public void rezervaMasa(String nume) {
		if(this.getStareMasa() instanceof Libera) {
			System.out.println(nume + " a rezervat masa");
			this.setStareMasa(new Rezervata());
		}
		else {
			System.out.println("Masa nu poate fi rezervata");
		}
		
	}
	
	public void ocupaMasa(String nume) {
		if(!(this.getStareMasa() instanceof Ocupata)) {
			System.out.println(nume + " a ocupat masa");
			this.setStareMasa(new Ocupata());
		}
		else {
			System.out.println("Masa nu poate fi ocupata");
		}
	}
	
	public void elibereazaMasa(String nume) {
		if(!(this.getStareMasa() instanceof Libera)) {
			System.out.println(nume + " a eliberat masa");
			this.setStareMasa(new Libera());
		}
		else {
			System.out.println("Masa este deja libera");
		}
	}

}
