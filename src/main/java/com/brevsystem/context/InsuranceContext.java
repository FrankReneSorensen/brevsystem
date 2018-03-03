package com.brevsystem.context;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType (name = "InsuranceContext")
public class InsuranceContext implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@XmlElement(name = "userId")
	private String userId;
	@XmlElement(name = "correlationId")
	private String correlationId;
	@XmlElement(name = "applicationId")
	private String applicationId;
	
	public final static String CORRELATIONID_TAG_NAME = "correlationId";
	public final static String USERID_TAG_NAME = "userId";
	public final static String APPLICATIONID_TAG_NAME = "applicationId";

	public InsuranceContext() {}
	
	public InsuranceContext(String applicationId, String correlationId, String userId) {
		this.applicationId = applicationId;
		this.correlationId = correlationId;
		this.userId = userId;
	}
	
	public InsuranceContext(InsuranceContext original) {
		this.applicationId = original.applicationId;
		this.correlationId = original.correlationId;
		this.userId = original.userId;
	}
	
	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return new StringBuilder()
		.append("[userId=").append(userId).append("]")
		.append("[correlationId=").append(correlationId).append("]")
		.append("[applicationId=").append(applicationId).append("]").toString();
	}

	
	
}


