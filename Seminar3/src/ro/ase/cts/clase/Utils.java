package ro.ase.cts.clase;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.readere.AplicantReader;

public class Utils {
	
	public static void readAndPrintAplicants(List<AplicantReader> readers) {
		
		for (AplicantReader aplicantReader : readers) {
			List<Aplicant> aplicanti = new ArrayList<>();
			try {
				aplicanti = aplicantReader.citesteAplicanti();
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			
			if (!(aplicanti.isEmpty())) {
				for (Aplicant aplicant : aplicanti)
					System.out.println(aplicant.toString());
			}
		}
	}

}
