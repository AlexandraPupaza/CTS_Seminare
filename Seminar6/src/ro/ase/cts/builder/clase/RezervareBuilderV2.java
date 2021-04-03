package ro.ase.cts.builder.clase;

public class RezervareBuilderV2 implements AbstractBuilder {

	private int codRezervare;
	private boolean mancareInclusa;
	private boolean scaunErgonomic;
	private boolean bauturaRacoritoareInclusa;
	private boolean muzicaAmbientala;
	private String genMuzica;

	public RezervareBuilderV2() {

	}

	public RezervareBuilderV2 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}

	public RezervareBuilderV2  setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
		return this;
	}

	public RezervareBuilderV2 setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
		return this;
	}

	public RezervareBuilderV2 setBauturaRacoritoareInclusa(boolean bauturaRacoritoareInclusa) {
		this.bauturaRacoritoareInclusa = bauturaRacoritoareInclusa;
		return this;
	}

	public RezervareBuilderV2 setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
		return this;
	}

	public RezervareBuilderV2 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}

	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return new Rezervare(codRezervare, mancareInclusa, scaunErgonomic, bauturaRacoritoareInclusa, muzicaAmbientala, genMuzica);
	}

}
