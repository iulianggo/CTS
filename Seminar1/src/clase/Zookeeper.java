package clase;

import exceptii.Exceptie;

public class Zookeeper {
	
	private String nume;
	
	
	
	public Zookeeper() {
		super();
	}


	public Zookeeper(String nume) {
		this.nume = nume;
	}
	

	public String getNume() {
		return nume;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}


	public void feed(Animal animal) throws Exceptie {
		if(animal != null) {
			System.out.println("Hranim animalul " + animal.getNume() + " cu " + animal.getTipMancare());
		}else {
			throw new Exceptie("Nu avem animal");
		}
	}
}
