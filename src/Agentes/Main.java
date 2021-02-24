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
	
	public static void addAgente() {
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
		
		Agente[] vAgentes = new Agente[10];

		vAgentes[0] = new Jefazo("Oscar", 20, "C/ Santa Clara", 5000, 2011);
		vAgentes[1] = new Agente007("Marcos", 20, "C/ Castelseras n2", 3000, 250,0);
		vAgentes[2] = new AgenteEspionaje("Kasper", 20, "C/ El korral n34", 1500, 2);
		
		String[] vPiso = new String[10];

		vPiso[0] = new String("Pistola");
		vPiso[1] = new String("Rifle");
		vPiso[2] = new String("subfusil");
		
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		
		
		do {
			opc=Menu.pintaMenu();
			switch (opc) {
			case 1:
				System.out.println("Accediento a los agentes");
				verAgentes(vAgentes);
				opc=-1;
				break;
			case 2:
				System.out.println("Accediendo al pagos de los agentes");
				verAgentesDinero(vAgentes);
				opc=-1;
				break;
			case 3:
				System.out.println("Dando de alta un Piso");
				opc=-1;
				break;
			case 4:
				System.out.println("Dando de alta una Arma");
				opc=-1;
				break;
			case 5:
				System.out.println("Dando de alta un Agente");
				addAgente();
				System.out.println("Agente añadido");
				opc=-1;
				break;
			case 6:
				System.out.println("Encriptando la informacion");
				opc=-1;
				break;
			case 7:
				System.out.println("Dessencriptando la informacion");
				opc=-1;
				break;
			case 8:
				System.out.println("Saliendo");
				opc=8;
				break;
			default:
				break;
			}

			
		} while (opc<1 || opc>8);
		
		
		
		//verAgentes(vAgentes);
		//verAgentesDinero(vAgentes);
		
	}

}