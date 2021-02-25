package exceptii;


public class Exceptie extends Exception{
	private String mesaj;

	public Exceptie(String mesaj) {
		super();
		this.mesaj = mesaj;
	}

	public String getMesaj() {
		return mesaj;
	}
}
