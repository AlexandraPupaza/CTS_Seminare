package ro.ase.cts.singleton;

public class AsigurareMedicala {
	private int id;
	private String numeAsigurat;
	private float contributie;
	
	private static AsigurareMedicala asigurareMedicala = new AsigurareMedicala(1, "Maria",100.12f);
	
	public AsigurareMedicala(int id, String numeAsigurat, float contributie) {
		super();
		this.id = id;
		this.numeAsigurat = numeAsigurat;
		this.contributie = contributie;
	}
	
	public static AsigurareMedicala getInstance() {
		return asigurareMedicala;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNumeAsigurat(String numeAsigurat) {
		this.numeAsigurat = numeAsigurat;
	}
	public void setContributie(float contributie) {
		this.contributie = contributie;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AsigurareMedicala [id=");
		builder.append(id);
		builder.append(", numeAsigurat=");
		builder.append(numeAsigurat);
		builder.append(", contributie=");
		builder.append(contributie);
		builder.append("]");
		return builder.toString();
	}
	
	

}
