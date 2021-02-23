package Agentes;

import java.util.Scanner;

import Menu.Menu;

public class Main {

	public static void verAgentes(Agente[] vAgentes) {
		
		Scanner leer = new Scanner(System.in);
		
		for (Agente a : vAgentes) {
			if (a!=null) {
				System.out.println(a);
			}

		}

	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		

		Menu.pintaMenu();
		try {
			opc=leer.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
		}
		Menu.eleccionMenu(opc);
/*
		Jefazo vAgentes[] = new Jefazo[10];

		vAgentes[0] = new Jefazo("Oscar", 20, "C/ Santa Clara n18", 5000, 2001);
		vAgentes[1] = new Agente007("Marcos", 20, "C/ Castelseras n2", 3000, 250, 5);
		vAgentes[2] = new AgenteEspionaje("Kasper", 20, "C/ El korral n34", 1500, 2);
*/

		Agente[] vAgentes = new Agente[10];

		vAgentes[0] = new Jefazo("Oscar", 20, "C/ Santa Clara", 5000, 2011);
		vAgentes[1] = new Agente007("Marcos", 20, "C/ Castelseras n2", 3000, 250, 5);
		vAgentes[2] = new AgenteEspionaje("Kasper", 20, "C/ El korral n34", 1500, 2);
		
		verAgentes(vAgentes);
		
		
	}

}
