package StringK;

import java.util.Scanner;

public class probe {

	public static void main(String[] args) {
boolean bAntwort = false, bKorrekt = true;
		
		int [] iZahlen = new int[5];
		int iSum = 0, iZahl = 0;
		String strAntwort;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Eingabeaufforderung <ja> oder <nein>?");
			strAntwort = sc.next();
			if(strAntwort.equals("ja"))
			{
				bAntwort = false;
				bKorrekt = false;
			}else if(strAntwort.equals("nein"))
			{
				bAntwort = true;
				bKorrekt = false;
			}
			if(bKorrekt) System.out.println("Falsche Eingabe");
			
			
		} while (bKorrekt);
		
		for (int i = 0; i < iZahlen.length; i++) {
			
			if (bAntwort == false) System.out.println("Geben Sie die " + (i+1) + " .Zahl ein:" );
			iZahl = sc.nextInt();
			iZahlen[i] = iZahl;
			iSum = iSum + iZahl;
			
		}
		System.out.println("Gesamtsumme: " + iSum);
		sc.close();

	}

}
