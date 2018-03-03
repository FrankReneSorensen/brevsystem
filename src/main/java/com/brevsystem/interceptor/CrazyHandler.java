package com.brevsystem.interceptor;

import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;

import org.apache.log4j.Logger;

public class CrazyHandler implements LogicalHandler<LogicalMessageContext> {

	  private static final Logger LOG = Logger.getLogger(CrazyHandler.class.getName());

	  @Override
	  public boolean handleMessage(final LogicalMessageContext context) {
	    LOG.info("call came handleMessage");
	    return true;
	  }

	  @Override
	  public boolean handleFault(final LogicalMessageContext context) {
	    LOG.info("call came handleFault");
	    return false;
	  }

	  @Override
	  public void close(final MessageContext context) {
	    LOG.info("call came close");
	  }

	}
