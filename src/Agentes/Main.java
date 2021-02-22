package Agentes;

import IODatos.Arma;
import IODatos.IODato;

public class Main {

	public static void main(String[] args) {
	
		Arma vArma[]= new Arma[10];

		vArma[0]= new Arma("pistola", 9, false, 10, 3);
		vArma[1]= new Arma("Escopeta", 8, false, 8, 15);
		vArma[2]= new Arma("rifle asalto", 12, true, 25, 5);
		vArma[3]= new Arma("rifle francotirador", 20, true, 5, 3);
		vArma[4]= new Arma("Subfusil", 10, true, 20, 7);
		
		IODato.cargarArmas("Arma.dat", vArma);
		
	}

}
