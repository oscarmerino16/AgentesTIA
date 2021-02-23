package Agentes;

public final class Jefazo extends Agente {

	
	private int Ano_mandato;

	public Jefazo(String nombre, int edad, String direccion, double salario, int ano_mandato) {
		super(nombre, edad, direccion, salario);
		Ano_mandato = ano_mandato;
	}

	public int getAno_mandato() {
		return Ano_mandato;
	}

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
