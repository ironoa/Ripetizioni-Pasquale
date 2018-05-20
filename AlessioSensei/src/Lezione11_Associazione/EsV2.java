package Lezione11_Associazione;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EsV2 {
	
	/*
	 * ALESSIO: 
	 * positivo.... 1 ora e 10 di algoritmo su carta
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader miaLinea = new BufferedReader(input);
		
//		System.out.print("inserisci a");
//		int a = Integer.parseInt(miaLinea.readLine());
//		System.out.print("inserisci b");
//		int b = Integer.parseInt(miaLinea.readLine());
//		
//		int max;
//		
//		if(a > b) {
//			max=a;
//
//		}
//		else {
//			max=b;
//		}
//		
//		System.out.println(max);
		
//		double off, max = 0;
//		String finito = "no";
//		
//		
//		while(!finito.equals("si")) {
//			
//			System.out.println("off?");
//			off = Double.parseDouble(miaLinea.readLine());
//			
//			
//			if(off >= max) {
//				max = off;
//				
//				
//			}
//			System.out.println("vuoi finire?");
//			finito = miaLinea.readLine();
//		}
//		System.out.println(max);
		
		
		
		
		
		
		double off, max = 0;
		int index = 0, limit =3;		
		
		while(index < 3) {
			
			System.out.println("off?");
			off = Double.parseDouble(miaLinea.readLine());
			
			
			if(off >= max) {
				max = off;
				
				
			}
			index++;

		}
		
		System.out.println(max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
