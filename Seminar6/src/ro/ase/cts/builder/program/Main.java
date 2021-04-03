package ro.ase.cts.builder.program;

import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilder;
import ro.ase.cts.builder.clase.RezervareBuilderV2;

public class Main {
	public static void main(String[] args) {
		Rezervare rezervare =  new Rezervare(1, false, true, true, false, "Pop");
		System.out.println(rezervare.toString());
		Rezervare rezervare2 = new RezervareBuilder().setCodRezervare(5).setBauturaRacoritoareInclusa(true).setMuzicaAmbientala(true).build();
		System.out.println(rezervare2.toString());
		Rezervare rezervare3 = new RezervareBuilder().setCodRezervare(6).setMancareInclusa(true).setScaunErgonomic(true).build();
		System.out.println(rezervare3.toString());
		Rezervare rezervare4 = new RezervareBuilder(7).setGenMuzica("folck").build();
		System.out.println(rezervare4.toString());
		
		RezervareBuilder builder =  new RezervareBuilder();
		Rezervare r1;
		Rezervare r2;
		r1 = builder.setCodRezervare(8).setBauturaRacoritoareInclusa(true).build();
		r2 = builder.setCodRezervare(9).build();
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		RezervareBuilderV2 builder2 = new RezervareBuilderV2().setBauturaRacoritoareInclusa(true).setMancareInclusa(true);
		Rezervare rezervare5 = builder2.setCodRezervare(11).build();
		Rezervare rezervare6 = builder2.setCodRezervare(12).build();
		System.out.println(rezervare5.toString());
		System.out.println(rezervare6.toString());
	}

}
