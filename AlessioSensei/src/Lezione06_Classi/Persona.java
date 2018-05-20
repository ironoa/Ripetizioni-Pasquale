package Lezione06_Classi;

public class Persona {
	

	/*
	 * ATTRIBUTI DELLA CLASSE
	 */
	
	int eta;
	String nome;

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
	public Persona(int eta, String nome) {
		this.nome = nome;
		this.eta = eta;
	}
	

	
	
	/*
	 * METODI DELLA CLASSE
	 */
	public void stampaNomeEta(){
		System.out.println("il mio nome è: "+nome+", La mia eta è: "+eta);
	}

}
