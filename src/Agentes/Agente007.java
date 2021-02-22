package Agentes;

public final class Agente007 extends Jefazo {

	private int contmuertes;
	private int cantarmas;
	public Agente007(String nombre, int edad, String direccion, double salario, int contmuertes, int cantarmas) {
		super(nombre, edad, direccion, salario);
		this.contmuertes = contmuertes;
		this.cantarmas = cantarmas;
	}
	public int getContmuertes() {
		return contmuertes;
	}
	public void setContmuertes(int contmuertes) {
		this.contmuertes = contmuertes;
	}
	public int getCantarmas() {
		return cantarmas;
	}
	public void setCantarmas(int cantarmas) {
		this.cantarmas = cantarmas;
	}
	@Override
	public String toString() {
		return "Agente007 [contmuertes=" + contmuertes + ", cantarmas=" + cantarmas + "]";
	}
	
	
	
}
