package neu;

public class ArraysInJava {

	public static void main(String[] args) {
		//Arrays 
		
		int [] iNoten = new int [10];
		String [] strNamen = {"Peter","Hans","Lars"};
		
		for (int i = 0; i < iNoten.length; i++) {
			System.out.println(iNoten[i]+ i);
		}
		
		for (int i = 0; i < strNamen.length; i++) {
			System.out.println("Hier ist der " + (i+1) + ". Name: " + strNamen[i]);
		}
		
	
	}

}
