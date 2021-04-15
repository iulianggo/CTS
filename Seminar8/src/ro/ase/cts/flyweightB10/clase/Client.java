package ro.ase.cts.flyweightB10.clase;

public class Client implements FlyweightAbstract {
	private String nume;
	private String email;	
	private String nrTelefon;

	public Client(String nume, String email, String nrTelefon) {
		super();
		this.nume = nume;
		this.email = email;
		this.nrTelefon = nrTelefon;
	}

	@Override
	public String toString() {
		return "Client [nume=" + nume + ", email=" + email + ", nrTelefon=" + nrTelefon + "]";
	}

	@Override
	public void afisareInformatii(Rezervare rezervare) {
		System.out.println(this.toString() + rezervare.toString());
	}
}
