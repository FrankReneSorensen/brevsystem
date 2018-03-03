package com.brevsystem.interceptor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.ws.soap.SOAPFaultException;

import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.log4j.Logger;
import org.w3c.dom.NodeList;

import com.brevsystem.context.InsuranceContext;

public class CrazySoapHandler implements SOAPHandler<SOAPMessageContext> {

	private static final Logger LOGGER = Logger.getLogger(CrazySoapHandler.class.getName());

	private final static String INSURANCECONTEXT_TAG_NAME = "InsuranceContext";
	private static final QName HEADER_ELEMENT_INSURANCE = new QName("http://brevsystem.com/", "InsuranceContext");

	public boolean handleMessage(final SOAPMessageContext context) {
		LOGGER.info("handleMessage.");
		final Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

		final SOAPMessage soapMessage = context.getMessage();
		if (Boolean.FALSE.equals(outboundProperty)) {

			//final SOAPMessage soapMessage = context.getMessage();
			try {

				soapMessage.getSOAPBody(); // The SOAP Body
				SOAPHeader header = soapMessage.getSOAPHeader(); // The SOAP Header
				
				SOAPFactory soapFactory = SOAPFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL);
				if (header == null) {
					LOGGER.error("No SOAP headers found in the SOAP request message");

				}
				if (header != null) {
					Iterator<?> children = header.getChildElements();
					while (children.hasNext()) {
						Object child = children.next();
						if (child instanceof SOAPElement) {
							SOAPElement soapElement = (SOAPElement) child;
							if (INSURANCECONTEXT_TAG_NAME
									.equalsIgnoreCase(soapElement.getElementName().getLocalName())) {

								NodeList userIdNode = header.getElementsByTagNameNS("*", "userId");
								String userId = userIdNode.item(0).getChildNodes().item(0).getNodeValue();
								NodeList correlationIdNode = header.getElementsByTagNameNS("*", "correlationId");
								String correlationId = correlationIdNode.item(0).getChildNodes().item(0).getNodeValue();
								NodeList applicationIdNode = header.getElementsByTagNameNS("*", "applicationId");
								String applicationId = applicationIdNode.item(0).getChildNodes().item(0).getNodeValue();
								LOGGER.info("userId: " + userId);
								LOGGER.info("correlationId: " + correlationId);
								LOGGER.info("applicationId: " + applicationId);

							}

						}
					}

				}

				soapMessage.getMimeHeaders();
			} catch (final SOAPException e) {
				throw new RuntimeException(e);
			}
		}
		//Outbound trafic. Add insurance context
		else {
			
			
			
			try {

	            SOAPEnvelope envelope = context.getMessage().getSOAPPart().getEnvelope();
	            SOAPHeader header = envelope.addHeader();

	            SOAPElement security =
	                    header.addChildElement("Security", "wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");



	            SOAPElement usernameToken =
	                    security.addChildElement("UsernameToken", "wsse");
	            usernameToken.addAttribute(new QName("xmlns:wsu"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");

	            SOAPElement username =
	                    usernameToken.addChildElement("Username", "wsse");
	            username.addTextNode("test");

	            SOAPElement password =
	                    usernameToken.addChildElement("Password", "wsse");
	            password.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
	           password.addTextNode("test321");

	            //Print out the outbound SOAP message to System.out
	           soapMessage.writeTo(System.out);
	            System.out.println("");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			
		}
		return true;
	}

	public boolean handleFault(final SOAPMessageContext context) {
		LOGGER.info("Logg feil");
		return false;
	}

	public void close(final SOAPMessageContext context) {
		LOGGER.info("Logg close");
	}

	public void close(final MessageContext context) {
	}

	public Set<QName> getHeaders() {
		return null;
	}

}
