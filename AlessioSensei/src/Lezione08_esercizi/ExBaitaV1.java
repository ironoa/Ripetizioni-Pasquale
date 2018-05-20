package Lezione08_esercizi;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

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
 * Non completamente finito
 * 54:00:00 minuti
 * 18/03/18
 * 
 * ALESSIO
 * Primo appunto:
 * - Non è stato fatto l'algoritmo su carta
 * 
 * PASQUALE
 * - Ho avuto difficoltà a stendere l'algoritmo su carta
 * 	CONSIGLIO DI ALESSIO: qualunque cosa succeda, devi prima sbattere la testa sull algoritmo su carta 
 */




public class ExBaitaV1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader miaLinea = new BufferedReader(input);
		
		String servizio, supp;
		double prezzoFin = 7;
		
		System.out.println("Quale servizio si vuole scegliore: Passegiata(con guida) 7 euro/ora o Soggiorno(con passegiate con guide illimitate) 30 euro/giorno");
		servizio = miaLinea.readLine();
		
		if(servizio.equals("Passegiata") || servizio.equals("passegiata")) {
			System.out.println("Vuole un supplemento aggiuntivo: Pasti +5%, Dog-sitter +10% SI o NO");
			supp = miaLinea.readLine();
			
			if(supp.equals("SI") || supp.equals("si") || supp.equals("Si")) {
				System.out.println("Quale supplemento: Pasti, Dog-sitter, Entrambi");
			    supp = miaLinea.readLine();
			  
			}
			else {
				System.out.println("Il prezzo finale è "+ prezzoFin);
					
				}
			}
		
		else {
			if(servizio.equals("Soggiorno") || servizio.equals("soggiorno")) {
				System.out.println("Vuole un supplemento aggiuntivo: Pasti +5%, Dog-sitter +10% SI o NO");
				supp = miaLinea.readLine();
				
				if(supp.equals("SI") || supp.equals("si") || supp.equals("Si")) {
					System.out.println("Quale supplemento: Pasti, Dog-sitter, Entrambi");
				    supp = miaLinea.readLine();
				    
				}
					
			}
		
			}
				
		}
      

	}


