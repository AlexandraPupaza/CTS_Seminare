package ro.ase.cts.observer.clase;

public class ManagerSala extends ManagerSalaAbstract {
	
	public String denumireSala;

	public ManagerSala(String denumireSala) {
		super();
		this.denumireSala = denumireSala;
	}
	
	public void anuntaMeci(String tipMeci) {
		
		super.notifica("Va avea loc un meci de " + tipMeci + " in sala " + denumireSala);
	}

}
