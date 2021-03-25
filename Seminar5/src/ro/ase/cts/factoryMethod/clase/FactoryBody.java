package ro.ase.cts.factoryMethod.clase;

public class FactoryBody implements FactoryCategorie {

	@Override
	public Categorie createCategorie(float pretDeBaza) {
		return new Body(pretDeBaza);
	}

}
