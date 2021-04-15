package ro.ase.cts.flyweightB10.program;

import ro.ase.cts.flyweightB10.clase.FabricaRezervari;
import ro.ase.cts.flyweightB10.clase.FlyweightAbstract;
import ro.ase.cts.flyweightB10.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare rez1 = new Rezervare(1, 3, "12:00");
		Rezervare rez2 = new Rezervare(3, 5, "15:00");
		Rezervare rez3 = new Rezervare(5, 6, "18:00");
		
		FabricaRezervari fabrica = new FabricaRezervari();
		
		fabrica.getClient("client@gmail.com").afisareInformatii(rez1);
		fabrica.getClient("client@gmail.com").afisareInformatii(rez2);
		fabrica.getClient("client2@gmail.com").afisareInformatii(rez3);
		
	}

}
