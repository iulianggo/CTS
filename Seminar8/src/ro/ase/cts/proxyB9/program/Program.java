package ro.ase.cts.proxyB9.program;

import com.sun.xml.internal.ws.util.ReadAllStream;

import ro.ase.cts.proxyB9.clase.IRezervare;
import ro.ase.cts.proxyB9.clase.ProxyRezervare;
import ro.ase.cts.proxyB9.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		IRezervare rezervare2P = new Rezervare(3, 2);
		rezervare2P.anuntaRezervare();
		
		ProxyRezervare proxy = new ProxyRezervare((Rezervare)rezervare2P);
		proxy.anuntaRezervare();
		
		((Rezervare)rezervare2P).setNrPersoane(4);
		proxy.anuntaRezervare();
	}

}
