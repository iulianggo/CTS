package ro.ase.cts.stateB13.clase;

public class StareOcupata implements StareMasa {

	@Override
	public void modificaStare(Masa masa) {
		if(!(masa.getStareMasa() instanceof StareOcupata)) {
			System.out.println("A fost ocupata masa cu numarul " + masa.getNrMasa());
			masa.setStareMasa(this);
		}else {
			System.out.println("Masa este deja ocupata.");
		}
		
	}

}
