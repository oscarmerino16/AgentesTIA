package Agentes;

/**
 * Descripcion Clase hija de Agente de la cual cogemos sus atributps
 * @author Oscar Merino Cases y Marcos Hernandez Aragones
 * @version 1/03/2021 1.0
 */

public final class Jefazo extends Agente {

	
	
	private int Ano_mandato;
/**
 * Descripcion Esta clase declaramos el atributo de año_mandato y cogemos los atributos que tenemos en la clase padre Agente
 * @param nombre
 * @param edad
 * @param direccion
 * @param salario
 * @param ano_mandato
 */
	public Jefazo(String nombre, int edad, String direccion, double salario, int ano_mandato) {
		super(nombre, edad, direccion, salario);
		Ano_mandato = ano_mandato;
	}
	/**
	 * 
	 * @return devolvemos el año de mandato
	 */

	public int getAno_mandato() {
		return Ano_mandato;
	}
	/**
	 * 
	 * @param ano_mandato
	 */

	public void setAno_mandato(int ano_mandato) {
		Ano_mandato = ano_mandato;
	}

	

	@Override
	public String toString() {
		return "*****************************" + "\n"
				+ "Nombre: " + Nombre + "\n"
				+ "Edad: " + Edad + "\n"
				+ "Direccion: " + Direccion + "\n"
				+ "Salario: " + Salario + "\n"
				+ "Años de mandato: " + Ano_mandato+ "\n"
				+"***************************"
				;
		
	}

}

