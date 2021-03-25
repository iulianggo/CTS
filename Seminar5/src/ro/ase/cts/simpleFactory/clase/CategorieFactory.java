package ro.ase.cts.simpleFactory.clase;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

public class CategorieFactory {
	public Categorie creareCategorie(CategoriiMedicamente categoriiMedicamente, float pretDeBaza) throws Exception{
		switch(categoriiMedicamente) {
		case Raceala:
			return new Raceala(pretDeBaza);
		case Body:
			return new Body(pretDeBaza);
		case Durere:
			return new Durere(pretDeBaza);
		default:
			throw new Exception("Categorie incorecta!");
		}
	}
		
}
