package Reto01;

public class Main {
	public static void main(String[] args) {
		Guerrero Kratos = new Guerrero("Kratos", 100, 15);
		Mago Steve = new Mago("Steve", 60, 30);
		
		System.out.println("--- ¡COMIENZA EL COMBATE! ---");
		
		while (Kratos.getVida() > 0 && Steve.getVida() > 0) {
			Kratos.atacar(Steve);
			
			if (Steve.getVida() > 0) {
				Steve.atacar(Kratos);
			}
			
			System.out.println("---------------------");
		}
		
		if(Kratos.getVida() > 0) {
			System.out.println("¡EL GANADOR ES EL GUERRERO " + Kratos.getNombre() + "!");
		} else {
			System.out.println("¡EL GANADOR ES EL MAGO " + Steve.getNombre() + "!");
		}
	}
}
