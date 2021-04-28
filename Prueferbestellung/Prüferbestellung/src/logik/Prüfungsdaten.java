package logik;

public class Pr�fungsdaten {

	private String modulbezeichnung, modulnummer, erstpr�fer, zweitpr�fer, datum;

	public Pr�fungsdaten(String modulbezeichnung, String modulnummer, String erstpr�fer, String zweitpr�fer, String datum) {
	
		this.modulbezeichnung = modulbezeichnung;
		this.modulnummer = modulnummer;
		this.erstpr�fer = erstpr�fer;
		this.zweitpr�fer = zweitpr�fer;
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

	public String getErstpr�fer() {
		return erstpr�fer;
	}

	public void setErstpr�fer(String erstpr�fer) {
		this.erstpr�fer = erstpr�fer;
	}

	public String getZweitpr�fer() {
		return zweitpr�fer;
	}

	public void setZweitpr�fer(String zweitpr�fer) {
		this.zweitpr�fer = zweitpr�fer;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}


	@Override
	public String toString() {
		return "Pr�fungsdaten [modulbezeichnung=" + modulbezeichnung + ", modulnummer=" + modulnummer + ", erstpr�fer="
				+ erstpr�fer + ", zweitpr�fer=" + zweitpr�fer + ", datum=" + datum + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
