
/**
 * Dies ist eine Beispielklasse
 * @author Christoph
 */
public class SuperClass {
	
	public void methode1 (String str) {
		System.out.println("Methode 1 aufgerufen");
	}
	
	private void methode3 () {
		System.out.println("Methode 3 aufgerufen");
	}
	
	
	@Override
	public String toString() {
		return "Klasse A";
	}
		
	public static void statischeMethode () {
		(new SuperClass()).methode3();
	}
	
}
