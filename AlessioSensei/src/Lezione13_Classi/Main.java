package Lezione13_Classi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Bottiglia b1 = new Bottiglia("Dottor Pepper", "Adamianto", 500, 200);
		
		//ciao.stampaMarcaMaterialeCapacitaMlPrezzo();
		
//		System.out.println(b1.prezzo);
		
		//ciao.stampaMarcaMaterialeCapacitaMlPrezzo("Ramen");
		
		Bottiglia b2 = new Bottiglia ("Dottor Pepper", 100, 40);
		
		b1.stampaMarcaMaterialeCapacitaMlPrezzo();
		b2.stampaMarcaMaterialeCapacitaMlPrezzo();
		
		Liquido l1 = new Liquido ("Fanta", "Caraibi", 254, 47);
		
		l1.stampaAttributi();
		b1.stampaContenuto();
		b1.riempi(l1);
		b1.stampaContenuto();
		
//		if(b1.isRiempita()) {
//			System.out.println("La bottiglia è piena");
//			
//		}
//		else {
//			System.out.println("La bottiglia è vuota");
//
//		}
		Persona p1 = new Persona ("Antonio", "Uchica", 33);
		
		p1.giudice();

	}

}
