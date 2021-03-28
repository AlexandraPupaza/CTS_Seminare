package ro.ase.cts.reader;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class ReaderAplicanti {
	protected String numeFisiser;
    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;//tip abstract pt a extinde fiecare reader in parte
//metoda abstracta ce returneaza o lista de aplicanti 
//o facem clasa abstracta pt a putea adauga un atributde tip numeFisier
    //constructor cu parametrii
	public ReaderAplicanti(String numeFisiser) {
		super();
		this.numeFisiser = numeFisiser;
	}
	//constructor default
   public ReaderAplicanti() {
	super();
}



 


}
