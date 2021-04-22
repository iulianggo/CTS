package ro.ase.cts.strategyB11.program;

import ro.ase.cts.strategyB11.clase.Card;
import ro.ase.cts.strategyB11.clase.Cash;
import ro.ase.cts.strategyB11.clase.Client;
import sun.misc.Cache;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client("Popescu");
		client.setModPlata(new Cash());
		
		client.platesteNota(200.00);
		
		client.setModPlata(new Card(500.00));
		client.platesteNota(350.00);
		client.platesteNota(200.00);

	}

}
