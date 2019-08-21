package de.gema.esb.service.partnerinteract.activitycontactmgmt.partnerinteractionabstract_001_wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2019-08-21T09:15:12.198+04:00
 * Generated source version: 3.3.2
 *
 */
@WebService(targetNamespace = "http://www.gema.de/ESB/Service/PartnerInteract/ActivityContactMgmt/PartnerInteractionAbstract-001.wsdl", name = "PartnerInteractionPortType")
@XmlSeeAlso({de.gema.esb.schema.partnerinteract.activitycontactmgmt.partnerinteraction_001.ObjectFactory.class, de.gema.esb.schema.common.basetypes_001.ObjectFactory.class, de.gema.esb.service.partnerinteract.activitycontactmgmt.partnerinteraction_001.ObjectFactory.class, org.w3._2005._05.xmlmime.ObjectFactory.class, de.gema.esb.schema.common.primitivebasetypes_001.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface PartnerInteractionPortType {

    @WebMethod(action = "/PartnerInteraction-001/createCRMTask")
    @WebResult(name = "createCRMTaskResponse", targetNamespace = "http://www.gema.de/ESB/Service/PartnerInteract/ActivityContactMgmt/PartnerInteraction-001", partName = "createCRMTaskResponse")
    public de.gema.esb.schema.partnerinteract.activitycontactmgmt.partnerinteraction_001.CRMTaskResponseType createCRMTask(

        @WebParam(partName = "createCRMTaskRequest", name = "createCRMTaskRequest", targetNamespace = "http://www.gema.de/ESB/Service/PartnerInteract/ActivityContactMgmt/PartnerInteraction-001")
        de.gema.esb.schema.partnerinteract.activitycontactmgmt.partnerinteraction_001.CRMTaskRequestType createCRMTaskRequest
    ) throws de.gema.esb.service.base.baseabstract_001_wsdl.ValidationESBException, de.gema.esb.service.base.baseabstract_001_wsdl.BusinessESBException, de.gema.esb.service.base.baseabstract_001_wsdl.SystemESBException;

    @WebMethod(action = "/PartnerInteraction-001/createIncomingPost")
    @WebResult(name = "createIncomingPostResponse", targetNamespace = "http://www.gema.de/ESB/Service/PartnerInteract/ActivityContactMgmt/PartnerInteraction-001", partName = "createIncomingPostResponse")
    public de.gema.esb.schema.partnerinteract.activitycontactmgmt.partnerinteraction_001.IncomingPostResponseType createIncomingPost(

        @WebParam(partName = "createIncomingPostRequest", name = "createIncomingPostRequest", targetNamespace = "http://www.gema.de/ESB/Service/PartnerInteract/ActivityContactMgmt/PartnerInteraction-001")
        de.gema.esb.schema.partnerinteract.activitycontactmgmt.partnerinteraction_001.IncomingPostType createIncomingPostRequest
    ) throws de.gema.esb.service.base.baseabstract_001_wsdl.ValidationESBException, de.gema.esb.service.base.baseabstract_001_wsdl.BusinessESBException, de.gema.esb.service.base.baseabstract_001_wsdl.SystemESBException;
}
