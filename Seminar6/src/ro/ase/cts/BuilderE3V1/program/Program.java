package ro.ase.cts.BuilderE3V1.program;

import ro.ase.cts.BuilderE3V1.clase.BuilderV1;
import ro.ase.cts.BuilderE3V1.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		BuilderV1 builder = new BuilderV1();
		builder.setBauturaRacoritoare(true);
		builder.setMancareInclusa(true);
		
		Rezervare rezervare = builder.setCodRezervare(1).build();
		Rezervare rezervare1 = builder.setCodRezervare(56).build();
		
		System.out.println(rezervare.toString() + "\n" + rezervare1.toString());
		
	}

}
