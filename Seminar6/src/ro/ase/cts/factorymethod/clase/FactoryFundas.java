package ro.ase.cts.factorymethod.clase;

public class FactoryFundas implements AbstractFactory{

	@Override
	public Jucator getJucator(String nume, int nrMeciuriJucate) {
		// TODO Auto-generated method stub
		return new Fundas(nume, nrMeciuriJucate);
	}

}
