package Reto02;

public class Main {
	public static void main(String[] args) {
		TiendaBackend servidor = new TiendaBackend();
		
		servidor.agregarProducto(new Producto(1, "Tarjeta Gráfica RTX 4060", 329.99, 14));
		servidor.agregarProducto(new Producto(2, "Procesador Ryzen 7 5700X", 185.50, 8));
		servidor.agregarProducto(new Producto(3, "Memoria RAM Corsair 16GB", 45.00, 25));
		
		System.out.println("=== SERVIDOR BACKEND INICIADO EN http://localhost:8080 ===");
		
		servidor.obtenerCatalogoWeb();
		
		servidor.buscarPorId(2);
		
		servidor.buscarPorId(99);
	}
}
