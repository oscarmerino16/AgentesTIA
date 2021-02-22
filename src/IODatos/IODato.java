package IODatos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODato {
	public static void cargarArmas(String rutaFichero, Arma[] Datos) {
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
			 DataOutputStream escribir = new DataOutputStream(fo);){
			
			for (Arma ar : Datos) {
				escribir.writeUTF(ar.getNombre());
				escribir.writeInt(ar.getMunicion());
				escribir.writeBoolean(ar.isMira());
				escribir.writeInt(ar.getCargador());
				escribir.writeInt(ar.getCargadores());
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
	
	public static Arma[] leerArma(String rutaFichero) {
		
		File f = new File(rutaFichero);
		
		Arma[] vArma = new Arma[10];
		
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try (FileInputStream fi = new FileInputStream(f);
			 DataInputStream leer = new DataInputStream(fi);){
			
			
			while (true) {
				leer.readUTF();
				leer.readInt();
				leer.readBoolean();
				leer.readInt();
				leer.readInt();
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
}
