package StringK;

import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		
		
		// Array Initialisierung
		int [] iZahlen = new int [5];
		int iEingabe;
		int iSumme = 0;
		String antwort;
		boolean bKorrekt = true;
		boolean bFalsch = false;
		Scanner sc = new Scanner(System.in);
		
	
		
		// Ausgabe
		do{
			System.out.println("Eingabeaufforderung <ja> oder <nein>?");
		antwort = sc.next();
		
		if(antwort.equals("ja")) {
			bKorrekt = false;
			bFalsch = false;
		}
		else if(antwort.equals("nein")){
			bKorrekt = false;
			bFalsch = true;
		}
		
		if(bKorrekt) System.out.println("Falsche Eingabe");;
		
		}while(bKorrekt);
		
		for (int i = 0; i < iZahlen.length; i++) {
			if(bFalsch == false) {
				System.out.println("Geben sie die " + (i+1) +". Zahl ein:");
			}
			iEingabe = sc.nextInt();
			iSumme = iSumme + iEingabe;
		}
		System.out.println("Gesamtsumme: " + iSumme);
		sc.close();
		}
	
	}


