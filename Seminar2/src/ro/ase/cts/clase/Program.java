package ro.ase.cts.clase;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.readere.AngajatReader;
import ro.ase.cts.readere.AplicantReader;
import ro.ase.cts.readere.ElevReader;

public class Program {
	
	public static List<Aplicant> citesteAplicanti(AplicantReader reader) throws FileNotFoundException{
		return reader.citesteAplicanti();
	}
	
	public static void main(String[] args) {
		
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti(new AngajatReader("angajati.txt"));
			for(Aplicant angajat:listaAplicanti)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
