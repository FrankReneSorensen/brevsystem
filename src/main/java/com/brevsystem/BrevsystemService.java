package com.brevsystem;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface BrevsystemService {

	@WebMethod
	public SendAvtaleTilKundeResponse sendAvtale(SendAvtaleTilKundeRequest sendAvtaleTilKundeRequest);
	
}
