package ro.ase.cts.chainofresponsibility.program;

import ro.ase.cts.chainofresponsibility.clase.Cont;
import ro.ase.cts.chainofresponsibility.clase.ContCredit;
import ro.ase.cts.chainofresponsibility.clase.ContCurent;
import ro.ase.cts.chainofresponsibility.clase.ContEconomii;

public class Program {

	public static void main(String[] args) {
		Cont contCurent = new ContCurent(200);
		Cont contEconomii = new ContEconomii(150);
		Cont contCredit = new ContCredit(550);
		
		contCurent.setCont(contEconomii);
		contEconomii.setCont(contCredit);
		
		contCurent.realizeazaPlata(100);
		contCurent.realizeazaPlata(45);
		contCredit.realizeazaPlata(90);
		contCurent.realizeazaPlata(100);
		contCurent.realizeazaPlata(15);
		contCurent.realizeazaPlata(50);
		contCurent.realizeazaPlata(700);

	}

}
