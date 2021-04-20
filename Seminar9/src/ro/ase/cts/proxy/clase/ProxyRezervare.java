package ro.ase.cts.proxy.clase;

public class ProxyRezervare implements IOperatorRezervari  {
	
	private OperatorRezervare operatorRezervare;
	private int nrMinimDePersoane;
	

	public ProxyRezervare(OperatorRezervare operatorRezervare, int nrMinimDePersoane) {
		super();
		this.operatorRezervare = operatorRezervare;
		this.nrMinimDePersoane = nrMinimDePersoane;
	}


	@Override
	public void rezerva(int nrPersoane) {
	if(nrPersoane >= nrMinimDePersoane) {
		operatorRezervare.rezerva( nrPersoane );
	}
	else {
		System.out.println("Numarul de persoane este prea mic!");
	}
		
	}

}
