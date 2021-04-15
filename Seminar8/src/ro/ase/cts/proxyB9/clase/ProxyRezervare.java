package ro.ase.cts.proxyB9.clase;

public class ProxyRezervare implements IRezervare {
	
	private static final int NR_MINIM_PERSOANE = 4;
	private Rezervare rezervare;
	
	public ProxyRezervare(Rezervare rezervare) {
		this.rezervare = rezervare;
	}

	@Override
	public void anuntaRezervare() {
		if(rezervare.getNrPersoane() >= NR_MINIM_PERSOANE) {
			rezervare.anuntaRezervare();
		}else {
			System.out.println("Prezentati va fizic la restaurant");
		}
	}

}
