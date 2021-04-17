package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaClienti {
	private Map<String, Client> clienti;
	public FabricaClienti() {
		clienti = new HashMap<String, Client>();
	}
	
	public Client getClient(String email) {
		if(clienti.containsKey(email)) {
			return clienti.get(email);
		}
		else {
			Client client =  new Client("Alexandra", 18564830, email);
			clienti.put(email, client);
			return client;
		}
		
	}

}
