
package de.gema.esb.service.partnerinteract.activitycontactmgmt.partnerinteraction_001;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import de.gema.esb.schema.partnerinteract.activitycontactmgmt.partnerinteraction_001.CRMTaskRequestType;
import de.gema.esb.schema.partnerinteract.activitycontactmgmt.partnerinteraction_001.CRMTaskResponseType;
import de.gema.esb.schema.partnerinteract.activitycontactmgmt.partnerinteraction_001.IncomingPostResponseType;
import de.gema.esb.schema.partnerinteract.activitycontactmgmt.partnerinteraction_001.IncomingPostType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.gema.esb.service.partnerinteract.activitycontactmgmt.partnerinteraction_001 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateIncomingPostRequest_QNAME = new QName("http://www.gema.de/ESB/Service/PartnerInteract/ActivityContactMgmt/PartnerInteraction-001", "createIncomingPostRequest");
    private final static QName _CreateIncomingPostResponse_QNAME = new QName("http://www.gema.de/ESB/Service/PartnerInteract/ActivityContactMgmt/PartnerInteraction-001", "createIncomingPostResponse");
    private final static QName _CreateCRMTaskRequest_QNAME = new QName("http://www.gema.de/ESB/Service/PartnerInteract/ActivityContactMgmt/PartnerInteraction-001", "createCRMTaskRequest");
    private final static QName _CreateCRMTaskResponse_QNAME = new QName("http://www.gema.de/ESB/Service/PartnerInteract/ActivityContactMgmt/PartnerInteraction-001", "createCRMTaskResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.gema.esb.service.partnerinteract.activitycontactmgmt.partnerinteraction_001
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncomingPostType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncomingPostType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gema.de/ESB/Service/PartnerInteract/ActivityContactMgmt/PartnerInteraction-001", name = "createIncomingPostRequest")
    public JAXBElement<IncomingPostType> createCreateIncomingPostRequest(IncomingPostType value) {
        return new JAXBElement<IncomingPostType>(_CreateIncomingPostRequest_QNAME, IncomingPostType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncomingPostResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncomingPostResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gema.de/ESB/Service/PartnerInteract/ActivityContactMgmt/PartnerInteraction-001", name = "createIncomingPostResponse")
    public JAXBElement<IncomingPostResponseType> createCreateIncomingPostResponse(IncomingPostResponseType value) {
        return new JAXBElement<IncomingPostResponseType>(_CreateIncomingPostResponse_QNAME, IncomingPostResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRMTaskRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CRMTaskRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gema.de/ESB/Service/PartnerInteract/ActivityContactMgmt/PartnerInteraction-001", name = "createCRMTaskRequest")
    public JAXBElement<CRMTaskRequestType> createCreateCRMTaskRequest(CRMTaskRequestType value) {
        return new JAXBElement<CRMTaskRequestType>(_CreateCRMTaskRequest_QNAME, CRMTaskRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRMTaskResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CRMTaskResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gema.de/ESB/Service/PartnerInteract/ActivityContactMgmt/PartnerInteraction-001", name = "createCRMTaskResponse")
    public JAXBElement<CRMTaskResponseType> createCreateCRMTaskResponse(CRMTaskResponseType value) {
        return new JAXBElement<CRMTaskResponseType>(_CreateCRMTaskResponse_QNAME, CRMTaskResponseType.class, null, value);
    }

}
