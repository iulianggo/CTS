package ro.ase.cts.stateB13.clase;

public class StareRezervata implements StareMasa {

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStareMasa() instanceof StareLibera) {
			System.out.println("Ati rezervat masa cu numarul " + masa.getNrMasa());
			masa.setStareMasa(this);
		}else {
			System.out.println("Masa nu este disponibila.");
		}
		
	}

}
