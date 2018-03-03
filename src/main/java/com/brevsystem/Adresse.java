package com.brevsystem;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.brevsystem.AdresseType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType (name = "Adresse")
public class Adresse {
	

	@XmlElement(name = "adresse1", required = true)
	private String adresse1;
	@XmlElement(name = "adresse2")
	private String adresse2;
	@XmlElement(name = "adresse3")
	private String adresse3;
	@XmlElement(name = "poststed", required = true)
	private String poststed;
	@XmlElement(name = "postnummer", required = true)
	private int postnummer;
	
	
	public String getPoststed() {
		return poststed;
	}
	public void setPoststed(String poststed) {
		this.poststed = poststed;
	}
	public int getPostnummer() {
		return postnummer;
	}
	public void setPostnummer(int postnummer) {
		this.postnummer = postnummer;
	}
	@XmlElement(name = "adresseType", required = true)
	private AdresseType adresseType;
	
	
	public AdresseType getAdresseType() {
		return adresseType;
	}
	public void setAdresseType(AdresseType adresseType) {
		this.adresseType = adresseType;
	}
	public String getAdresse1() {
		return adresse1;
	}
	public void setAdresse1(String adresse1) {
		this.adresse1 = adresse1;
	}
	public String getAdresse2() {
		return adresse2;
	}
	public void setAdresse2(String adresse2) {
		this.adresse2 = adresse2;
	}
	public String getAdresse3() {
		return adresse3;
	}
	public void setAdresse3(String adresse3) {
		this.adresse3 = adresse3;
	}

}
