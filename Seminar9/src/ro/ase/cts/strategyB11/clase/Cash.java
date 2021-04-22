package ro.ase.cts.strategyB11.clase;

public class Cash implements ModPlata {

	@Override
	public void plateste(double sumaPlatita) {
		System.out.println("Se plateste cash suma de " + sumaPlatita);
		
	}

}
