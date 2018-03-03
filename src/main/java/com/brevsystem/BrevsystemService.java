package com.brevsystem;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface BrevsystemService {

	@WebMethod(operationName="sendAvtale")
	public SendAvtaleTilKundeResponse sendAvtale(@WebParam(name="sendAvtaleTilKundeRequest") SendAvtaleTilKundeRequest sendAvtaleTilKundeRequest);
	
}
