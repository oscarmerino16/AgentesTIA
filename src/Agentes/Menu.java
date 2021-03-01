package Agentes;

import java.util.Scanner;
/**
 * Clase para pintar el menu.
 * @author Óscar Merino Cases y Marcos Hernández Aragonés
 * @version 1/03/2021 1.0
 */
public class Menu {

	/**
	 * Metodo para ver el Menu y que nos devuelva una opcion.
	 * @return Devuelve la opcion selecionada.
	 */
	
	public static int pintaMenu() {
		int opc =0;
		Scanner leer = new Scanner(System.in);
		
		do {
			System.out.println("Bien venido a los agentes TIA que te gustaria hacer");
			System.out.println("");
			System.out.println("1 Ver todos los agentes con su informacio");
			System.out.println("2 Ver los agentes que ganen mas de lo que tu me digas");
			System.out.println("3 Dar de alta un piso.");
			System.out.println("4 Dar de alta una nueva arma");
			System.out.println("5 Dar de alta un nuevo agente");
			System.out.println("6 Encriptar todo");
			System.out.println("7 Dessencriptar todo");
			System.out.println("8 Salir");

			opc = leer.nextInt();
		} while (opc<1 || opc>8);
		return opc;
		
		
	}
}
