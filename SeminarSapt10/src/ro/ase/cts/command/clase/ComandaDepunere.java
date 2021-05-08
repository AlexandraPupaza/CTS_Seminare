package ro.ase.cts.command.clase;

public class ComandaDepunere extends ComandaAbstracta {

	public ComandaDepunere(ContBancar contBancar, float suma) {
		super(contBancar, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		super.contBancar.depunere(suma);
		
	}

}
