package IODatos;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class IODato {
	
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
	
	
	public static String[] leerArma(String rutaFichero) {
		
		File f = new File(rutaFichero);
		
		String[] vArma = new String[10];
		
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
	
	public static String[] leerPiso(String rutafichero) {
		
		String[] vPiso= new String[10];
		
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


	public static String[] cargarDatosTexto(String rutaFichero) {
		
		String[] vector = new String[10];

		File f = new File(rutaFichero);

		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try (FileReader fr = new FileReader(f); Scanner leer = new Scanner(fr);) {

			int cont = 0;
			while (leer.hasNext()) {
				String linea = leer.nextLine();
				vector[cont] = linea;
				cont++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		return vector;
	}
	

}
