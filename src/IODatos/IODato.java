package IODatos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Esata clase define los metodos cargarArma leerArma cargarPiso leerPiso y
 * cargarDatosTexto
 * 
 * @author Óscar Merino Cases y Marcos Hernandez Aragones.
 * @version 1/03/2021 1.0
 *
 */

public class IODato {

	/**
	 * Metodo para cargar Armas.
	 * 
	 * @param rutaFichero ruta relativa del fichero
	 * @param Datos       Vector de armas.
	 */
//Pruebas sobre este metodo
	public static void anadirDatoTexto(String rutaFichero) {
		File f = new File(rutaFichero);
		String dato = "";
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try (FileWriter fw = new FileWriter(f,true); PrintWriter escribir = new PrintWriter(fw)) {

			if (rutaFichero.equalsIgnoreCase("Arma.txt")) {
				System.out.println("Dime un arma para añadir");
				
			}else {
				System.out.println("Dime un arma para añadir");

			}
			escribir.println(dato);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
			System.out.println("todo bien");
		}
	
	}

	/**
	 * Metodo para leer Armas.
	 * 
	 * @param rutaFichero Ruta relativa del fichero
	 * @return Vector de vArma.
	 */
/*
	public static ArrayList<String> leerArma(String rutaFichero) {

		File f = new File(rutaFichero);
		int cont = 0;
		ArrayList<String> vArma = new ArrayList();

		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try (FileInputStream fi = new FileInputStream(f); ObjectInputStream leer = new ObjectInputStream(fi);) {

			vArma = (ArrayList<String>) leer.readObject();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vArma;
	}*/

	/**
	 * Metodo para añadir un piso al vector de pisos.
	 * @param vPiso vector de pisos.
	 * @return se devuelve el vector de pisos.
	 */

	public static void addPiso() {
		Scanner leer = new Scanner(System.in);

		String direccion;
		String rutaFichero = "Piso.txt";

		System.out.println("Dime la direccion del piso");
		direccion = leer.next();

		File f = new File(rutaFichero);

		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try (FileWriter fw = new FileWriter(f, true); PrintWriter escribir = new PrintWriter(fw);) {

			escribir.println(direccion);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	/**
	 * Metodo para leer los pisos.
	 * 
	 * @param rutafichero ruta absoluta de los ficheros
	 * @return Devuelve el vector de vPiso.
	 */
/*
	public static ArrayList<String> leerPiso(String rutafichero) {

		ArrayList<String> vPiso = new ArrayList();
		File f = new File(rutafichero);

		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try (FileInputStream fi = new FileInputStream(f); ObjectInputStream leer = new ObjectInputStream(fi);) {

			while (true) {
				leer.readUTF();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return vPiso;
	}*/

	/**
	 * Metodo para cargar la informacion de los ficheros.
	 * 
	 * @param rutaFichero ruta absoluta del archivo que queremoscargar la
	 *                    informacion.
	 * @return devuelve el vector con la uinformacion del archivo.
	 */

	public static ArrayList<String> cargarDatosTexto(String rutaFichero) {

		ArrayList<String> vVector = new ArrayList();

		File f = new File(rutaFichero);

		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try (FileReader fr = new FileReader(f); Scanner leer = new Scanner(fr);) {

			
			while (leer.hasNext()) {
				String linea = leer.nextLine();
				vVector.add(linea);

			}

			/*
			 * int cont = 0; while (leer.hasNext()) { String linea = leer.nextLine();
			 * vVector = linea; cont++; }
			 */
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		return vVector;
	}

}
