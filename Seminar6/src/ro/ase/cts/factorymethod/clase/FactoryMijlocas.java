package ro.ase.cts.factorymethod.clase;

public class FactoryMijlocas implements AbstractFactory{

	@Override
	public Jucator getJucator(String nume, int nrMeciuriJucate) {
		// TODO Auto-generated method stub
		return new Mijlocas(nume, nrMeciuriJucate);
	}

}
