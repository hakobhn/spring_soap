package com.company.endpoint;

import de.gema.esb.schema.common.basetypes_001.ControllObjectType;
import de.gema.esb.schema.common.basetypes_001.ObjectFactory;
import de.gema.esb.schema.partnerinteract.activitycontactmgmt.partnerinteraction_001.CRMTaskRequestType;
import de.gema.esb.schema.partnerinteract.activitycontactmgmt.partnerinteraction_001.CRMTaskResponseType;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.bind.JAXBElement;

@Endpoint
public class WebServiceEndpoint {

	private static final String NAMESPACE_URI = "http://www.example.org/UploadFile/mtom/service";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "inputSOATest")
	@ResponsePayload
	public JAXBElement<ControllObjectType> identify(@RequestPayload CRMTaskRequestType request) {

		String outputString = "Hello " + request.getBundleId() + "!";

		ObjectFactory factory = new ObjectFactory();
		JAXBElement<ControllObjectType> response = factory.createControllObject(new ControllObjectType());

		return response;
	}
}
