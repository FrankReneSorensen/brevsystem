package com.brevsystem;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SendAvtaleTilKundeRequest")
public class SendAvtaleTilKundeRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8615014312273833904L;
	
	
	Person person;
	
	Avtale avtale;
	
	Adresse adresse;
	
	String kilde;
	
	@XmlElement(name = "kilde", required = true)
	public String getKilde() {
		return kilde;
	}
	public void setKilde(String kilde) {
		this.kilde = kilde;
	}
	
	
	@XmlElement(name = "person", required = true)
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	@XmlElement(name = "avtale", required = true)
	public Avtale getAvtale() {
		return avtale;
	}
	public void setAvtale(Avtale avtale) {
		this.avtale = avtale;
	}
	
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	
	
}
