package Lezione09_esercizi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * dati base e altezza, presi da stdInput, stampare a video l'area
 */

public class ExAreaTriangolo {

	public static void main(String[] args)throws IOException{
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader miaLinea = new BufferedReader(input);
		
		double area = 0, base, altezza;
		
		System.out.println("Base?");
		base = Double.parseDouble(miaLinea.readLine());
		
		System.out.println("Altezza?");
		altezza = Double.parseDouble(miaLinea.readLine());
		
		area = base*altezza/2;
		
		System.out.println("L'area è "+ area);
	}
}
