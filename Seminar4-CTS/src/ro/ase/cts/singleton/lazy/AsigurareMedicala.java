package ro.ase.cts.singleton.lazy;

public class AsigurareMedicala {
	private int id;
	private String numeAsigurat;
	private float contributie;
	private static AsigurareMedicala instance = null;
	
	public AsigurareMedicala(int id, String numeAsigurat, float contributie) {
		super();
		this.id = id;
		this.numeAsigurat = numeAsigurat;
		this.contributie = contributie;
	}
	
	public static synchronized AsigurareMedicala getInstance(int id, String numeAsigurat, float contributie) {
		if(instance==null) {
			instance = new AsigurareMedicala(id, numeAsigurat, contributie);
		}
		return instance;
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

	public static void setInstance(AsigurareMedicala instance) {
		AsigurareMedicala.instance = instance;
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
