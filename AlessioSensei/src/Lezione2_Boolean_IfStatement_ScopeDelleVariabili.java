
public class Lezione2_Boolean_IfStatement_ScopeDelleVariabili {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*
		 * IL TIPO BOOLEAN
		 * Boolean può contenere sempre e solo 2 valori
		 * Vero o Falso, 0 o 1, true o false
		 * 	
		 */	
		boolean variabileBooleana = true;
		variabileBooleana = false;
		
		
		/******** TEMPLATE IF ************************
		 * TRADUZIONE
		 * if:se
		 * else:sennò
		 * Lo statement if accetta SEMPRE E SOLO BOOLEAN
		 */
		boolean condizione = true;
		if(condizione) {
			//STRADA VERA
		}
		else {
			//STRADA FALSA
		}
		/*************************************************/
		
		
		/*
		 * un piccolo appunto:
		 * 1)"Cit. VALUTAZIONE della VARIAIBLE CONDIZIONE"
		 * 2) Partono le istruzioni comprese nel blocco relativo alla strada selezionata
		 */
		if(condizione) { //1)"Cit. VALUTAZIONE della VARIAIBLE CONDIZIONE"
			//STRADA VERA
		}
		else {
			//STRADA FALSA
		}
		
		
		/***************** OPERATORI LOGICI vs CONFRONTO vs ASSEGNAZIONE **********************
		 * Fondamentale la conoscenza del BOOLEAN per capire gli IF-STATEMENT
		 * 
		 * + è un operatore matematico
		 * * è un operatore matematico
		 * - è un operatore matematico
		 * "/" è un operatore matematico
		 * % è un operatore matematico
		 * 
		 * == è un OPERATORE DI CONFRONTO
		 * = è un operatore di ASSEGNAZIONE
		 * != è un OPERATORE DI CONFRONTO
		 * >= è un OPERATORE DI CONFRONTO
		 * <= è un OPERATORE DI CONFRONTO
		 * Il risultato di un operatore di confronto è SEMPRE un BOOLEAN
		 * 
		 * OPERATORI LOGICI:
		 * Operatori Logici BINARI:
		 * 	AND: && 
		 *	OR:||
		 *	Lavorano sempre con 2 entità: ( ) OPERATORE () ==> RISULTATO
		 *	es: A && B 
		 * Operatori Logici UNARI:
		 * 	NOT: !
		 * 	Lavora con 1 entità: OPERATORE () ==> RISULTATO 
		 * 	es: !condizione
		 * 
		 * CASO PARTICOLARE: Le stringhe
		 * Quando si confrontano i contenuti di 2 strighe si utilizza sempre 
		 * la loro funzione .equals() e non l'operatore ==
		 * Capiremo poi il perchè
		 * ESEMPIO: sia zona una variabile stringa
		 * if(zona == "centro") 
		 * è meglio scriverlo come
		 * if(zona.equals("centro")
		 * 
		 * 
		 */
//		if(5 > 10){
//			System.out.println("ho eseguito la parte VERA");
//		}
//		else {
//			System.out.println("esecuzione del FALSO, ELSE");
//		}
		
		if( (5 > 6) || (7 == 7) || ("stringa a caso".equals("stringa a caso")) ) {
			System.out.println("la condizione è verissima");
		}
		/**************************************************************************************/
		
		
		
		
		/************************************************************************************************
		 * ESERCIZIO PER CASA (RISOLTO OK):
		 * PROBLEMA: in base a quello che ho mangiato (pizza o salame), voglio che mi venga 
		 * stampato a video la mia scelta;
		 * L'esercizio fa uso di STRINGHE, IF-STATEMENT ANNIDATI, BOOLEAN
		 * La scelta è CABLATA, non leggo niente da tastiera per semplicità
		 * Utilizzo della funzione equals delle Stringhe
		 */
		
			
		String mangiato = "salame"; //la mia scelta cablata

		/*
		 * scrivendo <<scelta.>> mi si aprono una serie di opreazioni disponibili
		 * utilizzero Equals: equals mangia stringhe, e sputa boolean
		 */
		boolean test = mangiato.equals("pizza");
		
		if(test) { //1)"Cit. VALUTAZIONE della VARIAIBLE CONDIZIONE"
			/*
			 * STRADA VERA
			 */
			System.out.println("hai mangiato la pizza");
		}
		else {
			/*
			 * STRADA FALSA
			 */	
			test=mangiato.equals("salame");
			if(test) {
				System.out.println("hai mangiato il salame");	
			}
			else {
				System.out.println("non hai mangiato il salame");
			}	
		}//else
		/*******************************************************************************/
		
		
	}//main
}//classe
