package Reto02;

import java.util.ArrayList;

public class TiendaBackend {
	private ArrayList<Producto> catalogo;
	
	public TiendaBackend() {
		this.catalogo = new ArrayList<>();
	}
	
	public void agregarProducto(Producto p) {
		catalogo.add(p);
	}
	
	public void obtenerCatalogoWeb() {
		System.out.println("\n[HTTP GET] /api/productos -> Solicitando catálogo...");
		System.out.println("Status: 200 OK");
		System.out.println("[");
		
		for (Producto p : catalogo) {
			System.out.println(p.convertirAJson());
		}
		
		System.out.println("]");
	}
	
	public void buscarPorId(int id) {
		System.out.println("\n[HTTP GET] /api/productos/" + id + " -> Buscando artículo...");
		boolean encontrado = false;
		
		for (Producto p : catalogo) {
			if(p.getId() == id) {
				System.out.println("Status: 200 OK");
				System.out.println(p.convertirAJson());
				encontrado = true;
				break;
			}
		}
		
		if (!encontrado) {
			System.out.println("Status: 404 NOT FOUND");
			System.out.println("{\n  \"error\": \"El producto con ID " + id + " no existe en la base de datos.\"\n}");
		}
	}
}
