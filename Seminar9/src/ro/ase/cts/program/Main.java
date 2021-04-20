package ro.ase.cts.program;

import ro.ase.cts.proxy.clase.OperatorRezervare;
import ro.ase.cts.proxy.clase.ProxyRezervare;

public class Main {
public static void main(String [] args) {
	OperatorRezervare operator = new OperatorRezervare("BigBen");
	operator.rezerva(2);
	
	ProxyRezervare proxy = new ProxyRezervare(operator, 4);
	proxy.rezerva(2);
	proxy.rezerva(4);
}
}
