package Agentes;

import IODatos.IODato;

public final class Agente007 extends Agente {

	private int contmuertes;
	private String[] vArmar;
	
	public Agente007(String nombre, int edad, String direccion, double salario, int contmuertes) {
		super(nombre, edad, direccion, salario);
		this.contmuertes = contmuertes;
		
		this.vArmar = IODato.cargarDatosTexto("Arma.dat");

		//this.vArmar = IODato.cargarArmas("Arma.dat", Main.addPiso());

		 
	}
	public int getContmuertes() {
		return contmuertes;
	}
	public void setContmuertes(int contmuertes) {
		this.contmuertes = contmuertes;
	}
	
	public String[] getvArmar() {
		return vArmar;
	}
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
