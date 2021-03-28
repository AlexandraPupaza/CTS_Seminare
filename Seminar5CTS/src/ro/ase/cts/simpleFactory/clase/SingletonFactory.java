package ro.ase.cts.simpleFactory.clase;

public class SingletonFactory {
	private static SingletonFactory singletonFactory = null;
	private SingletonFactory() {
	super();
	}	
	public static synchronized SingletonFactory getInstance() {
		if(singletonFactory == null) {
			singletonFactory = new SingletonFactory();
			
		}
		return singletonFactory;
	}
	
	public Jucator getJucator(TipJucator tipJucator, String nume, int varsta) {
		switch(tipJucator) {
		case PORTAR: 
			return new Portar(nume, varsta);
		case FUNDAS: 
			return new Fundas(nume, varsta);
		case ATACANT: 
			return new Atacant(nume, varsta);
		default:
            throw new IllegalArgumentException();
		}
		
	}
}
