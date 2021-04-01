package ro.ase.cts.BuilderE3V1.clase;

import ro.ase.cts.BuilderE3.clase.Builder;
import ro.ase.cts.BuilderE3V1.clase.Rezervare;

public class BuilderV1 implements IBuilder{
	private boolean mancareInclusa;
	private boolean scaunErgonomic;
	private boolean bauturaRacoritoare;
	private boolean muzicaAmbientala;
	private String genMuzica;
	private int codRezervare;
	
	public BuilderV1() {
		this.mancareInclusa = false;
		this.scaunErgonomic = false;
		this.bauturaRacoritoare = false;
		this.muzicaAmbientala = false;
		this.genMuzica = "";
		this.codRezervare = 0;
	}
	
	public BuilderV1(int cod) {
		this.mancareInclusa = false;
		this.scaunErgonomic = false;
		this.bauturaRacoritoare = false;
		this.muzicaAmbientala = false;
		this.genMuzica = "";
		this.codRezervare = cod;
	}

	public BuilderV1 setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
		return this;
	}

	public BuilderV1 setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
		return this;
	}

	public BuilderV1 setBauturaRacoritoare(boolean bauturaRacoritoare) {
		this.bauturaRacoritoare = bauturaRacoritoare;
		return this;
	}

	public BuilderV1 setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
		return this;
	}

	public BuilderV1 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}

	public BuilderV1 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}


	@Override
	public Rezervare build() {
		Rezervare rezervare = new Rezervare(mancareInclusa, scaunErgonomic, bauturaRacoritoare,
				muzicaAmbientala, "",  codRezervare);
		return rezervare;
	}
}
