/**********************************
 * PASQUALE PAGANO
 * Esericizio per casa 
 **********************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EsercizioCostiPerCasa {

	public static void main(String[] args) throws IOException {
		
		/*
		 * dati l'eta  di una persona e il costo del biglietto determinare quanto paga per un ingresso a 
		 * un evento sapendo che i minorenne e quelli che hanno piu di 65 anni hanno 
		 * uno sconto del 30%, chi ha meno di 10 anni non paga, e chi ha tra i 30 e i 40 paga un extra del 10% 
		 */

		/*
		 * consigli iniziali: uso di if, uso di system in per leggere i parametri iniziali
		 * 
		 */

		/******** TEMPLATE IF ************************
		 * TRADUZIONE
		 * if:se
		 * else:sennò
		 * Lo statement if accetta SEMPRE E SOLO BOOLEAN
		 */
		int eta;
		double costo, costoFinale;
		/*
		 * eta lo prendo ta tastiera...
		 * ma intanto la rendo cablato
		 *
		 */
		
		/**************TEMPLATE di LETTURA A RIGHE di SYSTEM IN**********************************/
		/*
		 * Reader = Lettore
		 * il buffer consente di trattare lo stream in ingresso con 
		 * varie funzionalità, per esempio la lettura di un intera linea
		 */
		BufferedReader stdInBufferizzato = null;
		/*
		 * incapsulo System.in prima in un InputStreamReader,
		 * poi in un BufferedReader
		 */
		stdInBufferizzato = new BufferedReader( new InputStreamReader(System.in) );

		/********************************************************************/

		
		System.out.println("Inserisci l'età: ");
		//Esempio di lettura

		String linea;
		linea = stdInBufferizzato.readLine();
		eta = Integer.parseInt(linea);

		costo = 50;
		
		boolean condizione = eta < 18 || eta > 65;
		if(condizione) {
			//STRADA VERA

			boolean condizione2 = eta < 10;
			if(condizione2) {
				//STRADA VERA GRATIS

				costoFinale = costo - costo;

			}
			else {
				//STRADA FALSA -30%

				costoFinale = costo - (costo * 0.3);

			}


		}
		else {
			//STRADA FALSA

			boolean condizione3 = eta >= 30 && eta <= 40;
			if(condizione3) {
				// VERO EXTRA

				costoFinale = costo + (costo * 0.1);
			}
			else {
				// FALSO INTERO

				costoFinale = costo;
			}
		}
		/*************************************************/

		System.out.println("Il costo finale calcolato è: "+ costoFinale);
		
		
	}
}
