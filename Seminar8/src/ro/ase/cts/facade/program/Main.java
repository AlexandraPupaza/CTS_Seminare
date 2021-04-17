package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.IndicatorMese;
import ro.ase.cts.facade.clase.Masa;
//import ro.ase.cts.facade.clase.OperatorMese;
//import ro.ase.cts.facade.clase.Picolo;

public class Main {
	
	public static void main(String[] args) {
		
		//Masa masa = new Masa(10,0);
		
		//if(OperatorMese.esteLiber(masa)) {
		//	Picolo mihai = new Picolo("Mihai");
		//	if(mihai.esteDebarasata(masa) && mihai.esteAranjata(masa)) {
		//		System.out.println("Poftiti la masa!");
		//	}
		//	else {
		//		System.out.println("Mai asteptati!");
		//	}
		//}
		//else{
		//	System.out.println("Mai asteptati!");
		//}
		
		Masa masa1 = new Masa(14,6);
		if(IndicatorMese.potInvitaOameniiLaMasa(masa1)) {
			System.out.println("Poftiti la masa!");
		}
		else {
			System.out.println("Mai asteptati!");
		}
	}

}
