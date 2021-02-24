package Agentes;

public class Piso {
	
	private String nombre;
	private int num;
	private String direccion;
	
	public Piso(String nombre, int num, String direccion) {
		super();
		this.nombre = nombre;
		this.num = num;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Piso [nombre=" + nombre + ", num=" + num + ", direccion=" + direccion + "]";
	}
	
	
	
}
