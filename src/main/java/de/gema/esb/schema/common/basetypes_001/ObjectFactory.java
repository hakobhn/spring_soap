
package de.gema.esb.schema.common.basetypes_001;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.gema.esb.schema.common.basetypes_001 package. 
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

    private final static QName _TraceIdentifier_QNAME = new QName("http://www.gema.de/ESB/Schema/Common/BaseTypes-001", "traceIdentifier");
    private final static QName _ControllObject_QNAME = new QName("http://www.gema.de/ESB/Schema/Common/BaseTypes-001", "controllObject");
    private final static QName _ErrorDetails_QNAME = new QName("http://www.gema.de/ESB/Schema/Common/BaseTypes-001", "errorDetails");
    private final static QName _SystemException_QNAME = new QName("http://www.gema.de/ESB/Schema/Common/BaseTypes-001", "systemException");
    private final static QName _BusinessException_QNAME = new QName("http://www.gema.de/ESB/Schema/Common/BaseTypes-001", "businessException");
    private final static QName _ValidationException_QNAME = new QName("http://www.gema.de/ESB/Schema/Common/BaseTypes-001", "validationException");
    private final static QName _ResultDetails_QNAME = new QName("http://www.gema.de/ESB/Schema/Common/BaseTypes-001", "resultDetails");
    private final static QName _ErrorDetailsTypeErrorClass_QNAME = new QName("http://www.gema.de/ESB/Schema/Common/BaseTypes-001", "errorClass");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.gema.esb.schema.common.basetypes_001
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TraceIdentifierType }
     * 
     */
    public TraceIdentifierType createTraceIdentifierType() {
        return new TraceIdentifierType();
    }

    /**
     * Create an instance of {@link ControllObjectType }
     * 
     */
    public ControllObjectType createControllObjectType() {
        return new ControllObjectType();
    }

    /**
     * Create an instance of {@link ErrorDetailsType }
     * 
     */
    public ErrorDetailsType createErrorDetailsType() {
        return new ErrorDetailsType();
    }

    /**
     * Create an instance of {@link SystemExceptionType }
     * 
     */
    public SystemExceptionType createSystemExceptionType() {
        return new SystemExceptionType();
    }

    /**
     * Create an instance of {@link BusinessExceptionType }
     * 
     */
    public BusinessExceptionType createBusinessExceptionType() {
        return new BusinessExceptionType();
    }

    /**
     * Create an instance of {@link ValidationExceptionType }
     * 
     */
    public ValidationExceptionType createValidationExceptionType() {
        return new ValidationExceptionType();
    }

    /**
     * Create an instance of {@link ResultDetailsType }
     * 
     */
    public ResultDetailsType createResultDetailsType() {
        return new ResultDetailsType();
    }

    /**
     * Create an instance of {@link BOIDType }
     * 
     */
    public BOIDType createBOIDType() {
        return new BOIDType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraceIdentifierType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraceIdentifierType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gema.de/ESB/Schema/Common/BaseTypes-001", name = "traceIdentifier")
    public JAXBElement<TraceIdentifierType> createTraceIdentifier(TraceIdentifierType value) {
        return new JAXBElement<TraceIdentifierType>(_TraceIdentifier_QNAME, TraceIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControllObjectType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ControllObjectType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gema.de/ESB/Schema/Common/BaseTypes-001", name = "controllObject")
    public JAXBElement<ControllObjectType> createControllObject(ControllObjectType value) {
        return new JAXBElement<ControllObjectType>(_ControllObject_QNAME, ControllObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErrorDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gema.de/ESB/Schema/Common/BaseTypes-001", name = "errorDetails")
    public JAXBElement<ErrorDetailsType> createErrorDetails(ErrorDetailsType value) {
        return new JAXBElement<ErrorDetailsType>(_ErrorDetails_QNAME, ErrorDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemExceptionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SystemExceptionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gema.de/ESB/Schema/Common/BaseTypes-001", name = "systemException")
    public JAXBElement<SystemExceptionType> createSystemException(SystemExceptionType value) {
        return new JAXBElement<SystemExceptionType>(_SystemException_QNAME, SystemExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessExceptionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BusinessExceptionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gema.de/ESB/Schema/Common/BaseTypes-001", name = "businessException")
    public JAXBElement<BusinessExceptionType> createBusinessException(BusinessExceptionType value) {
        return new JAXBElement<BusinessExceptionType>(_BusinessException_QNAME, BusinessExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationExceptionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidationExceptionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gema.de/ESB/Schema/Common/BaseTypes-001", name = "validationException")
    public JAXBElement<ValidationExceptionType> createValidationException(ValidationExceptionType value) {
        return new JAXBElement<ValidationExceptionType>(_ValidationException_QNAME, ValidationExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gema.de/ESB/Schema/Common/BaseTypes-001", name = "resultDetails")
    public JAXBElement<ResultDetailsType> createResultDetails(ResultDetailsType value) {
        return new JAXBElement<ResultDetailsType>(_ResultDetails_QNAME, ResultDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gema.de/ESB/Schema/Common/BaseTypes-001", name = "errorClass", scope = ErrorDetailsType.class)
    public JAXBElement<String> createErrorDetailsTypeErrorClass(String value) {
        return new JAXBElement<String>(_ErrorDetailsTypeErrorClass_QNAME, String.class, ErrorDetailsType.class, value);
    }

}
