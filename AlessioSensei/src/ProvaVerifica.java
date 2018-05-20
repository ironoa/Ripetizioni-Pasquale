import java.io.*;
public class ProvaVerifica {
	public static void main(String[] args) throws IOException {
		//calcolare prezzo pagato
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader miaLinea = new BufferedReader (input);
		//miaIn è una variabile di lavoro per acquisire i dati di input
		//in formato stringa di caratteri
		//variabili di lavoro
		String miaIn;
	//variabili di input
	String servizio,pasto,impegnativo;
	int numOre,numGiorni;
	//variabili di output
	double costoServizio,supplPasto,supplImpegnativo,prezzoPagato;
	//calcolare costo serivizio
	System.out.println("Inserire il tipo di servizio (Soggiorno/Passeggiata)");
	servizio=miaLinea.readLine();
	/********************************************************************
	 * istruzione di if inserita da Alessio, 
	 * istruzione di controllo sul valore inserito
	 */
	if(!(servizio.equals("Soggiorno")||servizio.equals("Passeggiata"))){
		System.out.println("iserito valore errato. Abortisco il programma");
		return;
	}
	/********************************************************************/
	if (servizio.equals("Soggiorno")) {
		System.out.println("Inserire il numero di giorni");
		miaIn=miaLinea.readLine();
		numGiorni=Integer.parseInt(miaIn);
		costoServizio=numGiorni*13;
	}
	else {
		System.out.println("Inserire il numero di ore");
		miaIn=miaLinea.readLine();
		numOre=Integer.parseInt(miaIn);
		costoServizio=numOre*9;
	}
	System.out.println("Costo Servizio " + costoServizio);
	//calcolare supplemento pasto
	System.out.println("Vuole anche il pasto? (Si/No)");
	pasto=miaLinea.readLine();
	if (pasto.equals("Si")) {
		supplPasto=costoServizio*5/100;
	}
	else {
		supplPasto=0;
	}
	System.out.println("Supplemento Pasto " + supplPasto);
	prezzoPagato=costoServizio+supplPasto;
	//calcolare supplemento cane impegnativo
	System.out.println("Il cane è impegnativo? (Si/No)");
	impegnativo=miaLinea.readLine();
	if (impegnativo.equals("Si")) {
		supplImpegnativo=prezzoPagato*10/100;
	}
	else {
		supplImpegnativo=0;
	}
	System.out.println("Supplemento Impegnativo " + supplImpegnativo);
	//calcolare prezzo pagato
	prezzoPagato=prezzoPagato+supplImpegnativo;
	System.out.println("Prezzo Pagato " + prezzoPagato);
	}
}
