package ro.ase.cts.state.clase;

public class Rezervata implements IStareMasa {

	@Override
	public void modificastare(Masa masa) {
		if(masa.getStareMasa() instanceof Libera);{
            masa.setStareMasa(this);
		}
	}

}
