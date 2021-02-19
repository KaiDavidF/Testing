
public class TuermeVonHanoi {
	
	
	
	final static Object [] quelle = {"A", 0};
	final static Object [] ziel = {"B", 1};
	final static Object [] hilfe = {"C", 2};
	
	static int [] feld = new int[3];
	
	public static void main(String[] args) {
		loese(3);	
	}
	
	
	static void loese(int n) {
		loeseTuerme(n, quelle, ziel, hilfe);
	}
	
	static void loeseTuerme(int n, Object [] quelle, Object [] ziel, Object [] hilfe) {
		if (n == 0) {
			return;
		} else {
			loeseTuerme(n - 1, quelle, hilfe, ziel);

			System.out.println(quelle[0] + " nach " + ziel[0] + " bewegen.");
			
			loeseTuerme(n - 1, hilfe, ziel, quelle);
		}
	}
}
