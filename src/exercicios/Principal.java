package exercicios;

public class Principal {

	public static void main(String[] args) {
		Lampada l1 = new Lampada("Elgin", 220, "Branca", 50);
		System.out.println(l1.toString());
		l1.ligar();
		System.out.println(l1.toString());
		l1.intensidade(50);
		System.out.println(l1.toString());
		l1.desligar();
		System.out.println(l1.toString());
		
	}

}
