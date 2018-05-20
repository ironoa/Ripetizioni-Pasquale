package Lezione12_biglietti;
import java.io.*;
public class biglietti {
	
	/*
	 * COMMENTI BY ALE:
	 * tempo impiegato 58 minuti
	 * 
	 * APPUNTI:
	 * - è stato fatto l'algoritmo su carta!!! MIGLIORAMENTO OK
	 * 
	 * soluzione non completa: 
	 * "Noti l’età di una persona in anni ed il costo del biglietto" ==> non è stato considerato il prezzo del biglietto,
	 * bensì è stato cablato nel codice ==> ERRORE RECIDIVO
	 * 
	 * A parte questo la soluzione è corretta e buona
	 */

	public static void main(String[] args)throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader miaLinea = new BufferedReader(input);
		
		//DATI INPUT
		double prezzoBig = 75, sconto;
		int eta;
		
		System.out.println("Inserisci l'età");
		eta = Integer.parseInt(miaLinea.readLine());
		
		if(eta <= 12) {
			System.out.println("E stato applicato lo sconto del 70%");
			sconto = prezzoBig * 0.70;
			prezzoBig = prezzoBig - sconto;
			
		}
		else if(eta > 13 && eta < 17 || eta > 60) {
			System.out.println("E stato applicato lo sconto del 30%");
			sconto = prezzoBig * 0.30;
			prezzoBig = prezzoBig - sconto;
		}
		System.out.println("L'importo da pagare è "+ prezzoBig);

	}

}
