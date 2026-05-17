package Reto02;

public class Producto {
	private int id;
	private String nombre;
	private double precio;
	private int stock;
	
	public Producto(int id, String nombre, double precio, int stock) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	public String convertirAJson() {
		return "  {\n" + 
	           "    \"id\": " + id + ",\n" + 
			   "    \"nombre\": \"" + nombre + "\",\n" + 
	           "    \"precio\": " + precio + ",\n" + 
			   "    \"stock\": " + stock + "\n" + 
	           "  }";
	}
	
	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
}
