package ro.ase.cts.clase;

public abstract class Categorie {
	private float pretDeBaza;

	public Categorie(float pretDeBaza) {
		this.pretDeBaza = pretDeBaza;
	}

	public float getPretDeBaza() {
		return pretDeBaza;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(getPretDeBaza());
	}

}
