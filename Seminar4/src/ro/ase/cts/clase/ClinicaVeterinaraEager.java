package ro.ase.cts.clase;

public class ClinicaVeterinaraEager {
	private String nume;
	private String adresa;
	private int nrMedici;
	private float buget;
	//Instanta statica este initializata la momentul declararii
	private static final ClinicaVeterinaraEager instanta = new ClinicaVeterinaraEager();
	
	private ClinicaVeterinaraEager() {
		this.nume = "ClinVet";
		this.adresa = "Str.Clinica";
		this.nrMedici = 4;
		this.buget = 1000;
	}
	
	public static ClinicaVeterinaraEager getInstanta() {
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
//
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
