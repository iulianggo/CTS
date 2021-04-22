package ro.ase.cts.strategyB11.clase;

public class Client {
	private ModPlata modPlata;
	private String numeClient;
	
	public Client(ModPlata modPlata, String numeClient) {
		super();
		this.modPlata = modPlata;
		this.numeClient = numeClient;
	}

	public Client(String numeClient) {
		super();
		this.numeClient = numeClient;
	}

	public ModPlata getModPlata() {
		return modPlata;
	}

	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}

	public String getNumeClient() {
		return numeClient;
	}

	public void setNumeClient(String numeClient) {
		this.numeClient = numeClient;
	}
	
	public void platesteNota(double suma) {
		System.out.println(numeClient + " trebuie sa realizeze o plata.");
		modPlata.plateste(suma);
	}
	
	
}
