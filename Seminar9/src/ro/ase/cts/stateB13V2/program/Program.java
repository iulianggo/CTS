package ro.ase.cts.stateB13V2.program;

import ro.ase.cts.stateB13V2.clase.Masa;

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


