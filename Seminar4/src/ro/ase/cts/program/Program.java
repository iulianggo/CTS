package ro.ase.cts.program;

import ro.ase.cts.clase.ClinicaVeterinaraEager;
import ro.ase.cts.clase.ClinicaVeterinaraLazy;

public class Program {

	public static void main(String[] args) {
//		ClinicaVeterinaraEager clinica1  = ClinicaVeterinaraEager.getInstanta();
//		ClinicaVeterinaraEager clinica2  = ClinicaVeterinaraEager.getInstanta();
		
		ClinicaVeterinaraLazy clinica1  = ClinicaVeterinaraLazy.getInstanta("Clinica1", "Str.Clin1", 10, 300f);
		ClinicaVeterinaraLazy clinica2  = ClinicaVeterinaraLazy.getInstanta("Clinica2", "Str.Clin2", 23, 600f);
		
		
		
		System.out.println(clinica1.toString());
		System.out.println(clinica2.toString());
		
		clinica1.setNume("Clinica 1!");
		clinica2.setNrMedici(45);
		
		System.out.println(clinica1.toString());
		System.out.println(clinica2.toString());
	}

}
