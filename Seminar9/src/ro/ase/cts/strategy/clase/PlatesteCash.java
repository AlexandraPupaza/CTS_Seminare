package ro.ase.cts.strategy.clase;

public class PlatesteCash implements IModPlata  {

	@Override
	public void plateste(int suma) {
         System.out.println(" A fost platit cash suma de " + suma);
		
	}

}
