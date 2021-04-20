package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Libera;
import ro.ase.cts.state.clase.Masa;
import ro.ase.cts.state.clase.Ocupata;
import ro.ase.cts.state.clase.Rezervata;

public class Program {

	public static void main(String[] args) {
		
		Masa masa1 = new Masa(1);
		masa1.rezervaMasa("Alexandra");
	    masa1.ocupaMasa("Alexandra");
	    masa1.elibereazaMasa("Alexandra");
	    
	    
	    
	    Masa masa2 = new Masa(2);
	    Rezervata rezervata = new Rezervata();
	    Ocupata ocupata = new Ocupata();
	    Libera libera = new Libera();
	    
	    libera.modificastare(masa2);
	    rezervata.modificastare(masa2);
	    ocupata.modificastare(masa2);

	}

}
