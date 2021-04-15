package ro.ase.cts.compositeB8.clase;

public class Item implements IOptiuneMeniu{
	private String numeItem;

	public Item(String numeItem) {
		this.numeItem = numeItem;
	}

	@Override
	public void adaugaNod(IOptiuneMeniu optiune) throws Exception {
		throw new Exception("Exceptie");
		
	}

	@Override
	public void stergeNod(IOptiuneMeniu optiune) {
		throw new IllegalArgumentException("Exceptie");
		
	}

	@Override
	public IOptiuneMeniu getNod(int index) {
		throw new IllegalArgumentException("Exceptie");
	}

	@Override
	public void descriere() {
		System.out.println("Item: " + numeItem);	
	}
}
