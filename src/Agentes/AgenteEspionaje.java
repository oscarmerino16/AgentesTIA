package Agentes;

import IODatos.IODato;

public final class AgenteEspionaje extends Agente  {

	private String [] vPisos;

	public AgenteEspionaje(String nombre, int edad, String direccion, double salario) {
		super(nombre, edad, direccion, salario);
		this.vPisos = IODato.cargarDatosTexto("Piso.dat");
	}


	public String[] getvPisos() {
		return vPisos;
	}


	public void setvPisos(String[] vPisos) {
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
