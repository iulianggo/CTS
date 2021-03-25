package ro.ase.cts.factoryMethod.clase;

public class FactoryDurere implements FactoryCategorie {
	
	@Override
	public Categorie createCategorie(float pretDeBaza) {
		return new Durere(pretDeBaza);
	}


}
