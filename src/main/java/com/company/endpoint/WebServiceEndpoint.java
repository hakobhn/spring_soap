package com.company.endpoint;

import de.gema.esb.service.partnerinteract.activitycontactmgmt.partnerinteraction_001.ObjectFactory;
import de.gema.esb.schema.partnerinteract.activitycontactmgmt.partnerinteraction_001.IncomingPostResponseType;
import de.gema.esb.schema.partnerinteract.activitycontactmgmt.partnerinteraction_001.IncomingPostType;
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
	public JAXBElement<IncomingPostResponseType> identify(@RequestPayload IncomingPostType incomingPostType) {

//		String outputString = "Hello " + request.getBundleId() + "!";

		ObjectFactory factory = new ObjectFactory();
		IncomingPostResponseType responseType = new IncomingPostResponseType();
		JAXBElement<IncomingPostResponseType> response = factory.createCreateIncomingPostResponse( responseType);

		return response;
	}
}
