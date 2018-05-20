package Lezione13_Classi;

public class Liquido {
	
	private String tipo, provenienza;
	private double densita, costo;
	private boolean alcolico;
	
	public Liquido(String tipo, String provenienza, double densita, double costo) {
		this.tipo = tipo;
		this.provenienza = provenienza;
		this.densita = densita;
		this.costo = costo;
		this.alcolico = false;
	}
	
	public Liquido(String tipo, String provenienza, double densita, double costo, boolean alcolico) {
		this.tipo = tipo;
		this.provenienza = provenienza;
		this.densita = densita;
		this.costo = costo;
		this.alcolico = alcolico;
	}
	
	public void stampaAttributi() {
		System.out.println("Attributi: tipo: "+ tipo +" provenienza: "+ provenienza +" densita: "+ densita +" costo: "+ costo);
	}
	public boolean isAlcolico() {
		return alcolico;
	}
	
	

}
