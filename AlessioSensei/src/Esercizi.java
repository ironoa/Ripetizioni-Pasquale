import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Esercizi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/************************************************
		 * conta da 1 a 50 e stampa questi NUMERI a video 
		 */

		//		int index = 1;
		//		while(index < 51) { //1)"Cit. VALUTAZIONE della VARIAIBLE CONDIZIONE" == BOOLEAN
		//		//CONDIZIONE VERA
		//			
		//			System.out.println(index);
		//			index = index +1; // == index++
		//		}
		/*******************************************************/


		/* ESERCIZIO 3)
		 * funzione che restituisce un booleano: se un numero passato è maggiore di una 
		 * certa soglia, restituisce true, altrimenti false
		 * esempio di chiamata dal main: testMaggiore(18,15) ritorna vero perchè 18 è maggiore di 15. 
		 */

		//		int a, soglia;
		//		a = 456;
		//		soglia = 453;
		//		boolean risultato = testMaggiore(a, 555);
		//		System.out.println("il risultato del paragone è: " + risultato); 


		/**************************************************************
		 * ESERCIZIO 4: 
		 * conta da 1 a 50, ma stampa questi NUMERI solo se sono PARI
		 * es:
		 * 2
		 * 4
		 * 6
		 * 8
		 * .
		 * .
		 * .
		 */

		/*
		 * ESEGUI (PLAY) IL CODICE CHE SEGUE E VEDI COME SI COMPORTA
		 */

		//suggerimento: l'operatore % percentuale ritorna il RESTO di una divisione
		//		System.out.println(" 4 % 2 = "+ 4%2 +" , in quanto 4/2=2 con resto di zero");
		//		System.out.println(" 10 % 3 = "+ 10%3 +" , in quanto 10/3=3 con resto di 1");
		//		System.out.println("nota anche come con l'operatore + possa concatenare stringhe e valori: " +true);
		/*diciamo che è possibile sommare piu stringhe producendo una CONCATENAZIONE; 
		 * ma anche stringhe con altri valori che di fatto accanto ad una stringa vengono 
		 * CONVERTITI in stringa e poi concatenati. Quindi nell ultimo esempio:
		 * 1)Esiste una stringa "nota anche......"
		 * 2)Viene sommata ad un booleano ==> il booleano true viene TRASFORMATO nella STRINGA "true"
		 * 3)le 2 stringhe vengono CONCATENATE per formarne una sola, passata come parametro al println
		 */

		//stampaPari ();
		//stampaMaggiori(44);


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
		 * Reader = Leggere
		 * il buffer consente di trattare lo stream in ingresso con 
		 * varie funzionalità, per esempio la lettura di un intera linea
		 */
		BufferedReader stdIn = null;
		/*
		 * incapsulo System.in prima in un InputStreamReader,
		 * poi in un BufferedReader
		 */
		stdIn = new BufferedReader( new InputStreamReader(System.in) );

		/********************************************************************/

		
		System.out.println("Inserisci l'età: ");
		//Esempio di lettura
		String linea;
		linea = stdIn.readLine();
		
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


	public static boolean testMaggiore (int a, int soglia) {
		boolean condizione = a > soglia;//se a e maggiore di soglia la condizione e vera altrimenti e falsa 
		return condizione;
	}

	public static void stampaMaggiori (int soglia) {
		int index = 1;
		while(index < 51) {

			/******** TEMPLATE IF ************************
			 * TRADUZIONE
			 * if:se
			 * else:sennò
			 * Lo statement if accetta SEMPRE E SOLO BOOLEAN
			 */
			//			boolean condizione = index > soglia;
			boolean condizione = testMaggiore(index,soglia);
			if(condizione) {
				//STRADA VERA
				System.out.println(index);
			}
			else {
				//STRADA FALSA

			}
			/*************************************************/

			index ++;

		}
	}



	public static void stampaPari () {
		int index = 1;
		while(index < 51) {

			/******** TEMPLATE IF ************************
			 * TRADUZIONE
			 * if:se
			 * else:sennò
			 * Lo statement if accetta SEMPRE E SOLO BOOLEAN
			 */

			boolean condizione = (index % 2) == 0;
			if(condizione) {
				//STRADA VERA
				System.out.println(index);
			}
			else {
				//STRADA FALSA

			}
			/*************************************************/


			index ++;

		}
	}




}
