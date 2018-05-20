package Lezione14_Array;

import java.io.*;


public class OrdinaArray {
	
	//ordinamento array monodimensionale
	public static void main(String[] args) throws IOException,NumberFormatException {
		
	InputStreamReader input = new InputStreamReader (System.in);
	BufferedReader miaLinea = new BufferedReader (input);
	
	/*
	 * array di dimensione:
	 * - FISICA: massimo 10 elementi
	 * - LOGICA: caricata da tastiera, numElementi
	 */
	int[]numPezzi = new int[10];
	
	int i,numElementi=0,appoggio;
	
	
	
	//check di validita: numero positivo
	while (numElementi<=0) {
		System.out.println("Inserire il numero degli elementi");
		numElementi=Integer.parseInt(miaLinea.readLine());
	}
	
	//riempimento array da tastiera
	for (i=0;i<numElementi;i++) {//spazzolamento dell'array
		System.out.println("Inserire l'elemento");
		numPezzi[i]=Integer.parseInt(miaLinea.readLine());
	}
	
	boolean scambio=true;
	//ordinamento con algoritmo bubble
	while (scambio) {
		//si suppone che l'array sia già ordinato
		scambio=false;
		for (i=0;i<numElementi-1;i++) {
			if (numPezzi[i]>numPezzi[i+1]) {
				//se non è ordinato scambio
				appoggio=numPezzi[i+1];
				numPezzi[i+1]=numPezzi[i];
				numPezzi[i]=appoggio;
				scambio=true;
			}
		}
	}
	
	
	for (i=0;i<numElementi;i++) {
		System.out.println(numPezzi[i]);
	}
	}
}