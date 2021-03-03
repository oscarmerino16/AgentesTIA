package Agentes;

import java.util.ArrayList;

import IODatos.IODato;

/**
 * Descripcion en esta clase declaramos el vector de pisos y cogemos los atributos de la clase padre
 * @author Oscar Merino Cases y Marcos Hernandez Aragones
 * @version 1/03/2021 1.0
 *
 */
 
public final class AgenteEspionaje extends Agente  {

	private ArrayList<String> vPisos = new ArrayList();
	/**
	 * 
	 * @param nombre
	 * @param edad
	 * @param direccion
	 * @param salario
	 */
	public AgenteEspionaje(String nombre, int edad, String direccion, double salario) {
		super(nombre, edad, direccion, salario);
		this.vPisos = IODato.cargarDatosTexto("Piso.dat");
	}
	/**
	 * 
	 * @return el vector de pisos
	 * 
	 */


	public ArrayList<String> getvPisos() {
		return vPisos;
	}
	/**
	 * 
	 * @param vPisos
	 */

	public void setvPisos(ArrayList<String> vPisos) {
		this.vPisos = vPisos;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + Nombre + "\n"
			   +"Edad: " + Edad + "\n"
			   +"Direccion: " + Direccion + "\n"
			   +"Salario: " + Salario + "\n"	
			   +"Pisos: " + vPisos + "\n"
				;
	}

}
