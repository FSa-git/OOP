package Pizza;

public class Pizza {

	private String sorte;
	private String groesse;
	private double preis;
	
	private void ausgeben() {
		System.out.println(sorte + preis + groesse );
		
	}
	


	public static void main(String[] args) {
		
		Pizza margherita = new Pizza();
		
		margherita.groesse = "Gross";
		margherita.preis = 10.20;
		margherita.sorte = "Pomodoro";
		
		margherita.ausgeben();
		
	}





	
}
