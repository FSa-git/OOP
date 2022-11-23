package StringK;

public class LiteralTester {
	
	public static void main(String[] args) {
	
	// Deklarierung
	String str1;
	String str2;
	String str3;
	String str4;
	int anzahl = 0;
	
	// Initialisierung
	str1 = "Bo die Katze";
	str2 = "Bo die Katze";
	
	str3 = new String("Fred der Hund");
	str4 = new String("Fred der Hund");
	
	// Ausgabe 
	if(str1 == str2) {
		anzahl = 1;
	System.out.println("str1 und str2 sind gleich");
	}
	else {
		anzahl = 2;
		System.out.println("str1 und str2 sind gleich");
	}
	
	if(str3 == str4) {
		anzahl = 1;
		System.out.println("str3 und str4 sind gleich");
	}
	else {
		anzahl = 2;
		System.out.println("str3 und str4 sind ungleich");
	}
	
	System.out.println("Es wurden " + anzahl + " Objekte erzeugt.");
	}
}
