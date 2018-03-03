package com.brevsystem;

import static org.junit.Assert.assertEquals;

import java.util.UUID;

import org.apache.log4j.Logger;
import org.junit.Test;

public class BrevsystemServiceImplTest {
	
	static final Logger logger = Logger.getLogger(BrevsystemServiceImplTest.class);
	
	@Test
	public void testsendAvtale() {
		BrevsystemServiceImpl brevsystemServiceImpl = new BrevsystemServiceImpl();
		
		logger.info("------------------------------");
		
		SendAvtaleTilKundeRequest sendAvtaleTilKundeRequest = new SendAvtaleTilKundeRequest();
		sendAvtaleTilKundeRequest.setKilde("WEB");
		
		Avtale avtale = new Avtale();
		String uniqueID = UUID.randomUUID().toString();
		avtale.setAvtaleId(uniqueID);
		avtale.setAvtaleNavn("Bilforsikring");
		
		Person person = new Person();
		person.setEtternavn("Larsen");
		person.setFornavn("Lars");
		person.setFnr("12345678909");
		Adresse adresse = new Adresse();
		adresse.setAdresse1("adresseveien 1");
		adresse.setAdresse2("borettslaget 2");
		adresse.setAdresse3("bydel 3");
		adresse.setAdresseType(AdresseType.FOLKEREGISTRERTADRESSE);
		
		sendAvtaleTilKundeRequest.setAvtale(avtale);
		sendAvtaleTilKundeRequest.setPerson(person);
		//sendAvtaleTilKundeRequest.setAdresse(adresse);
		
		SendAvtaleTilKundeResponse sendAvtaleTilKundeResponse = brevsystemServiceImpl.sendAvtale(sendAvtaleTilKundeRequest);
		
		assertEquals(uniqueID, sendAvtaleTilKundeResponse.getAvtaleNummer());
	}
	

}
