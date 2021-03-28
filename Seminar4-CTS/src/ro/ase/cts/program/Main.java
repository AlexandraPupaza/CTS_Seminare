package ro.ase.cts.program;

import ro.ase.cts.cumparaturi.Aprozar;
import ro.ase.cts.singleton.AsigurareMedicala;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AsigurareMedicala asigurareMedicala = AsigurareMedicala.getInstance();
		AsigurareMedicala asigurareMedicala2 = AsigurareMedicala.getInstance();
		asigurareMedicala.setId(1);
		//asigurareMedicala2.setNumeAsigurat("Ion");
		asigurareMedicala2.setContributie(80.98f);
		
		System.out.print(asigurareMedicala .toString());
		System.out.print(asigurareMedicala2 .toString());
		
		ro.ase.cts.singleton.lazy.AsigurareMedicala asigurareMedicalaLazy=ro.ase.cts.singleton.lazy.AsigurareMedicala.getInstance(1, "Ghita", 98.7f);
		ro.ase.cts.singleton.lazy.AsigurareMedicala asigurareMedicalaLazy2=ro.ase.cts.singleton.lazy.AsigurareMedicala.getInstance(2, "Mara", 89.4f);
		System.out.println(asigurareMedicalaLazy.toString());
		System.out.println(asigurareMedicalaLazy2.toString());
		
	    Aprozar aprozar1 = Aprozar.getInstance("Piata", 5.46, 87.9f);
	    Aprozar aprozar2 = Aprozar.getInstance("Supermarket", 12.3, 167.9f);
	  	aprozar1.setKgCumparate(32.1);
		System.out.println(aprozar1.toString());
		System.out.println(aprozar2.toString());

	}

}
