package org.insurancetest.brevsystem.brevsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.insurancetest.fagsystem.brevsystem.Brevsystem;
import org.insurancetest.fagsystem.brevsystem.SendAvtaleRequest;
import org.insurancetest.fagsystem.brevsystem.SendAvtaleResponse;
import org.insurancetest.fagsystem.brevsystem.GenericFault;
import org.insurancetest.fagsystem.brevsystem.SendAvtaleFault;

public class BrevsystemService implements Brevsystem {
	
	private static final Logger LOGGER =
		      LoggerFactory.getLogger(BrevsystemService.class);

	@Override
	public SendAvtaleResponse sendAvtale(SendAvtaleRequest sendAvtaleRequest)  {
		// TODO Auto-generated method stub
		return null;
	}

}
