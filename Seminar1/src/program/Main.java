package program;
import clase.*;

public class Main {

	public static void main(String[] args) {
		//
		Zookeeper zookeeper = new Zookeeper("Z1");
		Zoo zoo = new Zoo();
		
		zoo.setZookeeper(zookeeper);
		
		Giraffe giraffe = new Giraffe("Girafa", "frunze");
		Giraffe secondGiraffe = new Giraffe("Girafa1", "iarba");
		
		Zebra zebra = new Zebra("Zebra", "zebra");
		Zebra sZebra = new Zebra("Zebra2", "mancareZebra");
		
		zoo.adaugaAnimal(giraffe);
		zoo.adaugaAnimal(secondGiraffe);
		zoo.adaugaAnimal(zebra);
		zoo.adaugaAnimal(sZebra);
		
		zoo.hranesteAnimale();
	}

}
