
package de.gema.esb.schema.common.basetypes_001;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Standard ErrorDetails element, which is derviced by all other ESB Exceptions
 * 
 * <p>Java class for ErrorDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errorCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.gema.de/ESB/Schema/Common/BaseTypes-001}ErrorCodeType"&gt;
 *               &lt;pattern value="[A-Z]{3}\d{6}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="errorType" type="{http://www.gema.de/ESB/Schema/Common/BaseTypes-001}ErrorTypeType"/&gt;
 *         &lt;element name="errorSystem" type="{http://www.gema.de/ESB/Schema/Common/BaseTypes-001}ErrorSystemType"/&gt;
 *         &lt;element name="errorMessage" type="{http://www.gema.de/ESB/Schema/Common/BaseTypes-001}ErrorMessageType"/&gt;
 *         &lt;element name="errorInformation" type="{http://www.gema.de/ESB/Schema/Common/BaseTypes-001}ErrorInformationType"/&gt;
 *         &lt;element name="errorApplication" type="{http://www.gema.de/ESB/Schema/Common/BaseTypes-001}ErrorApplicationType"/&gt;
 *         &lt;element name="errorTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="errorSubsystem" type="{http://www.gema.de/ESB/Schema/Common/BaseTypes-001}ErrorSubsystemType"/&gt;
 *         &lt;element name="errorClass" type="{http://www.gema.de/ESB/Schema/Common/PrimitiveBaseTypes-001}StringMax2000" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorDetailsType", propOrder = {
    "errorCode",
    "errorType",
    "errorSystem",
    "errorMessage",
    "errorInformation",
    "errorApplication",
    "errorTimestamp",
    "errorSubsystem",
    "errorClass"
})
public class ErrorDetailsType {

    @XmlElement(required = true)
    protected String errorCode;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected ErrorTypeType errorType;
    @XmlElement(required = true, nillable = true)
    protected String errorSystem;
    @XmlElement(required = true)
    protected String errorMessage;
    @XmlElement(required = true, nillable = true)
    protected String errorInformation;
    @XmlElement(required = true, nillable = true)
    protected String errorApplication;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar errorTimestamp;
    @XmlElement(required = true, nillable = true)
    protected String errorSubsystem;
    @XmlElementRef(name = "errorClass", namespace = "http://www.gema.de/ESB/Schema/Common/BaseTypes-001", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorClass;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorType property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorTypeType }
     *     
     */
    public ErrorTypeType getErrorType() {
        return errorType;
    }

    /**
     * Sets the value of the errorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorTypeType }
     *     
     */
    public void setErrorType(ErrorTypeType value) {
        this.errorType = value;
    }

    /**
     * Gets the value of the errorSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSystem() {
        return errorSystem;
    }

    /**
     * Sets the value of the errorSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSystem(String value) {
        this.errorSystem = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the errorInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorInformation() {
        return errorInformation;
    }

    /**
     * Sets the value of the errorInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorInformation(String value) {
        this.errorInformation = value;
    }

    /**
     * Gets the value of the errorApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorApplication() {
        return errorApplication;
    }

    /**
     * Sets the value of the errorApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorApplication(String value) {
        this.errorApplication = value;
    }

    /**
     * Gets the value of the errorTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getErrorTimestamp() {
        return errorTimestamp;
    }

    /**
     * Sets the value of the errorTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setErrorTimestamp(XMLGregorianCalendar value) {
        this.errorTimestamp = value;
    }

    /**
     * Gets the value of the errorSubsystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSubsystem() {
        return errorSubsystem;
    }

    /**
     * Sets the value of the errorSubsystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSubsystem(String value) {
        this.errorSubsystem = value;
    }

    /**
     * Gets the value of the errorClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorClass() {
        return errorClass;
    }

    /**
     * Sets the value of the errorClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorClass(JAXBElement<String> value) {
        this.errorClass = value;
    }

}
