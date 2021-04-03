package ro.ase.cts.factorymethod.clase;

public class FactoryAtacant implements AbstractFactory {

	@Override
	public Jucator getJucator(String nume, int nrMeciuriJucate) {
		// TODO Auto-generated method stub
		return new Atacant(nume, nrMeciuriJucate);
	}

}
