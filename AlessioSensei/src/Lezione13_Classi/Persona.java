package Lezione13_Classi;

public class Persona {
	private String nome, cognome;
	private int eta;
	
	public Persona(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	public void stampaAttributi() {
		System.out.println("Attributi: Nome: "+ nome +" Cognome: "+ cognome +" Eta: "+ eta);
	}
	public void bevi(Bottiglia bottiglia) {
		System.out.println("Sono:");
		stampaAttributi();
		System.out.println("Sto bevendo:");
		bottiglia.stampaContenuto();
//		bottiglia.getLiquido();
		Liquido liquido = bottiglia.getLiquido();	
	}
	public void giudice() {
		if(eta < 18) {
			System.out.println("Non posso bere");
		}
		else {
			System.out.println("Posso bere");
		}
	}

}
