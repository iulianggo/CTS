package ro.ase.cts.PrototypeE4.clase;

public class Bilet implements IAbstractPrototype {
	private int cod;
	private String echipaA;
	private String echipaB;
	private String data;
	
	private Bilet() {
		
	}

	public Bilet(int cod, String echipaA, String echipaB, String data) {
		//+Validari
		this.cod = cod;
		this.echipaA = echipaA;
		this.echipaB = echipaB;
		this.data = data;
	}
	
	public void setCod(int cod) {
		this.cod = cod;
	}

	public int getCod() {
		return cod;
	}

	@Override
	public String toString() {
		return "Bilet [cod=" + cod + ", echipaA=" + echipaA + ", echipaB=" + echipaB + ", data=" + data + "]";
	}

	@Override
	public IAbstractPrototype copiaza() {
		Bilet bilet = new Bilet();
		bilet.cod = this.cod;
		bilet.data = this.data;
		bilet.echipaA = this.echipaA;
		bilet.echipaB = this.echipaB;
				
		return bilet;
	}
	
	
	
	
}
