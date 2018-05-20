/********************************************************************
 * 
 * Utili per leggere bufferizzando lo std input, ovvero la tastiera
 * 
 * 
 *******************************************************************/

package system.in.read;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Utils {


	public static void leggiCar() {
		/**************TEMPLATE di Lettura A CARATTERE di SYSTEM IN**********************************/
		/*
		 * Reader = Leggere
		 * il buffer consente di trattare lo stream in ingresso con 
		 * varie funzionalità, per esempio la lettura di un intera linea
		 */
		BufferedReader stdInBufferizzato = null;
		try {
			/*
			 * incapsulo System.in prima in un InputStreamReader,
			 * poi in un BufferedReader
			 */
			stdInBufferizzato = new BufferedReader(new InputStreamReader(System.in));
			
			//Esempio di lettura
			char ch=(char)stdInBufferizzato.read();//letto un carattere
			
			//del tutto equivalente a...
			char ch2=(char)System.in.read();//letto un carattere
		} 
		catch(IOException e){
			e.printStackTrace();
		}
		/********************************************************************/
	}//leggiCar



	/*
	 * versione senza il rilancio delle ECCEZIONI (throws)
	 * TRY CATCH
	 */
	public static void leggiLinea() {
		
		/**************TEMPLATE di LETTURA A RIGHE di SYSTEM IN**********************************/
		/*
		 * Reader = Leggere
		 * il buffer consente di trattare lo stream in ingresso con 
		 * varie funzionalità, per esempio la lettura di un intera linea
		 */
		BufferedReader stdInBufferizzato = null;
		try {
			/*
			 * incapsulo System.in prima in un InputStreamReader,
			 * poi in un BufferedReader
			 */
			stdInBufferizzato = new BufferedReader( new InputStreamReader(System.in) );

			//Esempio di lettura
			String linea;
			linea = stdInBufferizzato.readLine();
			
		} 
		catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		/********************************************************************/
	}//leggiLinea
	
	
	/*
	 * By Pasquale come la vuole la prof
	 */
	public static void leggiLinea2() throws IOException {
		/*****************************************************/
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader miaLinea = new BufferedReader(input);
		
		//ESEMPIO
		System.out.println("Inserire il primo numero");
		double a = Double.parseDouble(miaLinea.readLine());
		System.out.println("Inserito: "+a);
		/********************************************************/
	}
	
	
}
