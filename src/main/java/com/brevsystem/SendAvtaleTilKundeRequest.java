package com.brevsystem;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SendAvtaleTilKundeRequest")
public class SendAvtaleTilKundeRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8615014312273833904L;
	
	Person person;
	Avtale avtale;
	String kilde;
	
}
