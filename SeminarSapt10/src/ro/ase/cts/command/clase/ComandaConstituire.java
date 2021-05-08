package ro.ase.cts.command.clase;

public class ComandaConstituire extends ComandaAbstracta {

	public ComandaConstituire(ContBancar contBancar, float suma) {
		super(contBancar, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
	super.contBancar.constituire(suma);
		
	}

}
