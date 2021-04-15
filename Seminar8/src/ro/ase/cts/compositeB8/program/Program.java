package ro.ase.cts.compositeB8.program;

import ro.ase.cts.compositeB8.clase.IOptiuneMeniu;
import ro.ase.cts.compositeB8.clase.Item;
import ro.ase.cts.compositeB8.clase.Sectiune;

public class Program {

	public static void main(String[] args) {
		IOptiuneMeniu meniu = new Sectiune("Meniu Restaurant");
		
		IOptiuneMeniu optiune1 = new Sectiune("Bauturi");
		IOptiuneMeniu optiune2 = new Sectiune("Desert");
		
		IOptiuneMeniu item1 = new Item("Frappe");
		IOptiuneMeniu item2 = new Item("apa plata");
		IOptiuneMeniu item4 = new Item("papanasi");
		
		try {
			meniu.adaugaNod(optiune1);
			meniu.adaugaNod(optiune2);
			
			optiune1.adaugaNod(item1);
			optiune1.adaugaNod(item2);
			optiune2.adaugaNod(item4);
			
			meniu.descriere();
			
			optiune1.stergeNod(item1);
			optiune2.adaugaNod(item1);
			
			meniu.descriere();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
