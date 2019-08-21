
package de.gema.esb.schema.common.basetypes_001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The TracedIdentifier is used to implemented a business procsess monitoring. A number of services rather its operations are involved in one business process. For this the same bpIp, bpName has to be used.
 * 
 * <p>Java class for TraceIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TraceIdentifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bpId" type="{http://www.gema.de/ESB/Schema/Common/BaseTypes-001}BPIDType"/&gt;
 *         &lt;element name="bpName" type="{http://www.gema.de/ESB/Schema/Common/BaseTypes-001}BPNameType"/&gt;
 *         &lt;element name="boId" type="{http://www.gema.de/ESB/Schema/Common/BaseTypes-001}BOIDType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="callingApp" type="{http://www.gema.de/ESB/Schema/Common/BaseTypes-001}CallingAppType"/&gt;
 *         &lt;element name="initiator" type="{http://www.gema.de/ESB/Schema/Common/BaseTypes-001}InitiatorType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TraceIdentifierType", propOrder = {
    "bpId",
    "bpName",
    "boId",
    "callingApp",
    "initiator"
})
public class TraceIdentifierType {

    @XmlElement(required = true)
    protected String bpId;
    @XmlElement(required = true)
    protected String bpName;
    @XmlElement(required = true)
    protected List<BOIDType> boId;
    @XmlElement(required = true)
    protected String callingApp;
    @XmlElement(required = true)
    protected String initiator;

    /**
     * Gets the value of the bpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpId() {
        return bpId;
    }

    /**
     * Sets the value of the bpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpId(String value) {
        this.bpId = value;
    }

    /**
     * Gets the value of the bpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpName() {
        return bpName;
    }

    /**
     * Sets the value of the bpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpName(String value) {
        this.bpName = value;
    }

    /**
     * Gets the value of the boId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOIDType }
     * 
     * 
     */
    public List<BOIDType> getBoId() {
        if (boId == null) {
            boId = new ArrayList<BOIDType>();
        }
        return this.boId;
    }

    /**
     * Gets the value of the callingApp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingApp() {
        return callingApp;
    }

    /**
     * Sets the value of the callingApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingApp(String value) {
        this.callingApp = value;
    }

    /**
     * Gets the value of the initiator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiator() {
        return initiator;
    }

    /**
     * Sets the value of the initiator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiator(String value) {
        this.initiator = value;
    }

}
