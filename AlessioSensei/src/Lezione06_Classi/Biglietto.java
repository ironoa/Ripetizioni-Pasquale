package Lezione06_Classi;

/*
 * La CLASSE è lo stampino per creare gli OGGETTI
 * un OGGETTO è ISTANZA di una classe
 */
public class Biglietto {
	

	/*
	 * ATTRIBUTI DELLA CLASSE
	 */
	
    double costo;

	/*
	 * COSTRUTTORE: definisce come viene creata l'istanza
	 * 
	 * il costruttore deve sempre essere PUBLIC, ovvero chiunque vi può
	 * accedere dall'esterno
	 * 
	 * Il nome del costruttore deve sempre essere identico al nome della classe,
	 * i parametri in ingresso non per forza.
	 * 
	 * il parametro di uscita di questa funzione è implicito quindi non definito nella firma:
	 * l'istanza dell'oggetto
	 * 
	 * tale metodo particolare, il costruttore, viene sempre richiamato con la 
	 * parola chiave NEW
	 */
	public Biglietto(double costo) {
		this.costo = costo;
	}
	

	
	
	/*
	 * METODI DELLA CLASSE
	 */
	public void stampaCosto(){
		System.out.println("Il costo del biglietto è: "+costo);
	}

}
