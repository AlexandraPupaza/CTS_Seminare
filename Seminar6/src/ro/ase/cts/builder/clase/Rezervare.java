package ro.ase.cts.builder.clase;

public class Rezervare {
	private int codRezervare;
	private boolean mancareInclusa;
	private boolean scaunErgonomic;
	private boolean bauturaRacoritoareInclusa;
	private boolean muzicaAmbientala;
	private String genMuzica;
	
	
	public Rezervare(int codRezervare, boolean mancareInclusa, boolean scaunErgonomic,
			boolean bauturaRacoritoareInclusa, boolean muzicaAmbientala, String genMuzica) {
		super();
		this.codRezervare = codRezervare;
		this.mancareInclusa = mancareInclusa;
		this.scaunErgonomic = scaunErgonomic;
		this.bauturaRacoritoareInclusa = bauturaRacoritoareInclusa;
		this.muzicaAmbientala = muzicaAmbientala;
		this.genMuzica = genMuzica;
	}


	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}


	public void setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
	}


	public void setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
	}


	public void setBauturaRacoritoareInclusa(boolean bauturaRacoritoareInclusa) {
		this.bauturaRacoritoareInclusa = bauturaRacoritoareInclusa;
	}


	public void setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
	}


	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [codRezervare=");
		builder.append(codRezervare);
		builder.append(", mancareInclusa=");
		builder.append(mancareInclusa);
		builder.append(", scaunErgonomic=");
		builder.append(scaunErgonomic);
		builder.append(", bauturaRacoritoareInclusa=");
		builder.append(bauturaRacoritoareInclusa);
		builder.append(", muzicaAmbientala=");
		builder.append(muzicaAmbientala);
		builder.append(", genMuzica=");
		builder.append(genMuzica);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
