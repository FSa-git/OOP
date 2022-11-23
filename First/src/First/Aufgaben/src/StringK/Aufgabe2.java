package StringK;

import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		
		// Array Initialisierung
		int [] iZahlen = new int [5];
		int iEingabe;
		int iSumme = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < iZahlen.length; i++) {
			System.out.println("Geben sie die " + (i+1) +". Zahl ein:");
			iEingabe = sc.nextInt();
			iSumme = iSumme + iEingabe;
		}
		System.out.println("Gesamtsumme: " + iSumme);
		sc.close();

	}

}
