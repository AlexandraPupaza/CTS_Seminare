package ro.ase.cts.factorymethod.program;

import ro.ase.cts.factorymethod.clase.AbstractFactory;
import ro.ase.cts.factorymethod.clase.FactoryAtacant;
import ro.ase.cts.factorymethod.clase.FactoryFundas;
import ro.ase.cts.factorymethod.clase.FactoryMijlocas;
import ro.ase.cts.factorymethod.clase.FactoryPortar;
import ro.ase.cts.factorymethod.clase.Jucator;

public class Main {
	public static void afisareInformatiiJucator(AbstractFactory abstractFactory, String nume, int nrMeciuriJucate) {
		Jucator jucator = abstractFactory.getJucator(nume, nrMeciuriJucate);
		System.out.println(jucator.toString());
	}
	public static void main(String[] args) {
		afisareInformatiiJucator(new FactoryAtacant(), "Mihai", 3);
		afisareInformatiiJucator(new FactoryFundas(),"George", 15);
		afisareInformatiiJucator(new FactoryPortar(), "Adrian", 12);
		afisareInformatiiJucator(new FactoryMijlocas(), "Dorian", 9);
		
	}

}
