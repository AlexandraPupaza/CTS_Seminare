package ro.ase.cts.cumparaturi;

public class Aprozar {
	private String denumire;
	private double kgCumparate;
	private float sumaCheltuita;
	private static Aprozar instance = null;
	
	
	public Aprozar(String denumire, double kgCumparate, float sumaCheltuita) {
		super();
		this.denumire = denumire;
		this.kgCumparate = kgCumparate;
		this.sumaCheltuita = sumaCheltuita;
	}
	public static synchronized Aprozar getInstance(String denumire, double kgCumparate,float sumaCheltuita) {
		if(instance==null) {
			instance = new Aprozar(denumire, kgCumparate , sumaCheltuita);
		}
		return instance;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public void setKgCumparate(double kgCumparate) {
		this.kgCumparate = kgCumparate;
	}
	public void setSumaCheltuita(float sumaCheltuita) {
		this.sumaCheltuita = sumaCheltuita;
	}
	public static void setInstance(Aprozar instance) {
		Aprozar.instance = instance;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aprozar [denumire=");
		builder.append(denumire);
		builder.append(", kgCumparate=");
		builder.append(kgCumparate);
		builder.append(", sumaCheltuita=");
		builder.append(sumaCheltuita);
		builder.append("]");
		return builder.toString();
	}
	
	

}
