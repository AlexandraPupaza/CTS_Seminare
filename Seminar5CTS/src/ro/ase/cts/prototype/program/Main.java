package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.AbstractPrototype;
import ro.ase.cts.prototype.clase.Bilete;
import ro.ase.cts.prototype.clase.ClientStadion;

public class Main {
	public static void main(String [] args) {
		AbstractPrototype abstractPrototype = new ClientStadion("Alexandra", 23);
		AbstractPrototype abstractPrototype2 = abstractPrototype.copiaza();
		ClientStadion clientStadion = (ClientStadion) abstractPrototype.copiaza();
		clientStadion.setDenumire("DenumireSchimbata");
		//clientStadion.setVarsta(25);
		System.out.println(abstractPrototype.toString());
		System.out.println(abstractPrototype2.toString());
		System.out.println(clientStadion.toString());
		Bilete bilet =  new Bilete(1, "echipa1", "echipa2", "27 martie, 12:00");
		Bilete bilet2 = (Bilete)bilet.copiaza();
		bilet2.setCod(2);
		System.out.println(bilet.toString());
		System.out.println(bilet2.toString());
	}

}
