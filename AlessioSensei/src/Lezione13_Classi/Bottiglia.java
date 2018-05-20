package Lezione13_Classi;

public class Bottiglia {

private String marca, materiale;
private double capacitaMl, prezzo;
private boolean riempita;
private Liquido liquido;

public Bottiglia (String marca, String materiale, double capacitaMl, double prezzo) {
	this.marca = marca;
	this.materiale = materiale;
	this.capacitaMl = capacitaMl;
	this.prezzo = prezzo*2;	
	this.riempita = false;
	this.liquido = null;
}

public Bottiglia (String marca, double capacitaMl, double prezzo) {
	this.marca = marca;
	this.materiale = "legno";
	this.capacitaMl = capacitaMl;
	this.prezzo = prezzo*2;	
	this.riempita = false;
	this.liquido = null;
}

public void stampaMarcaMaterialeCapacitaMlPrezzo() {
	System.out.println("Attributi bottiglia: Marca "+ marca +" Materiale "+ materiale +" Capacita "+ capacitaMl +" Prezzo "+ prezzo);
	
}

public void stampaMarcaMaterialeCapacitaMlPrezzo(String commento) {
	System.out.println("Attributi bottiglia: Marca "+ marca +" Materiale "+ materiale +" Capacita "+ capacitaMl +" Prezzo "+ prezzo);
	System.out.println("Parere perosonale: "+ commento);
}

public boolean isRiempita() {
	return riempita;
	
}

public void riempi(Liquido liquido) {
	this.liquido = liquido;
	this.riempita = true;
	
}

public void stampaContenuto() {
	if(isRiempita()) {
		liquido.stampaAttributi();
	}
	else {
		System.out.println("La bottiglia è vouta!");
	}
}
public Liquido getLiquido() {
	return liquido;
}

}
