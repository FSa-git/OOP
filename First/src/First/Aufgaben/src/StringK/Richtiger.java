package StringK;

import java.util.Scanner;

public class Richtiger {

	public static void main(String[] args) {
boolean bAntwort = false, bKorrekt = true;
		
		int [] iZahlen = new int[5];
		int iSum = 0, iZahl = 0;
		String strAntwort;
		
		Scanner sc = new Scanner(System.in);
	
			System.out.println("Eingabeaufforderung <ja> oder <nein>?");
			strAntwort = sc.next();
			if(strAntwort.equals("ja")) {
				for (int i = 0; i < iZahlen.length; i++) {
					
					if (bAntwort == false) System.out.println("Geben Sie die " + (i+1) + " .Zahl ein:" );
					iZahl = sc.nextInt();
					iZahlen[i] = iZahl;
					iSum = iSum + iZahl;
					
				}
				System.out.println("Gesamtsumme: " + iSum);
				sc.close();
			}
			else{
				System.out.println("Falsche Eingabe");
				sc.close();
			}

	}

}
