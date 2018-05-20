package Lezione12_biglietti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CorrezzioneBiglietti {
	/*
	 * SOLUZIONE:
	 * 
	 * 0) RICONOSCIMENTO INPUT E OUTPUT DEL PROBLEMA
	 * 1) ALGORTMO SU CARTA 
	 * 2) CODIFICA IN LINGUAGGIO JAVA
	 * 
	 * 
	 * tempo impiegato :   8 minuti
	 */

	public static void main(String[] args) throws IOException {

		/*
		 * Utility per la lettura da std In bufferizzata
		 */
		/*****************************************************/
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader inBufferizzato = new BufferedReader(input);
		/********************************************************/


		/*
		 * Variabili in ingresso
		 */
		int eta=0;
		double costoIniziale=0;
		
		/*
		 * Variabili in OUT
		 */
		double costoFinale=0;

		/*
		 * IMPLEMENTAZIONE DELL'ALGORITMO
		 */
		System.out.println("Inserisci l eta");
		eta=Integer.parseInt(inBufferizzato.readLine());
		
		System.out.println("Inserisci il costo iniziale");
		costoIniziale=Double.parseDouble(inBufferizzato.readLine());
		costoFinale=costoIniziale;
		
		if(eta<13) {
			costoFinale = costoIniziale - (costoIniziale * 0.7);
		}
		else if((eta>=13 && eta<18)||(eta>60)) {
			costoFinale = costoIniziale - (costoIniziale * 0.3);
		}
		
		System.out.println("il costo finale al netto degli sconti è: "+costoFinale);
		

	}
}
