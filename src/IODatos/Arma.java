package IODatos;

public class Arma {
	private String nombre="";
	private int municion; //mm
	private boolean mira;
	private int cargador; //tamaño
	private int cargadores; // cuanrtos puedes llevar
	
	
	public Arma(String nombre, int municion, boolean mira, int cargador, int cargadores) {
		this.nombre = nombre;
		this.municion = municion;
		this.mira = mira;
		this.cargador = cargador;
		this.cargadores = cargadores;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getMunicion() {
		return municion;
	}


	public void setMunicion(int municion) {
		this.municion = municion;
	}


	public boolean isMira() {
		return mira;
	}


	public void setMira(boolean mira) {
		this.mira = mira;
	}


	public int getCargador() {
		return cargador;
	}


	public void setCargador(int cargador) {
		this.cargador = cargador;
	}


	public int getCargadores() {
		return cargadores;
	}


	public void setCargadores(int cargadores) {
		this.cargadores = cargadores;
	}


	@Override
	public String toString() {
		return "Arma [nombre=" + nombre + ", municion=" + municion + ", mira=" + mira + ", cargador=" + cargador
				+ ", cargadores=" + cargadores + "]";
	}
	
	
	
	
}
