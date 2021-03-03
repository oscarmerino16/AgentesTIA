package Agentes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import IODatos.IODato;

/**
 * Clase Main del trabajo.
 * @author Óscar Merino Cases y Marcos Hernández Aragonés.
 * @version 1/03/2021 1.0
 *
 */
public class Main {
	
	/**
	 * metodo para añadir armas.
	 * @param rutaFichero ruta relativo del fichero.
	 */
	
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

/**
 * Metodo para ver los agentes que tenemos creados.
 * @param vAgentes vector de agentes.
 */
	
	public static void verAgentes(ArrayList<Agente> vAgentes) {
		
		for (Agente a : vAgentes) {
			if (a!=null) {
				System.out.println(a);
			}
		}
		
	}
	/**
	 * Metodo para ver los agentes que ganen más de esa cantidad.
	 * @param vAgentes vector de los agentes.
	 */
	public static void verAgentesDinero(ArrayList<Agente> vAgentes) {
		
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
	/**
	 * Metodo para añadir agentes.
	 * @param vector Vector de los agentes.
	 */
	public static void addAgente(ArrayList<Agente> vVector) {
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
			System.out.println("Dime el año de mandato del nuevo agente");
			ano_mandato = leer.nextInt();
			vVector.add( new Jefazo(nombre, edad, direccion, salario, ano_mandato));
		}
		if (tipo.equalsIgnoreCase("Agente007")) {
			System.out.println("Dime el numero de muertos del nuevo agente");
			contmuertes=leer.nextInt();
			
			vVector.add( new Agente007(nombre, edad, direccion, salario, contmuertes));
		}
		if (tipo.equalsIgnoreCase("Agente de Espionaje")) {
			System.out.println("Las armas del agente se añaden en addArmas");
		}
	}

	/**
	 * Metodo para añadir un piso al vector de pisos.
	 * @param vPiso vector de pisos.
	 * @return se devuelve el vector de pisos.
	 */
	public static void addPiso() {
		Scanner leer = new Scanner(System.in);
		
		String direccion;
		
		System.out.println("Dime la direccion del piso");
		direccion = leer.next();
		
	}
	
	public static void main(String[] args) {

		ArrayList<Agente> vAgentes = new ArrayList<Agente>();

		vAgentes.add(new Jefazo("Oscar", 20, "C/ Santa Clara", 5000, 2011));
		vAgentes.add(new Agente007("Marcos", 20, "C/ Castelseras n2", 3000, 250));
		vAgentes.add(new AgenteEspionaje("Kasper", 20, "C/ El korral n34", 1500));
	
		ArrayList<String> vArma = new ArrayList();
		
		vArma.add("Pistola");
		vArma.add("Rifle");
		vArma.add("Subsufil");
	
		ArrayList<String> vPiso = new ArrayList();
		
		vPiso.add("c/Ejemplo1");
		vPiso.add("c/Ejemplo2");
		vPiso.add("c/Ejemplo3");
		
		IODato.cargarArmas("Arma.dat", vArma);
        IODato.cargarPiso("Piso.dat", vPiso);
		
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
				addPiso();
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
		

	}

}