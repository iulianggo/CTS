package ro.ase.cts.program;

import ro.ase.cts.clase.Categorie;
import ro.ase.cts.clase.CategorieFactory;
import ro.ase.cts.clase.CategoriiMedicamente;

public class Program {
	public static CategoriiMedicamente getTipCategorie() {
		return CategoriiMedicamente.Body;
	}

	public static void main(String[] args) {
		try {
//			Problema 1 din pachetul C
//			Simple Factory
			CategorieFactory factory = new CategorieFactory();
			Categorie durere = factory.creareCategorie(CategoriiMedicamente.Durere, 25);
			Categorie body = factory.creareCategorie(CategoriiMedicamente.Body, 20);
			Categorie categorie = factory.creareCategorie(getTipCategorie(), 30);
			
			System.out.println(durere.toString());
			System.out.println(body.toString());
			System.out.println(categorie);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
