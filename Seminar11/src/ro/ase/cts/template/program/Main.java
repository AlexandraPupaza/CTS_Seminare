package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.Spectator;
import ro.ase.cts.template.clase.SpectatorAbstract;
import ro.ase.cts.template.clase.SpectatorVIP;

public class Main {

	public static void main(String[] args) {
	 SpectatorAbstract spectator = new Spectator("Alina");
	 SpectatorAbstract spectatorVIP = new SpectatorVIP("Alexandra", "Loja 1");
	 spectator.intrarePeStadion();
	 spectatorVIP.intrarePeStadion();

	}

}
