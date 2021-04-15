package ro.ase.cts.compositeB8.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IOptiuneMeniu{
	List<IOptiuneMeniu> lista;
	private String numeSectiune;
	
	public Sectiune(String numeSectiune) {
		this.lista = new ArrayList<>();
		this.numeSectiune = numeSectiune;
	}

	@Override
	public void adaugaNod(IOptiuneMeniu optiune) {
		lista.add(optiune);
		
	}

	@Override
	public void stergeNod(IOptiuneMeniu optiune) {
		lista.remove(optiune);
	}

	@Override
	public IOptiuneMeniu getNod(int index) {
		return lista.get(index);
	}

	@Override
	public void descriere() {
		System.out.println("Sectiunea: " + numeSectiune);
		for(IOptiuneMeniu optiune: lista) {
			optiune.descriere();
		}
	}
	
	
}
