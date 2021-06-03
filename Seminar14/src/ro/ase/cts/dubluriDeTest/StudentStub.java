package ro.ase.cts.dubluriDeTest;

import java.util.List;

import ro.ase.cts.clase.IStudent;

public class StudentStub implements IStudent {

	@Override
	public String getNume() {
		return null;
	}

	@Override
	public void setNume(String nume) {
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
		return 9;
	}

	@Override
	public int getNota(int index) {
		return 9;
	}

	@Override
	public boolean areRestante() {
		return false;
	}

}
