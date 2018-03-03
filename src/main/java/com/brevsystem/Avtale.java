package com.brevsystem;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Avtale")
public class Avtale {
	
	@XmlElement(name = "avtaleid", required = true)
	private String avtaleId;
	
	@XmlElement(name = "avtaleNavn", required = true)
	private String avtaleNavn;
	
	@XmlElement(name = "merknader")
	private String merknader;
	
	
	
	public String getMerknader() {
		return merknader;
	}
	public void setMerknader(String merknader) {
		this.merknader = merknader;
	}
	public String getAvtaleId() {
		return avtaleId;
	}
	public void setAvtaleId(String avtaleId) {
		this.avtaleId = avtaleId;
	}
	

	public String getAvtaleNavn() {
		return avtaleNavn;
	}
	public void setAvtaleNavn(String avtaleNavn) {
		this.avtaleNavn = avtaleNavn;
	}
	

}
