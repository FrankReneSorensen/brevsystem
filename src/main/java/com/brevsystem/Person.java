package com.brevsystem;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person")
public class Person {
	
	
	@XmlElement(name = "fnr", required = true)
	private String fnr;
	@XmlElement(name = "fornavn", required = true)
	private String fornavn;
	@XmlElement(name = "etternavn", required = true)
	private String etternavn;
	@XmlElement(name = "mellomnavn")
	private String mellomnavn;
	
	public String getFnr() {
		return fnr;
	}
	public void setFnr(String fnr) {
		this.fnr = fnr;
	}
	public String getFornavn() {
		return fornavn;
	}
	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}
	public String getEtternavn() {
		return etternavn;
	}
	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}
	

}
