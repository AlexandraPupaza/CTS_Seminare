package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FabricaClienti;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {
    public  static void main(String[] args) {
    	Rezervare rezervare1 = new Rezervare(101, 4, 18);
    	Rezervare rezervare2 = new Rezervare(102, 2, 20);
    	Rezervare rezervare3 = new Rezervare(103, 10, 14);
    	
    	FabricaClienti fabrica = new FabricaClienti();
    	
    	Client client1 = fabrica.getClient("client@1.com");
    	client1.printeazaInformatiiRezervare(rezervare1);
    	fabrica.getClient("client@2.com").printeazaInformatiiRezervare(rezervare2);
    	fabrica.getClient("client@1.com").printeazaInformatiiRezervare(rezervare3);
    	
    }
}
