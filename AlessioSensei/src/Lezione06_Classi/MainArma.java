package Lezione06_Classi;

public class MainArma {

	public static void main(String[] args) {
		
		System.out.println("prova");
		
		int numero = 17;
		
		System.out.println(numero);
		
		int numero2;
		
		numero2 = 19;
		
		Arma arma1 = new Arma("Excalibur", "Spada", 100.50, 520);
		
		arma1.stampaNomeDanno();
		
		Arma arma2;
		arma2 = new Arma("Gino", "Martello", 120, 22);
		
		System.out.println(arma2.portata);
		

	}

}
