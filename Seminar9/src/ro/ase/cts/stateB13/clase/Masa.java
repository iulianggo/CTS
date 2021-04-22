package ro.ase.cts.stateB13.clase;

public class Masa {
	private StareMasa stareMasa;
	private int nrMasa;
	
	public Masa(int nrMasa) {
		this.nrMasa = nrMasa;
		this.stareMasa = new StareLibera();
	}

	public StareMasa getStareMasa() {
		return stareMasa;
	}

	void setStareMasa(StareMasa stareMasa) {
		this.stareMasa = stareMasa;
	}

	public int getNrMasa() {
		return nrMasa;
	}

	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}
	
	public void modificaStareMasa(StareMasa stare) {
		stare.modificaStare(this);
	}
	
	public void rezervaMasa() {
		modificaStareMasa(new StareRezervata());
	}
	
	public void ocupaMasa() {
		modificaStareMasa(new StareOcupata());
	}
	
	public void elibereazaMasa() {
		modificaStareMasa(new StareLibera());
	}
}
