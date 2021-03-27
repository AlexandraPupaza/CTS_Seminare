package ro.ase.cts.simpleFactory.main;

import ro.ase.cts.simpleFactory.clase.Factory;
import ro.ase.cts.simpleFactory.clase.Jucator;
import ro.ase.cts.simpleFactory.clase.SingletonFactory;
import ro.ase.cts.simpleFactory.clase.TipJucator;

public class Main {
	public static void main(String[] args) {
		SingletonFactory singletonFactory = SingletonFactory .getInstance();
		Jucator portar = singletonFactory.getJucator(TipJucator.PORTAR,"Mark", 20);
		Jucator fundas = singletonFactory.getJucator(TipJucator.FUNDAS, "Mike", 30);
		//Factory factory = new Factory();
		//Jucator portar = factory.getJucator(TipJucator.PORTAR,"Mark", 20);
		//Jucator fundas = factory.getJucator(TipJucator.FUNDAS, "Mike", 30);
		System.out.println(portar.toString());
		System.out.println(fundas.toString());
	}

}
