package ro.ase.cts.PrototypeE4.program;

import ro.ase.cts.PrototypeE4.clase.Bilet;
import ro.ase.cts.PrototypeE4.clase.Client;

public class Program {

	public static void main(String[] args) {
		Client client = new Client(100, "Nume", 35);
		Client clientCopy = (Client)client.copiaza();//pt ca returneaza prototip abstract are nevoie de cast
		
		System.out.println(client.toString());
		System.out.println(clientCopy.toString());
		
		Bilet bilet = new Bilet(0, "E1", "E2", "25/04/2021");
		Bilet biletCopy = (Bilet)bilet.copiaza();
		biletCopy.setCod(1);
		
		Bilet biletCopy1 = (Bilet)bilet.copiaza();
		biletCopy.setCod(2);
		
		System.out.println(bilet.toString());
		System.out.println(biletCopy.toString());
		System.out.println(biletCopy1.toString());

	}

}
