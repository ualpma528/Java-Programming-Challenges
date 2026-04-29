package Reto01;

public class Personaje {
	private String nombre;
	protected int vida;
	
	public Personaje(String nombre, int vida) {
		this.nombre = nombre;
		this.vida = vida;
	}
	
	public void recibirDano(int cantidad) {
		this.vida -= cantidad;
		
		if (this.vida < 0) {
			this.vida = 0;
		}
		
		System.out.println(nombre + " ha recibido " + cantidad + " de daño. Vida restante: " + vida);
	}
	
	public void atacar(Personaje Objetivo) {
		System.out.println(nombre + " realiza un ataque básico.");
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getVida() {
		return vida;
	}
}

