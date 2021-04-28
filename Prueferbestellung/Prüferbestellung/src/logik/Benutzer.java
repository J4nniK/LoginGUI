package logik;

import java.util.ArrayList;
import java.util.Iterator;

public class Benutzer {

	private String vorname, nachname, kennung,email;
	private ArrayList<String> fachgruppen;
	boolean isAdmin, isDozent, isPrüfungsplanung;
	
	public Benutzer(String vorname, String nachname, String kennung, String email, boolean isAdmin,
			boolean isDozent, boolean isPrüfungsplanung) 
	{
		this.fachgruppen = new ArrayList<String>();
		this.vorname = vorname;
		this.nachname = nachname;
		this.kennung = kennung;
		this.email = email;
		this.isAdmin = isAdmin;
		this.isDozent = isDozent;
		this.isPrüfungsplanung = isPrüfungsplanung;
	}

	public String getVorname() 
	{
		return vorname;
	}

	public void setVorname(String vorname) 
	{
		this.vorname = vorname;
	}

	public String getNachname() 
	{
		return nachname;
	}

	public void setNachname(String nachname) 
	{
		this.nachname = nachname;
	}

	public String getKennung() 
	{
		return kennung;
	}

	public void setKennung(String kennung) 
	{
		this.kennung = kennung;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public void addFachgruppen(ArrayList<String> fachgruppen) 
	{
		
		Iterator iterator = fachgruppen.iterator();
		
		while(iterator.hasNext()) {
			if(!this.fachgruppen.contains(iterator.next())) 
			{
				this.fachgruppen.add(iterator.next().toString());
			}
		}
		
		
	}
	
	public String getFachgruppen()
	{
		
		String temp = "";
		Iterator iterator = this.fachgruppen.iterator();
		
		while(iterator.hasNext())
		{
			temp = temp + iterator.next() +"\n";
		}
		
		
		return temp;
		
	}
	
	
	
	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public boolean isDozent() {
		return isDozent;
	}

	public void setDozent(boolean isDozent) {
		this.isDozent = isDozent;
	}

	public boolean isPrüfungsplanung() {
		return isPrüfungsplanung;
	}

	public void setPrüfungsplanung(boolean isPrüfungsplanung) {
		this.isPrüfungsplanung = isPrüfungsplanung;
	}

	@Override
	public String toString() {
		return "Benutzer [vorname=" + vorname + ", nachname=" + nachname + ", kennung=" + kennung + ", email=" + email
				+ ", fachgruppe=" + getFachgruppen() + ", isAdmin=" + isAdmin + ", isDozent=" + isDozent
				+ ", isPrüfungsplanung=" + isPrüfungsplanung + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
