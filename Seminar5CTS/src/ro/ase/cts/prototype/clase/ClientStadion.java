package ro.ase.cts.prototype.clase;

public class ClientStadion implements AbstractPrototype{
	private String denumire;
	private int varsta;
	
	public ClientStadion(String denumire, int varsta) {
		super();
		//validari
		this.denumire = denumire;
		//de ex-daca pers e majora
		this.varsta = varsta;
	}
	private ClientStadion() {
		super();
	}
	public String getDenumire() {
		return denumire;
	}
	public void setDenumire(String denumire) {
		//validari
		this.denumire = denumire;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		//validari
		this.varsta = varsta;
	}
	//to string generare
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClientStadion [denumire=");
		builder.append(denumire);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public AbstractPrototype copiaza() {
		// TODO Auto-generated method stub
		ClientStadion copie =new ClientStadion();
		copie.denumire =  this.denumire;
		copie.varsta = this.varsta;
		
		return copie;
	}

	
	

}
