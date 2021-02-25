package clase;

public class Giraffe extends Animal {
	private String tipMancare;
	
	public Giraffe(String nume, String tipMancare) {
		super(nume);
		this.tipMancare = tipMancare;
	
	}

	@Override
	public String getTipMancare() {
		return tipMancare;
	}

}
