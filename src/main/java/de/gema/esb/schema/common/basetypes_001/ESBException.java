
package de.gema.esb.schema.common.basetypes_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Base ESB exceptinos. All other ESB exceptions has inheritf from this.
 * 
 * <p>Java class for ESBException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESBException"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errorDetails" type="{http://www.gema.de/ESB/Schema/Common/BaseTypes-001}ErrorDetailsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ESBException", propOrder = {
    "errorDetails"
})
@XmlSeeAlso({
    SystemExceptionType.class,
    BusinessExceptionType.class,
    ValidationExceptionType.class
})
public abstract class ESBException {

    @XmlElement(required = true)
    protected ErrorDetailsType errorDetails;

    /**
     * Gets the value of the errorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorDetailsType }
     *     
     */
    public ErrorDetailsType getErrorDetails() {
        return errorDetails;
    }

    /**
     * Sets the value of the errorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorDetailsType }
     *     
     */
    public void setErrorDetails(ErrorDetailsType value) {
        this.errorDetails = value;
    }

}
