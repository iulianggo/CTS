package ro.ase.cts.stateB13.program;

import ro.ase.cts.stateB13.clase.Masa;
import ro.ase.cts.stateB13.clase.StareLibera;

public class Program {

	public static void main(String[] args) {
		Masa masa = new Masa(20);
		
		masa.rezervaMasa();
		masa.rezervaMasa();
		
		masa.ocupaMasa();
		masa.ocupaMasa();
		
		masa.elibereazaMasa();
		masa.elibereazaMasa();
	}

}
