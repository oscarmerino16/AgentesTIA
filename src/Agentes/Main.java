package Agentes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import IODatos.IODato;

public class Main {
	
	public static void addArma(String rutaFichero) {
		
		File f = new File(rutaFichero);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try (FileWriter esc = new FileWriter(f, true); PrintWriter escribir = new PrintWriter(esc);) {
			Scanner leer = new Scanner(System.in);
			if (rutaFichero.equalsIgnoreCase("Arma.dat")) {
				System.out.println("Que arma quieres añadir");
				String arma = leer.next();
				escribir.println(arma);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}


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
	
	public static void addAgente(Agente[] vector) {
		Scanner leer = new Scanner(System.in);
		
		String nombre, direccion, tipo;
		int edad, ano_mandato, contmuertes, libre=buscarHueco(vector);
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
			System.out.println("Dime el año de mandato del nuevo agente");
			ano_mandato = leer.nextInt();
			vector[libre] = new Jefazo(nombre, edad, direccion, salario, ano_mandato);
		}
		if (tipo.equalsIgnoreCase("Agente007")) {
			System.out.println("Dime el numero de muertos del nuevo agente");
			contmuertes=leer.nextInt();
			/*/comprobar con fichero de armas
			System.out.println("Dime las armas del nuevo agente");
			contmuertes=leer.nextInt();*/
			vector[libre] = new Agente007(nombre, edad, direccion, salario, contmuertes);
		}
		//comprobar con fichero pisos
		/*if (tipo.equalsIgnoreCase("Agente de Espionaje")) {
			System.out.println("Dime los pisos del nuevo agente");
			salario = leer.nextDouble();
		}*/
			vector[libre]= new AgenteEspionaje(nombre, edad, direccion, salario);
		
			
	}
	private static int buscarHueco(Agente[] vector) {
		for (int i = 0; i < vector.length; i++) {
			if (vector==null) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static String[] addPiso(String[] vPiso) {
		Scanner leer = new Scanner(System.in);
		
		String direccion;
		
		System.out.println("Dime la direccion del piso");
		direccion = leer.next();
		for (int i = 0; i < vPiso.length; i++) {
			if (vPiso[i]==null) {
				vPiso[i]= new String(direccion);
			}
		}
		return vPiso;
	}
	
	
	public static void main(String[] args) {
		
/*
		Jefazo vAgentes[] = new Jefazo[10];

		vAgentes[0] = new Jefazo("Oscar", 20, "C/ Santa Clara n18", 5000, 2001);
		vAgentes[1] = new Agente007("Marcos", 20, "C/ Castelseras n2", 3000, 250, 5);
		vAgentes[2] = new AgenteEspionaje("Kasper", 20, "C/ El korral n34", 1500, 2);
*/


		Agente[] vAgentes = new Agente[10];

		vAgentes[0] = new Jefazo("Oscar", 20, "C/ Santa Clara", 5000, 2011);
		vAgentes[1] = new Agente007("Marcos", 20, "C/ Castelseras n2", 3000, 250);
		vAgentes[2] = new AgenteEspionaje("Kasper", 20, "C/ El korral n34", 1500);
		
		String[] vArma = new String[10];

		vArma[0] = new String("Pistola");
		vArma[1] = new String("Rifle");
		vArma[2] = new String("subfusil");
		
		String[] vPiso = new String[10];

		vPiso[0] = new String("c/Ejemplo1");
		vPiso[1] = new String("c/Ejemplo2");
		vPiso[2] = new String("c/ejemplo3");
		
		
		
		
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		
		//IODato.cargarArmas("Arma.dat", vArma);
		//IODato.cargarPiso("Piso.dat", vPiso);
		
		
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
				addPiso(vPiso);
				opc=-1;
				break;
			case 4:
				System.out.println("Dando de alta una Arma");
				addArma("Arma.dat");
				System.out.println("Arma añadida");
				opc=-1;
				break;
			case 5:
				System.out.println("Dando de alta un Agente");
				addAgente(vAgentes);
				System.out.println("Agente añadido");
				opc=-1;
				break;
			case 6:
				System.out.println("Encriptando la informacion");
				Encriptar.encriptarInfo("Encriptado.dat",vAgentes);
				opc=-1;
				break;
			case 7:
				System.out.println("Dessencriptando la informacion");
				Encriptar.desencriptarInfo("Encriptado.dat");
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