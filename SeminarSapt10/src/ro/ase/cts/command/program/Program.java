package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.ComandaConstituire;
import ro.ase.cts.command.clase.ComandaDepunere;
import ro.ase.cts.command.clase.ComandaRetragere;
import ro.ase.cts.command.clase.ContBancar;
import ro.ase.cts.command.clase.ManagerComenzi;

public class Program {

	public static void main(String[] args) {
		ManagerComenzi managerComenzi = new ManagerComenzi();
		ContBancar contBancar = new ContBancar("Alexandra");
		managerComenzi.invocaComanda(new ComandaConstituire(contBancar, 100));
		managerComenzi.invocaComanda(new ComandaDepunere(contBancar, 80));
		managerComenzi.executaComanda();
		managerComenzi.invocaComanda(new ComandaRetragere(contBancar, 40));
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();

		managerComenzi.invocaComanda(new ComandaRetragere(contBancar, 90));
		managerComenzi.executaComanda();
	
	}

}
