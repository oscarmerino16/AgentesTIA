package Agentes;

public class Jefazo {

	protected String Nombre;
	protected int Edad;
	protected String Direccion;
	protected double Salario;
	private int A�o_mandato;
	
	public Jefazo(String nombre, int edad, String direccion, double salario,int A�o_mandato) {
		super();
		Nombre = nombre;
		Edad = edad;
		Direccion = direccion;
		Salario = salario;
		
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}

	public int getA�o_mandato() {
		return A�o_mandato;
	}

	public void setA�o_mandato(int a�o_mandato) {
		A�o_mandato = a�o_mandato;
	}

	@Override
	public String toString() {
		return "Jefazo [Nombre=" + Nombre + ", Edad=" + Edad + ", Direccion=" + Direccion + ", Salario=" + Salario
				+ ", A�o_mandato=" + A�o_mandato + "]";
	}
	
	
	
	
	
	
}
