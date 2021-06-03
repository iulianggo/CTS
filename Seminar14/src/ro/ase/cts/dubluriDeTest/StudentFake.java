package ro.ase.cts.dubluriDeTest;

import java.util.List;

import ro.ase.cts.clase.IStudent;

public class StudentFake implements IStudent {
	private String nume;
	private float medie;
	private boolean areRestante;
	
	public StudentFake() {
	}
	
	public StudentFake(String nume, float medie, boolean areRestante) {
		super();
		this.nume = nume;
		this.medie = medie;
		this.areRestante = areRestante;
	}

	public void setMedie(float medie) {
		this.medie = medie;
	}

	public void setAreRestante(boolean areRestante) {
		this.areRestante = areRestante;
	}

	@Override
	public String getNume() {
		return nume;
	}

	@Override
	public void setNume(String nume) {
		this.nume = nume;
	}

	@Override
	public List<Integer> getNote() {
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		
	}

	@Override
	public float calculeazaMedie() {
		return medie;
	}

	@Override
	public int getNota(int index) {
		return 0;
	}

	@Override
	public boolean areRestante() {
		return areRestante;
	}
}
