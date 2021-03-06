package Lezione10_esercizi;
import java.io.*;
/*
 * Un supermercato applica la formula 3x2, compri 3 e paghi 2, per tutti i prodotti acquistati in data odierna. 
 * Dato in input il numero di prodotti ed il costo unitario determinare quanto viene speso.
 */

public class SupermercatoV3 {
	
	public static void main(String[] args)throws IOException {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader miaLinea = new BufferedReader(input);
		
		// DATI IN INGRESSO
		int numProd;
		double costProd;
		
		// DATI IN OUTPUT
		double costTot = 0;
		
		System.out.println("Numero dei prodotti?");
		numProd = Integer.parseInt(miaLinea.readLine());
		
		int i = 1; //CONTO IL PRODOTTO CONSIDERATO
		int j = 1; //conteggio del 3x2
		while(i <= numProd) {
			
			System.out.println("Inserisci il prezzo del prodotto numero "+i);
			costProd = Double.parseDouble(miaLinea.readLine());
					
			/*
			 * ALGORITMO 3X2 IMPLEMENTATO CON "variabile di conteggio"
			 */
			if(j==3) { 
				System.out.println("Ho applicato lo sconto del 3x2");
				
				j=1;
			}
			else {
				costTot = costProd + costTot;
				
				j++;
			}
			//PER FAR FINIRE IL CICLO
			i++;
		}
		
		System.out.println("Il prezzo finale � "+costTot);
		
	}

}
