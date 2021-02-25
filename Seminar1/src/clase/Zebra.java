package clase;

public class Zebra extends Animal {
	private String tipMancare;

	public Zebra(String nume, String tipMancare) {
		super(nume);
		this.tipMancare = tipMancare;
	
	}

	public String getTipMancare() {
		return tipMancare;
	}
}
