package clase;

import java.util.ArrayList;
import java.util.List;

import exceptii.Exceptie;

public class Zoo {
	private List<Animal> animale;
	private Zookeeper zookeeper;
	
	
	
	public Zoo(List<Animal> animale, Zookeeper zookeeper) {
		super();
		this.animale = animale;
		this.zookeeper = zookeeper;
	}

	public Zoo() {
		zookeeper = new Zookeeper();
		animale = new ArrayList<Animal>();
	}
	
	
	
	public List<Animal> getAnimale() {
		return animale;
	}

	public void setAnimale(List<Animal> animale) {
		this.animale = animale;
	}

	public Zookeeper getZookeeper() {
		return zookeeper;
	}

	public void setZookeeper(Zookeeper zookeeper) {
		this.zookeeper = zookeeper;
	}

	public void adaugaAnimal(Animal animal) {
		animale.add(animal);
	}
	
	public void hranesteAnimale() {
		for (Animal animal : animale) {
			try {
				zookeeper.feed(animal);
			} catch (Exceptie e) {
				System.out.println(e.getMesaj());
			}
		}
	}
}
