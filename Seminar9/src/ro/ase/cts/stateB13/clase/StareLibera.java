package ro.ase.cts.stateB13.clase;

public class StareLibera implements StareMasa {

	@Override
	public void modificaStare(Masa masa) {
		if(!(masa.getStareMasa() instanceof StareLibera)) {
			System.out.println("Masa cu numarul " + masa.getNrMasa() + " a fost eliberata.");
			masa.setStareMasa(this);
		}else {
			System.out.println("Masa este deja libera");
		}
		
	}

}
