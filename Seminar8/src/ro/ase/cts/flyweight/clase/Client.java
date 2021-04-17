package ro.ase.cts.flyweight.clase;

public class Client implements FlyweightAbstract{
	
	private String nume;
	private int nrTelefon;
	private String email;
	
	public Client(String nume, int nrTelefon, String email) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.email = email;
	}

	@Override
	public void printeazaInformatiiRezervare(Rezervare rezervare) {
		System.out.println(rezervare.toString() + this.toString());

		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [nume=");
		builder.append(nume);
		builder.append(", nrTelefon=");
		builder.append(nrTelefon);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
