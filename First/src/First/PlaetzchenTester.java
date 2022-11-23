package First;

public class PlaetzchenTester {

	public static void main(String[] args) {
		
		Plaetzchen p1 = new Plaetzchen();
		p1.sorte = "Kokos";
		p1.form = "Rund";
		p1.groesse = "Gross";
		
		p1.ausgeben();
		
		Auto lkwBaecker = new Auto();
		lkwBaecker.marke = "Volkswagen";
		lkwBaecker.tank = "Diesel";
		lkwBaecker.Baujahr = 94;
		
		lkwBaecker.ausgeben();
		
		// Ausgabe
		System.out.println("Hallo..");
	}

}
