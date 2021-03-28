package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int i) {
		this.clasa = i;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	@Override
	public String toString() {
		StringBuilder stringBuilder= new StringBuilder();
		stringBuilder.append(super.toString());
		stringBuilder.append("Elev [clasa=");
		stringBuilder.append(clasa);
		stringBuilder.append(", tutore=");
		stringBuilder.append(tutore);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
	
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	
	public String finantare() {
		final StringBuilder builder=new StringBuilder("Student:");
		builder.append(super.finantare());
		builder.append("primeste suma de ");
		builder.append(Proiect.finantareElev);
		builder.append("Euro/zi pe proiect");
		return builder.toString();
		
	}
	
}
