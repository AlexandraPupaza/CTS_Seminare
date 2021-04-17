package ro.ase.cts.facade.clase;

class Picolo {
   
	private String nume;

	public Picolo(String nume) {
		super();
		this.nume = nume;
	}
	
	public boolean esteDebarasata(Masa masa) {
		//if(masa.getCod()%2 == 0 ) {
		//	return true;
		//}
		//else {
			//return false;
		//}
		return masa.getCod()%2 == 0;
	}
	
	public boolean esteAranjata(Masa masa) {
		return masa.getCod()%5 == 0;
	}
}
