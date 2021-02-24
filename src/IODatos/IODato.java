package IODatos;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Agentes.Piso;

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
			 ObjectOutputStream escribir = new ObjectOutputStream(fo);){
			
			for (Arma ar : Datos) {
				if (ar!=null) {
					escribir.writeUTF(ar.getNombre());
					escribir.writeInt(ar.getMunicion());
					escribir.writeBoolean(ar.isMira());
					escribir.writeInt(ar.getCargador());
					escribir.writeInt(ar.getCargadores());
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
			 ObjectInputStream leer = new ObjectInputStream(fi);){
			
			
			while (true) {
				System.out.println(leer.readUTF());
				System.out.println(leer.readInt());
				System.out.println(leer.readBoolean());
				System.out.println(leer.readInt());
				System.out.println(leer.readInt());
				System.out.println("");
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
	
	public static void cargarPiso(String rutaFichero, Piso[] piso) {
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
			for (Piso p : piso) {
				
				escribir.writeUTF(p.getNombre());
				escribir.writeInt(p.getNum());
				escribir.writeUTF(p.getDireccion());
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public static Piso[] cargarPiso(String rutafichero) {
		
		Piso[] vPiso= new Piso[10];
		
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
				leer.readInt();
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
}
