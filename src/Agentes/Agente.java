package Agentes;

public class Agente {

	protected String Nombre;
	protected int Edad;
	protected String Direccion;
	protected double Salario;
	
	public Agente(String nombre, int edad, String direccion, double salario) {
		super();
		this.Nombre = nombre;
		this.Edad = edad;
		this.Direccion = direccion;
		this.Salario = salario;
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

	@Override
	public  String toString() {
		return "Agente [Nombre=" + Nombre + ", Edad=" + Edad + ", Direccion=" + Direccion + ", Salario=" + Salario
				+ "]";
	}
	
	
	
}
