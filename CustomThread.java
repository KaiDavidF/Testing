
public class CustomThread extends Thread {
	String name;
	Klasse klasse;
	boolean b;
	
	CustomThread(String name, Klasse klasse, boolean b) {
		this.name = name;
		this.klasse = klasse;
		this.b = b;
	}
	
	public void run() {
		System.out.println("Starte Thread " + name);
		
		
		for (int i = 0; i < 5; i++) 
		{
			if (b) 
			{
				klasse.first();
			}
			else 
			{
				klasse.second();
			}
		}
		
		
		
		System.out.println("Beende Thread " + name);
	}
}

