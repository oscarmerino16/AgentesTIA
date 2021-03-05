package Agentes;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import IODatos.IODato;

/**
 * Esta clase defines los metodos tanto de encriptar como de desencriptar.
 * @author Óscar Merino Cases y Marcos Hernandez Aragones.
 * @version 1/03/2021 1.0
 * 
 */

public class Encriptar {
	/**
	 * Encriptacion de la informacion.
	 * @param rutaFichero Ruta relativa del fichero.
	 * @param vAgentes Vector de los agentes que llega desde Main.
	 */
	public static void encriptarInfo(String rutaFichero,ArrayList<Agente> vAgentes) {
		
		
		File f = new File(rutaFichero);
		File far = new File("Arma.txt");
		File fpi = new File("Piso.txt");
		
		/**
		 * Creacion del archivo donde se va aguardar toda la informacion.
		 * Archivos de donde se va a sacar la informacion.
		 */
		
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		/**
		 * Comprobar si exsiste el archivo anterior y si no exsiste crearlo.
		 */
		
		
		
		
		try (FileOutputStream fo = new FileOutputStream(f);
			 ObjectOutputStream escribir = new ObjectOutputStream(fo);){
			
			ArrayList<String> vArma = IODato.cargarDatosTexto("Arma.txt");
			
			escribir.writeObject(vArma);
			
			ArrayList<String> vPiso = IODato.cargarDatosTexto("Piso.txt");
			
			escribir.writeObject(vPiso);
			
			escribir.writeObject(vAgentes);
			
			
			far.delete();
			fpi.delete();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
	
	/**
	 * Desencriptar toda la información.
	 * @param rutaFichero ruta relativa del fichero.
	 */
	
	public static void desencriptarInfo(String rutaFichero) {
		
		File f = new File(rutaFichero);
		
		int cont = 0;
		
		ArrayList<String> vArma = new ArrayList();
		ArrayList<String> vPiso = new ArrayList();
		ArrayList<String> vAgentes = new ArrayList();
	
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
			
			
				vArma= (ArrayList<String>) leer.readObject();
				vPiso= (ArrayList<String>) leer.readObject();
				vAgentes=(ArrayList<String>) leer.readObject();
			

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Fin del fichero");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Borrar .dat y crear los ficheros de texto y el de ag3entes
	}
	
	
}
