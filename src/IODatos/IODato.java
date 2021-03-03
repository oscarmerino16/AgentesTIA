package IODatos;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Esata clase define los metodos cargarArma leerArma cargarPiso leerPiso y cargarDatosTexto
 * @author Óscar Merino Cases y Marcos Hernandez Aragones.
 * @version 1/03/2021 1.0
 *
 */

public class IODato {
	
	/**
	 * Metodo para cargar Armas.
	 * @param rutaFichero ruta relativa del fichero
	 * @param Datos Vector de armas.
	 */
	
	public static void cargarArmas(String rutaFichero, String[] Datos) {
		File f = new File(rutaFichero);
		
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		try (FileOutputStream fo = new FileOutputStream(f);
			 ObjectOutputStream escribir = new ObjectOutputStream(fo);){
			
			for (String ar : Datos) {
				if (ar!=null) {
					String nombre;
					Scanner leer = new Scanner(System.in);
					
					nombre=leer.next();
					escribir.writeUTF(nombre);
				}
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
			System.out.println("todo bien");
		}
	}
	
	/**
	 * Metodo para leer Armas.
	 * @param rutaFichero Ruta relativa del fichero
	 * @return Vector de vArma.
	 */
	
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
		
		try (FileInputStream fi = new FileInputStream(f);
			 ObjectInputStream leer = new ObjectInputStream(fi);){
			
			
			while (true) {
				System.out.println(vArma);
				//vArma[cont]= (String) leer.readUTF();
				//cont++;
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		
		return vArma;
	}
	
	/**
	 * Metodo para cargar Pisos.
	 * @param rutaFichero ruta relativa del fichero
	 * @param piso Vector de los pisos
	 */
	
	public static void cargarPiso(String rutaFichero, String[] piso) {
		File f = new File(rutaFichero);
		
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try (FileOutputStream fo = new FileOutputStream(f);
			 ObjectOutputStream escribir = new ObjectOutputStream(fo);){
			for (String p : piso) {
				String nombre;
				Scanner leer = new Scanner(System.in);
				
				nombre=leer.next();
				escribir.writeUTF(nombre);
				
			}
			
			
			
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
	 * @param rutafichero ruta absoluta de los ficheros
	 * @return Devuelve el vector de vPiso.
	 */
	
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
		
		try (FileInputStream fi = new FileInputStream(f);
			 ObjectInputStream leer = new ObjectInputStream(fi);){
			
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
	}

/**
 * Metodo para cargar la informacion de los ficheros.
 * @param rutaFichero ruta absoluta del archivo que queremoscargar la informacion.
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

			Iterator it = vVector.iterator();
			while (it.hasNext()) {
				ArrayList<String> linea = (ArrayList<String>) it.next();
				vVector = linea;
				
			}
			
		
			
			/*int cont = 0;
			while (leer.hasNext()) {
				String linea = leer.nextLine();
				vVector = linea;
				cont++;
			}
*/
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		return vVector;
	}
	

}
