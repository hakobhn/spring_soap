
package de.gema.esb.schema.common.basetypes_001;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The ControlObject contains elments which controls the implementaion of an interfaces, like the backen.d timeout
 * 
 * <p>Java class for ControllObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControllObjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeOut_s" type="{http://www.gema.de/ESB/Schema/Common/PrimitiveBaseTypes-001}IntMax8" minOccurs="0"/&gt;
 *         &lt;element name="transactionId" type="{http://www.gema.de/ESB/Schema/Common/PrimitiveBaseTypes-001}StringMax80" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControllObjectType", propOrder = {
    "timeOutS",
    "transactionId"
})
public class ControllObjectType {

    @XmlElement(name = "timeOut_s")
    protected BigInteger timeOutS;
    protected String transactionId;

    /**
     * Gets the value of the timeOutS property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeOutS() {
        return timeOutS;
    }

    /**
     * Sets the value of the timeOutS property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeOutS(BigInteger value) {
        this.timeOutS = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

}
