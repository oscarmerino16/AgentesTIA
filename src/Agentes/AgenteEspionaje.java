package Agentes;

public final class AgenteEspionaje extends Agente  {

	private int pisos;

	public AgenteEspionaje(String nombre, int edad, String direccion, double salario, int pisos) {
		super(nombre, edad, direccion, salario);
		this.pisos = pisos;
	}

	public int getPisos() {
		return pisos;
	}

	public void setPisos(int pisos) {
		this.pisos = pisos;
	}

	@Override
	public String toString() {
		return "Nombre: " + Nombre + "\n"
			   +"Edad: " + Edad + "\n"
			   +"Direccion: " + Direccion + "\n"
			   +"Salario: " + Salario + "\n"	
			   +"Pisos: " + pisos + "\n"
				;
	}

	
	
	
	
	
}
