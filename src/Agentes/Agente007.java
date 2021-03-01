package Agentes;

import IODatos.IODato;
/**
 * Descripcion En esta clase declaramos el vector de armas y le pasamos los atributios de Agente
 * @author Oscar Merino Cases y Marcos Hernandez Aragones
 * @version 1/03/2021 1.0
 *
 */
public final class Agente007 extends Agente {

	private int contmuertes;
	private String[] vArmar;
	/**
	 * 
	 * @param nombre
	 * @param edad
	 * @param direccion
	 * @param salario
	 * @param contmuertes
	 */
	public Agente007(String nombre, int edad, String direccion, double salario, int contmuertes) {
		super(nombre, edad, direccion, salario);
		this.contmuertes = contmuertes;
	
		this.vArmar = IODato.cargarDatosTexto("Arma.dat");
		

		//this.vArmar = IODato.cargarArmas("Arma.dat", Main.addPiso());
		
		 
	}
	/**
	 * 
	 * @return delvovemos el numero de muertes
	 *
	 */
	public int getContmuertes() {
		return contmuertes;
	}
	/**
	 * 
	 * @param contmuertes
	 */
	public void setContmuertes(int contmuertes) {
		this.contmuertes = contmuertes;
	}
	/**
	 * 
	 * @return devolvemos el vector de armas
	 */
	public String[] getvArmar() {
		return vArmar;
	}
	/**
	 * 
	 * @param vArmar
	 */
	public void setvArmar(String[] vArmar) {
		this.vArmar = vArmar;
	}
	
	@Override
	public String toString() {
		return     "Nombre: " + Nombre + "\n"
				   +"Edad: " + Edad + "\n"
				   +"Direccion: " + Direccion + "\n"
				   +"Salario: " + Salario + "\n"
				   +"Contador de muertes: " + contmuertes + "\n"			
				   +"Cantidad de armas: " + vArmar + "\n"

					;
	}
	
	
	
}
