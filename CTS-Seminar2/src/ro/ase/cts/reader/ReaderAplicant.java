package ro.ase.cts.reader;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class ReaderAplicant {
	private String numeFisier;
	public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;
	public ReaderAplicant(String numeFisier) {
		super();
		this.numeFisier = numeFisier;
	}
	
	
	

}
