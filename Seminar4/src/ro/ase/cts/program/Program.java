package ro.ase.cts.program;

import ro.ase.cts.clase.ClinicaVeterinaraEager;
import ro.ase.cts.clase.ClinicaVeterinaraLazy;
import ro.ase.cts.singletonTest.Giratoriu;

public class Program {

	public static void main(String[] args) {
//		ClinicaVeterinaraEager clinica1  = ClinicaVeterinaraEager.getInstanta();
//		ClinicaVeterinaraEager clinica2  = ClinicaVeterinaraEager.getInstanta();
		
//		ClinicaVeterinaraLazy clinica1  = ClinicaVeterinaraLazy.getInstanta("Clinica1", "Str.Clin1", 10, 300f);
//		ClinicaVeterinaraLazy clinica2  = ClinicaVeterinaraLazy.getInstanta("Clinica2", "Str.Clin2", 23, 600f);
//		
//		System.out.println(clinica1.toString());
//		System.out.println(clinica2.toString());
//		
//		clinica1.setNume("Clinica 1!");
//		clinica2.setNrMedici(45);
//		
//		System.out.println(clinica1.toString());
//		System.out.println(clinica2.toString());
		
		Giratoriu g1  = Giratoriu.getInstanta("Piata Universitatii", 23.5f, 4);
		Giratoriu g2  = Giratoriu.getInstanta("G2", 15f, 3);
		
		System.out.println(g1.toString());
		System.out.println(g2.toString());
		
		g1.setDiametru(37.67f);
		g2.setDenumire("Giratoriu2");
		
		System.out.println(g1.toString());
		System.out.println(g2.toString());
	}

}
