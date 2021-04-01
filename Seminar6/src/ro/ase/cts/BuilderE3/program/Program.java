package ro.ase.cts.BuilderE3.program;

import ro.ase.cts.BuilderE3.clase.Builder;
import ro.ase.cts.BuilderE3.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare1 = new Builder().setCodRezervare(1).setBauturaRacoritoare(true).build();
		Rezervare rezervare2 = new Builder().setCodRezervare(2).setMancareInclusa(true).build();
		Rezervare rezervare3 = new Builder(3).setMuzicaAmbientala(true).setMancareInclusa(true).build();
		
		System.out.println(rezervare1.toString() + "\n" + rezervare2.toString()
		+ "\n" + rezervare3.toString());
		
		
	}

}
