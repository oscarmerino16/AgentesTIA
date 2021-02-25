package Agentes;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import IODatos.IODato;

public class Encriptar {
	
	public static void encriptarInfo(String rutaFichero) {
		
		File f = new File(rutaFichero);
		File far = new File("Arma.dat");
		File fpi = new File("piso.dat");
		
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
			
			String[] vArma = IODato.cargarDatosTexto("Arma.dat");
			
			escribir.writeObject(vArma);
			
			String[] vPiso = IODato.cargarDatosTexto("Prma.dat");
			
			escribir.writeObject(vPiso);
			
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
	
	
	
}
