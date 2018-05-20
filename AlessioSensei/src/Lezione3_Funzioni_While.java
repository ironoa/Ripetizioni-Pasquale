import java.io.*;

public class Lezione3_Funzioni_While {

	public static void main(String[] args) {


		/*
		 * INVOCAZIONE di funzione
		 */
		funzione1Vuota();

		funzione1Vuota();




		//		stampa(parola);
		//		
		//		stampa("un altra stringa");

		//		funzione2("prova della funzione2");


		
		


		//utilizzare la funzione charAt per stampare tutti i caratteri, uso del while
		//while = in italiano significa FINCHE'
		//il while accetta sempre e solo BOOLEAN proprio come l'IF; d'altronde è la valutazione di una CONDIZIONE
		String p="pasquale";
		int index = 0;
		while(index < p.length()) { //1)"Cit. VALUTAZIONE della VARIAIBLE CONDIZIONE" == BOOLEAN
			//CONDIZIONE VERA
			
			System.out.println(p.charAt(index));
			index = index +1; // == index++
		}
		//CONDIZIONE FALSA
		
		
		
		//validateMail = verifica di stringa mail
		//ogni consonante deve essere rilevata
		//char at ci fa pescare l elemento, if ci fa testare se è una consonante
		String mail="pasq@uale";
		int i = 0;
		while(index < mail.length()) { //1)"Cit. VALUTAZIONE della VARIAIBLE CONDIZIONE" == BOOLEAN
			//CONDIZIONE VERA
			//racolgo il singolo carattere 
			char temporaneo=mail.charAt(index);
			
			//controllo se il carattere e @
			if('@'== temporaneo) { //1)"Cit. VALUTAZIONE della VARIAIBLE CONDIZIONE"
				//STRADA VERA
			}
			else {
				//STRADA FALSA
			}
			
			System.out.println(mail.charAt(index));
			index = index +1; // == index++
			
		}
		//CONDIZIONE FALSA
		
		
		
		

	}



	public static void stampa(String stringa) {
		System.out.println(stringa);
		return;
	}

	/*
	 * VOID: VUOTO, non restituisce nulla
	 * public static per ora lo scriviamo a prescindere
	 * questa funzione ha un nome a piacere: funzione1Vuota
	 * ogni funzione ha dei parametri di ingresso e dei parametri di uscita
	 * PARAMTERI IN: VUOTO
	 * PARAMETRI OUT: VUOTO (void) 
	 */
	public static void funzione1Vuota () {
		System.out.println("sono la funzione funzione1Vuota");

		/*
		 * ritorna il controllo al chiamante 
		 * Mi fa ritornare esattamente da dove ho INVOCATO la funzione
		 * Return è sempre implicito, messo per fini didattici.
		 * 
		 */
		return;
	}

	/*
	 * funzione2 riceve in ingresso una stringa e la stampa su console (std.out)
	 * non ritorna alcun valore
	 * 
	 */
	public static void funzione2 (String ingresso) {

		/*
		 * println riceve in ingresso una stringa e la 
//		 * stampa su console
		 */
		System.out.println(ingresso);




	}


}
