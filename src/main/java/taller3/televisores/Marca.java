package taller3.televisores;

public class Marca {
	private String nombre;
	
	//Constructor
	public Marca(String marca) {
		nombre = marca;
	}
	
	//Encapsulation
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
