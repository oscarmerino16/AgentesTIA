package Agentes;

import java.util.Scanner;

public class Main {

	public static void verAgentes(Agente[] vAgentes) {
		
		Scanner leer = new Scanner(System.in);
		
		for (Agente a : vAgentes) {
			if (a!=null) {
				System.out.println(a);
			}
		}
		
	}
	
	public static void verAgentesDinero(Agente[] vAgentes) {
		
		Scanner leer = new Scanner(System.in);
		double cantidad;
		System.out.println("Dime una cantidad de dinero y veras los agentes que ganen mas de esa cantidad");
		cantidad=leer.nextInt();
		for (Agente a : vAgentes) {
			if (a!=null && a.getSalario()>cantidad ) {
				System.out.println(a);
			}
		}
		
	}
	
	public void addAgente() {
		Scanner leer = new Scanner(System.in);
		
		String nombre, direccion, tipo;
		int edad, ano_mandato, contmuertes;
		double salario;
		
		System.out.println("Dime el nombre del nuevo agente");
		nombre= leer.next();
		System.out.println("Dime la edad del nuevo agente");
		edad= leer.nextInt();
		System.out.println("Dime la direccion del nuevo agente ");
		direccion= leer.next();
		System.out.println("Dime el salario del nuevo agente");
		salario = leer.nextDouble();
		
		System.out.println("Dime que tipo de agente es (Jefazo, Agente007 o Agente de Espionaje)");
		tipo=leer.next();
		
		if (tipo.equalsIgnoreCase("Jefazo")) {
			System.out.println("Dime el a�o de mandato del nuevo agente");
			ano_mandato = leer.nextInt();
		}
		if (tipo.equalsIgnoreCase("Agente007")) {
			System.out.println("Dime el numero de muertos del nuevo agente");
			contmuertes=leer.nextInt();
			/*/comprobar con fichero de armas
			System.out.println("Dime las armas del nuevo agente");
			contmuertes=leer.nextInt();*/
		}
		//comprobar con fichero pisos
		/*if (tipo.equalsIgnoreCase("Agente de Espionaje")) {
			System.out.println("Dime los pisos del nuevo agente");
			salario = leer.nextDouble();
		}*/
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
		
		
		Agente[] vAgentes = new Agente[10];

		vAgentes[0] = new Jefazo("Oscar", 20, "C/ Santa Clara", 5000, 2011);
		vAgentes[1] = new Agente007("Marcos", 20, "C/ Castelseras n2", 3000, 250, 5);
		vAgentes[2] = new AgenteEspionaje("Kasper", 20, "C/ El korral n34", 1500, 2);
		
		//verAgentes(vAgentes);
		//verAgentesDinero(vAgentes);
		
	}

}