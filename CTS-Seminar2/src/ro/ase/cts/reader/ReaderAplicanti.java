package ro.ase.cts.reader;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

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
	
	public void readAplicant(Scanner scanner, Aplicant aplicant){//metoda ce citeste atributele unui aplicant
		String nume = scanner.next();
		String prenume = scanner.next();
		int varsta = scanner.nextInt();
		int punctaj = scanner.nextInt();
		int nr = scanner.nextInt();
		String[] vect = new String[5];
		for (int i = 0; i < nr; i++)
			vect[i] = scanner.next();
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setDenumiriProiecte(vect, nr);
		 
	
	}

}



 



