package com.brevsystem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BrevsystemServiceImplTest {
	
	@Test
	public void testsendAvtale() {
		BrevsystemServiceImpl brevsystemServiceImpl = new BrevsystemServiceImpl();
		
		SendAvtaleTilKundeRequest sendAvtaleTilKundeRequest = new SendAvtaleTilKundeRequest();
		sendAvtaleTilKundeRequest.avtale.setAvtaleId("12345");
		sendAvtaleTilKundeRequest.avtale.setAvtaleNavn("Bilforsikring");
		sendAvtaleTilKundeRequest.avtale.setFnr("12345678909");
		sendAvtaleTilKundeRequest.setKilde("WEB");
		sendAvtaleTilKundeRequest.person.setEtternavn("Larsen");
		sendAvtaleTilKundeRequest.person.setFornavn("Lars");
		sendAvtaleTilKundeRequest.person.setFnr("12345678909");
		
		
		SendAvtaleTilKundeResponse sendAvtaleTilKundeResponse = brevsystemServiceImpl.sendAvtale(sendAvtaleTilKundeRequest);
		
		assertEquals("12345", sendAvtaleTilKundeResponse.getAvtaleNummer());
	}

}
