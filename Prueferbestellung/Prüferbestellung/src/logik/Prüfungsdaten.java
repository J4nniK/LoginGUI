package logik;

public class Prüfungsdaten {

	private String modulbezeichnung, modulnummer, erstprüfer, zweitprüfer, datum;

	public Prüfungsdaten(String modulbezeichnung, String modulnummer, String erstprüfer, String zweitprüfer, String datum) {
	
		this.modulbezeichnung = modulbezeichnung;
		this.modulnummer = modulnummer;
		this.erstprüfer = erstprüfer;
		this.zweitprüfer = zweitprüfer;
		this.datum = datum;
	}

	
	
	
	
	
	
	
	
	
	
	public String getModulbezeichnung() {
		return modulbezeichnung;
	}

	public void setModulbezeichnung(String modulbezeichnung) {
		this.modulbezeichnung = modulbezeichnung;
	}

	public String getModulnummer() {
		return modulnummer;
	}

	public void setModulnummer(String modulnummer) {
		this.modulnummer = modulnummer;
	}

	public String getErstprüfer() {
		return erstprüfer;
	}

	public void setErstprüfer(String erstprüfer) {
		this.erstprüfer = erstprüfer;
	}

	public String getZweitprüfer() {
		return zweitprüfer;
	}

	public void setZweitprüfer(String zweitprüfer) {
		this.zweitprüfer = zweitprüfer;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}


	@Override
	public String toString() {
		return "Prüfungsdaten [modulbezeichnung=" + modulbezeichnung + ", modulnummer=" + modulnummer + ", erstprüfer="
				+ erstprüfer + ", zweitprüfer=" + zweitprüfer + ", datum=" + datum + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
