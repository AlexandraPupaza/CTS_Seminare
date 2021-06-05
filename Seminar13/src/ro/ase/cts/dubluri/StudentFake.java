package ro.ase.cts.dubluri;

import java.util.List;

import ro.ase.cts.clase.IStudent;

public class StudentFake implements IStudent {
	private String valoareNume;
	private List<Integer> valoareLista;
	private float valoareMedie;
	private int valoareNota;
	private boolean valoareAreRestanta;
	
	

	public void setValoareNume(String valoareNume) {
		this.valoareNume = valoareNume;
	}

	public void setValoareLista(List<Integer> valoareLista) {
		this.valoareLista = valoareLista;
	}

	public void setValoareMedie(float valoareMedie) {
		this.valoareMedie = valoareMedie;
	}

	public void setValoareNota(int valoareNota) {
		this.valoareNota = valoareNota;
	}

	public void setValoareAreRestanta(boolean valoareAreRestanta) {
		this.valoareAreRestanta = valoareAreRestanta;
	}

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return this.valoareNume;
	}

	@Override
	public void setNume(String nume) {
         
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return this.valoareLista;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		// TODO Auto-generated method stub
		return this.valoareMedie;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return this.valoareNota;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return this.valoareAreRestanta;
	}

}
