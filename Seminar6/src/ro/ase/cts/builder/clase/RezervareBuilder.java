package ro.ase.cts.builder.clase;

public class RezervareBuilder implements AbstractBuilder {
	
	private Rezervare rezervare;

	public RezervareBuilder() {
		super();
		rezervare = new Rezervare(2, false, false, false, false, " ");
	}
	
	public RezervareBuilder(int codRezervare) {
		rezervare = new Rezervare(codRezervare, false, false, false, false, " ");
	}

	public RezervareBuilder setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}


	public RezervareBuilder setMancareInclusa(boolean mancareInclusa) {
		rezervare.setMancareInclusa(mancareInclusa);
		return this;
	}


	public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
		rezervare.setScaunErgonomic(scaunErgonomic);
		return this;
	}


	public RezervareBuilder setBauturaRacoritoareInclusa(boolean bauturaRacoritoareInclusa) {
		rezervare.setBauturaRacoritoareInclusa(bauturaRacoritoareInclusa);
		return this;
	}


	public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
		rezervare.setMuzicaAmbientala(muzicaAmbientala);
		return this;
		
	}


	public RezervareBuilder setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}


	@Override
	public Rezervare build() {
		return rezervare;
	}
	
	
	
	

	

	
	

}
