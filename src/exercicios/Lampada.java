package exercicios;

public class Lampada{
	String marca;
	double volts;
	String cor;
	double price;
	boolean ligada = false;
	int intensidade = 0;

	public Lampada(String marca, double volts, String cor, double price) {
		super();
		this.marca = marca;
		this.volts = volts;
		this.cor = cor;
		this.price = price;
		
	}
	
	public void ligar() {
		ligada = true;
		intensidade = 100;
	}
	
	public void desligar() {
		ligada = false;
		intensidade = 0;
	}
	
	public void intensidade(int n) {
		intensidade = n;
	}
	
	
	
	@Override
	public String toString() {
		return "Lampada [marca=" + marca + ", volts=" + volts + ", cor=" + cor + ", price=" + price + "\nLigada=" + ligada + ", Intensidade=" + intensidade + "% ]";
	}
	
}
