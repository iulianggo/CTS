package ro.ase.cts.PrototypeE4.clase;

public class Client implements IAbstractPrototype {
	private int codClient;
	private String nume;
	private int varsta;
	
	private Client() {
	}

	public Client(int codClient, String nume, int varsta) {
		//Validarea varstei
		this.codClient = codClient;
		this.nume = nume;
		this.varsta = varsta;
	}

	@Override
	public String toString() {
		return "Client [codClient=" + codClient + ", nume=" + nume + ", varsta=" + varsta + "]";
	}

	@Override
	public IAbstractPrototype copiaza() {
		Client client = new Client();
		client.codClient = this.codClient;
		client.nume = this.nume;
		client.varsta = this.varsta;
		
		return client;
	}
	
}
