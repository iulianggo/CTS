package ro.ase.cts.compositeB8.clase;

public interface IOptiuneMeniu {
	void adaugaNod(IOptiuneMeniu optiune) throws Exception; //pt ca avem si subsectiuni si items
	void stergeNod(IOptiuneMeniu optiune);
	IOptiuneMeniu getNod(int index);
	void descriere();
}
