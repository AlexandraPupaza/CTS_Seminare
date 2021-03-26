package ro.ase.cts.reader;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public interface ReaderAplicant {
List<Aplicant> readAplicanti(String file) throws FileNotFoundException;//tip abstract pt a extinde fiecare reader in parte
	

}
