package Lezione07_esercizi;
import java.io.*; 
public class Ex1 {
	
	/*
	 * AGENZIA IMMOBILIARE, prezzi appartamenti
	 * 
	 * DATI IN INGRESSO: Zona, dimensioni appartamento, percentuale che si piglia l'agenzia
	 * DATI IN OUT: costo appartamento, prezzo di vendita comprensivo di percentuale per l'agenzia
	 * 
	 * i dati in ingresso devono essere letti da tastiera
	 * 
	 */

	public static void main(String[] args)throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader miaLinea = new BufferedReader(input);
		
		// DATI IN INGRESSO
		String zona;
		double prezzoMQ = 0, dimensioni, prezzo, percentualeA, prezzoFinale;
		
		System.out.println("Inserire la zona");
		zona = miaLinea.readLine();
		
		System.out.println("Inserire le dimensioni");
		dimensioni = Double.parseDouble(miaLinea.readLine());
		
		System.out.println("Inserire inserire la percentuale [ES. 0.20 = 20%]");
		percentualeA = Double.parseDouble(miaLinea.readLine());
		
		if(zona.equals("centro")) {
			prezzoMQ = 3000;
		}
		else {
			if(zona.equals("zona1")) {
				prezzoMQ = 2700;
			}
			else {
				if(zona.equals("zona2")) {
					prezzoMQ = 2500;
				}
				else {
					if(zona.equals("zona3")) {
						prezzoMQ = 2000;
					}
					else {
						if(zona.equals("periferia")) {
							prezzoMQ = 1800;
						}
						else {
							// da migliorare
							System.out.println("ERRORE");
							return;
						}
						
					}
				}
			}

		}

		prezzo = prezzoMQ * dimensioni;
		prezzoFinale = (prezzo * percentualeA) + prezzo;
		System.out.println("Il prezzo senza la percentuale dell'agenzia è " + prezzo);
		System.out.println("Il prezzo finale è " + prezzoFinale);

		
		
		
	}

}
