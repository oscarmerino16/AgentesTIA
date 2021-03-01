package Agentes;

/**
 * Descripcion Esta clase es la clase padre de tres clases esta contiene los campos iguales que van a usar las clases hijas
 * @author Oscar Merino Cases y Marcos Hernandez Aragones
 * @version 1/03/2021 1.0
 * 
 */


public class Agente {

	protected String Nombre;
	protected int Edad;
	protected String Direccion;
	protected double Salario;

	/**
	 * Descripcion Declaramos los atributos de nombre, edad, direccion y salario
	 * @param nombre 
	 * @param edad
	 * @param direccion
	 * @param salario
	 */
	public Agente(String nombre, int edad, String direccion, double salario) {
		super();
		this.Nombre = nombre;
		this.Edad = edad;
		this.Direccion = direccion;
		this.Salario = salario;
	}
	/**
	 * 
	 * @return nos devuelve el nombre del agente
	 */

	public String getNombre() {
		return Nombre;
	}
	/**
	 * 
	 * @param nombre
	 */

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	/**
	 * 
	 * @return nos devuelve la edad del agente
	 */
	public int getEdad() {
		return Edad;
	}
	/**
	 * 
	 * @param edad
	 */

	public void setEdad(int edad) {
		Edad = edad;
	}
	/**
	 * 
	 * @return nos devuelve la direccion del agente
	 */

	public String getDireccion() {
		return Direccion;
	}
	/**
	 * 
	 * @param direccion
	 */

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	/**
	 * 
	 * @return nos devuelve el salario del agente
	 */

	public double getSalario() {
		return Salario;
	}
	/**
	 * 
	 * @param salario
	 */

	public void setSalario(double salario) {
		Salario = salario;
	}
	

	@Override
	public  String toString() {
		return "Agente [Nombre=" + Nombre + ", Edad=" + Edad + ", Direccion=" + Direccion + ", Salario=" + Salario
				+ "]";
	}
	
	
}
