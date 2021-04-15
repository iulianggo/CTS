package ro.ase.cts.flyweightB10.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaRezervari {
	private Map<String, FlyweightAbstract> clienti;

	public FabricaRezervari() {
		this.clienti = new HashMap<String, FlyweightAbstract>();
	}
	
	public FlyweightAbstract getClient(String email) {
		FlyweightAbstract client = clienti.get(email);
		
		if(client == null) {
			client = new Client("Nume", email, "0712345678");
			clienti.put(email, client);
		}
		
		return client;
	}
	
}
