package ro.ase.cts.command.clase;

public abstract class ComandaAbstracta {
	protected ContBancar contBancar;
	protected float suma;
	
	public ComandaAbstracta(ContBancar contBancar, float suma) {
		super();
		this.contBancar = contBancar;
		this.suma = suma;
	}
	
	public abstract void executa();
	
	

}
