package datenbank;

public class Test 
{


	public static void main(String[] args) 
	{
		Programminformation p  = new Programminformation(0, "ABC", System.currentTimeMillis(), System.currentTimeMillis() + 500000, "Montgomery", "Burns", System.currentTimeMillis() - 10000, System.currentTimeMillis() - 5000);
		Datenbank.eintragen(p, true);
		Datenbank.ausgeben(true);
		Datenbank.ausgeben(System.currentTimeMillis(), true);
		Datenbank.ausgeben(1, true);
		p.titel = "ABCD";
		Datenbank.bearbeiten(p, true);
		System.out.println("xxxxxxxxxxxxxxxxxxx");
		Datenbank.loeschen(p, true);
	}

}
