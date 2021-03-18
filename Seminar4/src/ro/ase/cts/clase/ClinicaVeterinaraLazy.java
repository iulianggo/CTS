package ro.ase.cts.clase;

public class ClinicaVeterinaraLazy {
	private String nume;
	private String adresa;
	private int nrMedici;
	private float buget;
	
	private static ClinicaVeterinaraLazy instanta = null;

	private ClinicaVeterinaraLazy(String nume, String adresa, int nrMedici, float buget) {
		this.nume = nume;
		this.adresa = adresa;
		this.nrMedici = nrMedici;
		this.buget = buget;
	}
	
	public static synchronized ClinicaVeterinaraLazy getInstanta(String nume, String adresa, int nrMedici, float buget) {
//		return instanta == null ? new ClinicaVeterinaraLazy(nume, adresa, nrMedici, buget) : instanta;
		if(instanta == null) {
			instanta = new ClinicaVeterinaraLazy(nume, adresa, nrMedici, buget);
		}
		return instanta;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public int getNrMedici() {
		return nrMedici;
	}

	public void setNrMedici(int nrMedici) {
		this.nrMedici = nrMedici;
	}

	public float getBuget() {
		return buget;
	}

	public void setBuget(float buget) {
		this.buget = buget;
	}
	
	@Override
	public String toString() {
		return nume + " "  + adresa + " " + nrMedici + " " + buget;
	}
	
}
