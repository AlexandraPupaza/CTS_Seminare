package ro.ase.cts.template.clase;

public class SpectatorVIP  extends SpectatorAbstract{
	
	private String nume;
	private String loja;
	
	public SpectatorVIP(String nume, String loja) {
		super();
		this.nume = nume;
		this.loja = loja;
	}

	@Override
	public void asezareCoada() {
		System.out.println(this.nume + " intra direct pe intrarea VIP ");
		
	}

	@Override
	public void prezintaBilet() {
		System.out.println(this.nume + " prezinta bilet VIP ");
		
	}

	@Override
	public void realizeazaControlCorporal() {
		System.out.println(this.nume + " este controlat corporal ");
	}

	@Override
	public void ocupaLoc() {
		System.out.println(this.nume + " ocupa loc in loja " + this.loja);
		
	}

	
	

}
