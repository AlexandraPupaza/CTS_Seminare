package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.PlatesteCard;
import ro.ase.cts.strategy.clase.PlatesteCash;

public class Main {

	public static void main(String [] args) {
		Client client = new Client("Alexandra", new PlatesteCard());
		client.platesteNota(102);
		client.setiModPlata(new PlatesteCash());
		client.platesteNota(102);
		
	}
}
