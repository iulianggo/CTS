package ro.ase.cts.readere;

import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class AplicantReader{
	private String fileName;

	public String getFileName() {
		return fileName;
	}

	public AplicantReader(String fileName) {
		super();
		this.fileName = fileName;
	}

	public abstract List<Aplicant> citesteAplicanti();
	
}
