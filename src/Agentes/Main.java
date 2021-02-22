package Agentes;

import java.util.Scanner;

public class Main {

	public static void verAgentes(Jefazo[] vAgentes) {
		
		Scanner leer = new Scanner(System.in);
		
		for (Jefazo j : vAgentes) {
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Jefazo vAgentes[] = new Jefazo[10];

		vAgentes[0]= new Jefazo("Oscar", 20, "C/ Santa Clara n18", 5000,2001);
		vAgentes[1] = new Agente007("Marcos", 20, "C/ Castelseras n2", 3000, 250, 5);
		vAgentes[2] = new AgenteEspionaje("Kasper", 20, "C/ El korral n34", 1500, 2);
		
		
		
	}

}
