package datenbank;

public class Programminformation 
{
	public Integer nummer;
	public String titel;
	public Long startzeit;
	public Long endzeit;
	public String vorname;
	public String nachname;
	public Long reale_startzeit;
	public Long reale_endzeit;
	
		
	public Programminformation(Integer nummer, String titel, Long startzeit, Long endzeit, String vorname, String nachname, Long reale_startzeit, Long reale_endzeit)
	{
		this.nummer = nummer;
		this.titel = titel;
		this.startzeit = startzeit;
		this.endzeit = endzeit;
		this.vorname = vorname;
		this.nachname = nachname;
		this.reale_startzeit = reale_startzeit;
		this.reale_endzeit = reale_endzeit;
		return;
	}	
}
