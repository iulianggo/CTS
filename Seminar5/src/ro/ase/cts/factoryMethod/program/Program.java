package ro.ase.cts.factoryMethod.program;

import ro.ase.cts.factoryMethod.clase.Categorie;
import ro.ase.cts.factoryMethod.clase.FactoryBody;
import ro.ase.cts.factoryMethod.clase.FactoryCategorie;
import ro.ase.cts.factoryMethod.clase.FactoryDurere;

public class Program {
	
	public static FactoryCategorie getTipFactory() {
		return new FactoryBody();
	}
	
	public static void printeazaCategorie(FactoryCategorie factoryCategorie, float pretDeBaza) {
		Categorie categorie = factoryCategorie.createCategorie(pretDeBaza);
		System.out.println(categorie.toString());
	}
	public static void main(String[] args) {
		// Problema 2C
		printeazaCategorie(getTipFactory(), 20);
	}

}
