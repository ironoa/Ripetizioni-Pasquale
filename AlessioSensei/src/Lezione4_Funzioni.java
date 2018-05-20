import java.io.*;

public class Lezione4_Funzioni {

	public static void main(String[] args) {


		/*
		 * funzione che non restituisce niente, prende in ingresso un nome,
		 * e ne stampa il contenuto a video in questo modo:
		 * ciao "nome inserito", come stai?
		 * es: se insierisco Pasquale ==> ciao Pasquale, come stai?
		 */



		//		String s;
		//		s = "Alessio";
		//		stampa(s);


		/*
		 * funzione stampa2 che prende in ingresso un nome, e un intero, e stampa:
		 * ciao "nome", hai "intero" anni
		 * es: ciao Pasquale, hai 17 anni
		 * es: ciao Alessio, hai 94 anni
		 */

		//stampa2("Alessanro 5545564565456456 uhhuhhgygrdrettfrft", 55);


		/*
		 * stampa i numeri da 1 a limite, fai una funzione, utilizza il while.
		 * Nome funzione: stampaNumeri(int limite)
		 */

		//stampaNumeri(61);


		/*
		 * funzione che ritorna la somma tra 2 numeri interi
		 * public static int somma(int a, int b)
		 */


	}






	public static void stampaNumeri (int limite) {
		int ciao;
		ciao = 1; 
		while (ciao < limite) {
			System.out.println(ciao);
			ciao ++;
		}
	}
	public static void stampa (String s) {
		System.out.println("Ciao " +s+ ", come stai?");
	}

	public static void stampa2 (String nome, int anni) {
		System.out.println("Ciao "+ nome + ", hai " +anni + " anni");


	}


}
