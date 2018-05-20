package Lezione11_Associazione;

import java.io.*;
public class Es {

	public static void main(String[] args)throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader miaLinea = new BufferedReader(input);
		
		//DATI IN INPUT
		double quota;
		
	    //DATI IN OUTPUT 
		double tot, impAl, impMed, totQuote = 0;
		int onori = 0, nSoci;
		String tipo;
		
		String finito = "no";
		while(!finito.equalsIgnoreCase("si")) {
			
			System.out.println("Tipo socio?");
			tipo = miaLinea.readLine();
			
			if(tipo.equalsIgnoreCase("onorario")) {
				onori++;
			}
			else if(tipo.equalsIgnoreCase("normale") || tipo.equalsIgnoreCase("anziano")) {
				System.out.println("I casi Anziano e Normale non vengono gestiti");
			}
			
			System.out.println("Quota?");
			quota = Double.parseDouble(miaLinea.readLine());
			
			totQuote = quota + totQuote;
			
			
			//chiedo se voglio continuare
			System.out.println("Hai finito? <<no>> per continuare, <<si>> per terminare");
			finito=miaLinea.readLine();
			
		}
		
		System.out.println("Il totale delle quote è "+ totQuote);
		
		System.out.println("Il numero dei soci onorari è "+ onori);


			
		
		
		
		

	}

}
