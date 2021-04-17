package ro.ase.cts.facade.clase;

public class IndicatorMese {
	public static boolean potInvitaOameniiLaMasa(Masa masa) {
		if(OperatorMese.esteLiber(masa)) {
			Picolo catalin = new Picolo("Catalin");
			if(catalin.esteDebarasata(masa) && catalin.esteAranjata(masa)) {
			return true;
			}
			else {
				return false;
			}
		}
		else
		{
			return false;
		}
	}

}
