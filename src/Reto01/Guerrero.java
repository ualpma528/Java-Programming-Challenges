package Reto01;

public class Guerrero extends Personaje {
	private int fuerza;
	
	public Guerrero(String nombre, int vida, int fuerza) {
		super(nombre, vida);
		this.fuerza = fuerza;
	}
	
	@Override
	public void atacar(Personaje objetivo) {
		System.out.println(getNombre() + " da un espadazo con fuerza de " + fuerza + "!");
		objetivo.recibirDano(fuerza);
	}
}
