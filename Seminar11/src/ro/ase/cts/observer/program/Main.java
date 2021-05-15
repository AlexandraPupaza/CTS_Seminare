package ro.ase.cts.observer.program;

import java.util.Observer;

import ro.ase.cts.observer.clase.ClientAbonat;
import ro.ase.cts.observer.clase.ManagerSala;

public class Main {

	public static void main(String[] args) {
		
		ManagerSala managerSala = new ManagerSala("Sala Sporturilor");
		ClientAbonat clientAbonat1 = new ClientAbonat("Alexandra");
		ClientAbonat clientAbonat2 = new ClientAbonat("Maria");
		ClientAbonat clientAbonat3 = new ClientAbonat("Andreea");
		managerSala.aboneaza(clientAbonat1);
		managerSala.aboneaza(clientAbonat2);
		managerSala.aboneaza(clientAbonat3);
		managerSala.anuntaMeci("volei");
		managerSala.dezaboneaza(clientAbonat3);
		managerSala.anuntaMeci("handbal");

	}

}
