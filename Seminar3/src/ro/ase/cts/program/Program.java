package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Utils;
import ro.ase.cts.readere.AngajatReader;
import ro.ase.cts.readere.AplicantReader;
import ro.ase.cts.readere.ElevReader;
import ro.ase.cts.readere.StudentReader;

public class Program {
	
	public static void main(String[] args) {
		
		List<Aplicant> listaAngajati;
		AngajatReader angajatReader = new AngajatReader("angajati.txt");
		StudentReader studentReader = new StudentReader("studenti.txt");
		ElevReader elevReader1 = new ElevReader("elevi.txt");
		List<AplicantReader> readers = new ArrayList<>();
		readers.add(angajatReader);
		readers.add(studentReader);
		readers.add(elevReader1);

		Utils.readAndPrintAplicants(readers);
	}
}
