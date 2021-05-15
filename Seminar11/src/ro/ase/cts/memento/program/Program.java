package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMeci;
import ro.ase.cts.memento.clase.MeciJucat;
import ro.ase.cts.memento.clase.Memento;

public class Program {

	public static void main(String[] args) {
	MeciJucat meciJucat = new MeciJucat(100, "UCV", "FCSB", 15,100);
	Memento memento = meciJucat.creareMemento();
	ManagerMeci managerMeci = new ManagerMeci(null);
	managerMeci.adaugaMemento(memento);
	
	meciJucat.setNrSpectatori(10000);
	meciJucat.setNumeEchipaGazda("Rapid");
	meciJucat.setNumeEchipaOaspeti("Iasi");
	managerMeci.adaugaMemento(meciJucat.creareMemento());
	
	System.out.println(meciJucat);
	meciJucat.setMemento(managerMeci.getMemento(0));
	
	
	

	}

}
