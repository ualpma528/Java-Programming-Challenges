package Reto01;

public class Mago extends Personaje{
	private int magia;
	
	public Mago(String nombre, int vida, int magia) {
		super(nombre, vida);
		this.magia = magia;

	}
	
	@Override
	public void atacar(Personaje objetivo) {
		if (magia >= 10) {
			System.out.println(getNombre() + " lanza una Bola de Fuego (Gasta 10 de magia)!");
			objetivo.recibirDano(20);
			this.magia -= 10;
		} else {
			System.out.println(getNombre() + " no tiene magia...lanza un hechizo débil.");
			objetivo.recibirDano(5);
		}
	}
}
