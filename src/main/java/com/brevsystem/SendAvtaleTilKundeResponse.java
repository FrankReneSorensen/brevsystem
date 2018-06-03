package com.brevsystem;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SendAvtaleTilKundeResponse")
public class SendAvtaleTilKundeResponse implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9120578552028460191L;
	private String avtaleNummer;
	private String kommentar;
	
	
	
	public String getKommentar() {
		return kommentar;
	}
	public void setKommentar(String kommentar) {
		this.kommentar = kommentar;
	}
	public String getAvtaleNummer() {
		return avtaleNummer;
	}
	public void setAvtaleNummer(String avtaleNummer) {
		this.avtaleNummer = avtaleNummer;
	}
	
	
	
	

}
