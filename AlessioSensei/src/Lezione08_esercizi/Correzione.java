/*
 * AUTORE: ALESSIO ONORI
 * VERSIONE: 1.0
 */

package Lezione08_esercizi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Correzione {

	/*
	 * 	Una baita di montagna offre 2 tipologie di servizio ai suoi clienti:
	 *	- Il servizio "passeggiata con la guida" ad un prezzo di 7 euro/ora
	 *	- Il servizio di "soggiorno", il quale include nel prezzo un numero di passeggiate illimitate, a 30 euro/giorno
	 *	Vengono poi offerti 2 supplementi da considerarsi aggiuntivi e opzionali:
	 *	- Il supplemento per i pasti, con un costo pari al 5% sul totale
	 *	- Il supplemento per il dog-sitter, con un costo pari al 10% sul totale  
	 *	Dati le ore o i giorni, e ovviamente la tipologia del servizio, calcolarne il costo totale
	 *
	 */
	
	
	/*
	 * SOLUZIONE:
	 * 
	 * 0) RICONOSCIMENTO INPUT E OUTPUT DEL PROBLEMA
	 * 1) ALGORTMO SU CARTA 
	 * 2) CODIFICA IN LINGUAGGIO JAVA
	 * 
	 * 
	 * tempo impiegato : 18:00:00 minuti    
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
		String tipoServizio="";
		int ore=0;
		int giorni=0;
		
		/*
		 * Variabili in OUT
		 */
		double costoParziale=0;
		double costoFinale=0;
		
		/*
		 * IMPLEMENTAZIONE DELL'ALGORITMO
		 */
		System.out.println("Inserisci la tipologia di servizio");
		tipoServizio=(inBufferizzato.readLine());
		if(tipoServizio.equalsIgnoreCase("passeggiata")) {
			System.out.println("Inserisci le ore desderate:");
			ore = Integer.parseInt(inBufferizzato.readLine());
			
			costoParziale = 7*ore;
			costoFinale = 7*ore;
		}
		else {
			if(tipoServizio.equalsIgnoreCase("soggiorno")) {
				System.out.println("Inserisci i giorni desderati:");
				giorni = Integer.parseInt(inBufferizzato.readLine());
				
				costoParziale = 30*giorni;
				costoFinale = 30*giorni;
			}
			else {
				//ERRORE
				System.out.println("ERRORE, TIPOLOGIA NON CONTEMPLATA");
				return;
			}//soggiorno
		}//tipologia servizio passeggiata
		
		/*
		 * eventuali servizi aggiuntivi
		 */
		System.out.println("Desideri anche il servizio pasti?[si/no]:");
		if(inBufferizzato.readLine().equalsIgnoreCase("si")) {
			costoFinale = costoParziale + ( costoParziale * 0.05 );
		}//pasti
		
		System.out.println("Desideri anche il servizio per il cane[si/no]:");
		if(inBufferizzato.readLine().equalsIgnoreCase("si")) {//dog sitter
			costoFinale = costoFinale + ( costoParziale * 0.1 );
		}
		
		System.out.println("Il costo finale è: "+costoFinale);

	}

}
