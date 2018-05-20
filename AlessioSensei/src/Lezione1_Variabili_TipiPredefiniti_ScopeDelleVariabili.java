
public class Lezione1_Variabili_TipiPredefiniti_ScopeDelleVariabili {

	public static void main(String[] args) {
		
		/*
		 * Variabile o puntatore o riferimento, HA SEMPRE UN TIPO.
		 * 
		 * TIPI PREDEFINITI
		 * 
		 * float : numeri reali, diciamo che usiamo sempre i double
		 * double : numeri reali
		 * String : testo, racchiuso tra DOPPI APICI (o virgolette) "testo". Le stringhe in eclipse sono blu
		 * char: carattere, racchiuso tra singolo APICE 'carattere'
		 * int: numeri naturali
		 * BOOLEAN : possono assumere solo valori 0 o 1, VERO O FALSO, true o false
		 * enumerativi ENUM
		 * 
		 */
		
		//riserva dello spazzio di memoria sulla ram per la variabile
		//ogni variabile è un riferimento o puntatore 
		String parola;
		
		//parola punta a ciao di provaaa
		//ASSOCIO il valore al riferimento 
		parola = "ciao di provaaaaaaa";
		
		
		//riserva lo spazio per un'altra variabile 
		//DICHIARAZIONE DI VARIABILE
		int antonio;
		
		//ISTANZIAZIONE
		antonio = 78;
		
		//DICHIARAZIONE + ISTANZIAZIONE
		int antonio2 = 79;


		//TIPO CHAR
		char carattere = "pasquale".charAt(3);
		//System.out.println(carattere);
		
		/*
		 * nella definizione di variabili, perchè risulta importantissimo
		 * dichiarare il tipo che andranno a contenere (PUNTARE)?
		 */
		
		/* RICORDO
		 * TIPI PREDEFINITI
		 * 
		 * float : numeri reali, diciamo che usiamo sempre i double
		 * double : numeri reali
		 * String : testo, racchiuso tra gli APICI "testo". Le stringhe in eclipse sono blu
		 * int: numeri naturali
		 * BOOLEAN : possono assumere solo valori 0 o 1, VERO O FALSO, true o false
		 * enumerativi ENUM
		 * 
		 */
		
		/*
		 * ci sono molti tipi disponibili, il COMPILATORE deve sapere di 
		 * che tipo costruire questa variabile.
		 * Ma perchè ci sono tipi diversi?
		 * Ognuno serve ad una azione diversa, ed è bene che ci sia un CONTROLLO: i famosi PALETTI di Java
		 */
		
		
		
		/****************************************************************************************
		 * SCOPE DELLE VARIAIBILI
		 * Le variaibili vivono dentro il proprio scope, ed in quelli annidati all'interno.
		 * Dall interno VEDO l esterno
		 * Dall esterno NON vedo l interno
		 * Le variabili muoiono alla fine del blocco, vengono DEALLOCATE.
		 */
		//BLOCCO1
		int variabileEsterna;
		{
			//qui di fatto ho definito un blocco interno
			//BLOCCO2
			/*
			 * le variaibili che definito qui il blocco esterno (main) non
			 * le vede
			 */
			int variaibileInterna;
			
			/*
			 * le variabili esterne invece ovviamente le vedo e ci posso "giocare"
			 */
			variabileEsterna=7;
			
			{
				//altro blocco innestato di secondo livello
				//BLOCCO3
			}
			
		}
		//variaibileInterna = 7;//questo non lo potrei e non lo posso scrivere
		/*
		 * variabileInterna è stata deallocata alla fine del suo blocco
		 * 
		 * {
		 * 	BLOCCO1
		 * 	{
		 * 		BLOCCO2
		 * 		{
		 * 			BLOCCO3
		 * 		}//blocco3
		 * 	}//blocco2
		 * }//blocco1
		 * 
		 */
		/*****************************************************************************************/
		
		
		
		
		
		
		
	}

	
	
	
}
