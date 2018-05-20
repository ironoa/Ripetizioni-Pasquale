package Lezione06_Classi;

/*
 * La CLASSE � lo stampino per creare gli OGGETTI
 * un OGGETTO � ISTANZA di una classe
 */
public class Arma {

	/*
	 * ATTRIBUTI DELLA CLASSE
	 */
	String nome;
	String tipo; //tipo per esempio spada, martello, ....
	double danno;
	double portata;
	
	/*
	 * COSTRUTTORE: definisce come viene creata l'istanza
	 * 
	 * il costruttore deve sempre essere PUBLIC, ovvero chiunque vi pu�
	 * accedere dall'esterno
	 * 
	 * Il nome del costruttore deve sempre essere identico al nome della classe,
	 * i parametri in ingresso non per forza.
	 * 
	 * il parametro di uscita di questa funzione � implicito quindi non definito nella firma:
	 * l'istanza dell'oggetto
	 * 
	 * tale metodo particolare, il costruttore, viene sempre richiamato con la 
	 * parola chiave NEW
	 */
	public Arma(String nome, String tipoPassato, double dannoPassato, double portataPassato) {
		this.nome = nome;//ESEMPIO di this
		tipo = tipoPassato;
		danno = dannoPassato;
		portata = portataPassato;
	}
	

	
	
	/*
	 * METODI DELLA CLASSE
	 */
	public void stampaNomeDanno(){
		System.out.println("Sono un arma, il mio nome �: "+nome+", il mio danno �: "+danno);
	}
	
	
	
}


/*
 * DOMANDA: che differenza c'� tra oggetto e classe?
 * 
 * senza la classe non pu� esistere l'oggeto... VERO
 * senza l'oggetto non pu� esistere la classe... FALSO
 * 
 * Con le classi si creano oggetti.... pi� precisamente li ISTANZIO
 * 
 * Ci torniamo pi� tardi....
 * 
 */ 



