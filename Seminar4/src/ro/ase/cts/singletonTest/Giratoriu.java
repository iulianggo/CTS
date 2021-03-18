package ro.ase.cts.singletonTest;

public class Giratoriu {
	private String denumire;
	private float diametru;
	private int nrIntrari;
	
	private static Giratoriu instanta = null;

	private Giratoriu(String denumire, float diametru, int nrIntrari) {
		super();
		this.denumire = denumire;
		this.diametru = diametru;
		this.nrIntrari = nrIntrari;
	}
	
	public static synchronized Giratoriu getInstanta(String denumire, float diametru, int nrIntrari) {
		if(instanta == null) {
			instanta = new Giratoriu(denumire, diametru, nrIntrari);
		}
		return instanta;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public void setDiametru(float diametru) {
		this.diametru = diametru;
	}

	public void setNrIntrari(int nrIntrari) {
		this.nrIntrari = nrIntrari;
	}

	@Override
	public String toString() {
		return denumire + " "  + diametru + " " + nrIntrari + " ";
	}
	
	
}
