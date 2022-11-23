package neuee;

public class Getraenk {

	String name;
	public int bestand;
	public boolean alkohol;
	public double preis;
	public int mindestbestand;
	public int hoechstbestand;
	
	public Getraenk() {
	}
	
	public double berechneBestellmenge() {
		
		double bestellmenge = 0.0;
		
		if(bestand > mindestbestand) {
			bestellmenge = hoechstbestand - bestand;
		}

		return bestellmenge;
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	public String[] getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
}
