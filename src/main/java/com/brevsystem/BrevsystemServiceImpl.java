package com.brevsystem;

import javax.jws.WebService;

import org.apache.log4j.Logger;

@WebService(endpointInterface = "com.brevsystem.BrevsystemService")
public class BrevsystemServiceImpl implements BrevsystemService{
	
	static final Logger logger = Logger.getLogger(BrevsystemServiceImpl.class);

	@Override
	public SendAvtaleTilKundeResponse sendAvtale(SendAvtaleTilKundeRequest sendAvtaleTilKundeRequest) {
		logger.info("Sender forsikringsavtale til kunde med fødselsnummer = "+sendAvtaleTilKundeRequest.getPerson().getFnr());
		
		//Her skulle det vært kall til SMTP server, etc.
		
		SendAvtaleTilKundeResponse sendAvtaleTilKundeResponse = new SendAvtaleTilKundeResponse();
		String avtaleId = sendAvtaleTilKundeRequest.avtale.getAvtaleId();
		sendAvtaleTilKundeResponse.setAvtaleNummer(avtaleId);
		
		sendAvtaleTilKundeResponse.setKommentar("Avtale er sendt til mottaker med fødselsnummer = "+sendAvtaleTilKundeRequest.getPerson().getFnr());
		
		return sendAvtaleTilKundeResponse;
	}
	

}
