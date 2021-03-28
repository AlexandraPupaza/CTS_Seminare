package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.reader.ReaderAngajati;
import ro.ase.cts.reader.ReaderAplicanti;
import ro.ase.cts.reader.ReaderElevi;
import ro.ase.cts.reader.ReaderStudenti;

public class Program {
     
	public static List<Aplicant> citireAplicanti(ReaderAplicanti readAplicant) throws FileNotFoundException{
		return readAplicant.readAplicanti();
	}
	
	public static void main(String[] args) {
		//Aplicant aplicant;
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citireAplicanti(new ReaderStudenti("studenti.txt"));
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
			   // System.out.println(aplicant.finantare());
			    //aplicant.statut();
			    
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
