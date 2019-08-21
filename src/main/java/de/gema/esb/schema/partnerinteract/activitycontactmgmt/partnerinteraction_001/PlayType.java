
package de.gema.esb.schema.partnerinteract.activitycontactmgmt.partnerinteraction_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PlayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlayType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documentLink" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="eventDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="eventTimeBegin" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="eventTimeEnd" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="musicTypeCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="locationTypeCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="inspectionStampDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="eventRoom" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="eventLocation" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="bandName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="status" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="licenseId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="licenseLineId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
 *               &lt;totalDigits value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlayType", propOrder = {
    "documentLink",
    "eventDate",
    "eventTimeBegin",
    "eventTimeEnd",
    "musicTypeCode",
    "locationTypeCode",
    "inspectionStampDescription",
    "eventRoom",
    "eventLocation",
    "bandName",
    "status",
    "documentDate",
    "licenseId",
    "licenseLineId"
})
public class PlayType {

    protected String documentLink;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar eventTimeBegin;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar eventTimeEnd;
    protected String musicTypeCode;
    protected String locationTypeCode;
    protected String inspectionStampDescription;
    protected String eventRoom;
    protected String eventLocation;
    protected String bandName;
    protected String status;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar documentDate;
    protected String licenseId;
    protected Long licenseLineId;

    /**
     * Gets the value of the documentLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentLink() {
        return documentLink;
    }

    /**
     * Sets the value of the documentLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentLink(String value) {
        this.documentLink = value;
    }

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the eventTimeBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTimeBegin() {
        return eventTimeBegin;
    }

    /**
     * Sets the value of the eventTimeBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventTimeBegin(XMLGregorianCalendar value) {
        this.eventTimeBegin = value;
    }

    /**
     * Gets the value of the eventTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTimeEnd() {
        return eventTimeEnd;
    }

    /**
     * Sets the value of the eventTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventTimeEnd(XMLGregorianCalendar value) {
        this.eventTimeEnd = value;
    }

    /**
     * Gets the value of the musicTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMusicTypeCode() {
        return musicTypeCode;
    }

    /**
     * Sets the value of the musicTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMusicTypeCode(String value) {
        this.musicTypeCode = value;
    }

    /**
     * Gets the value of the locationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationTypeCode() {
        return locationTypeCode;
    }

    /**
     * Sets the value of the locationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationTypeCode(String value) {
        this.locationTypeCode = value;
    }

    /**
     * Gets the value of the inspectionStampDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInspectionStampDescription() {
        return inspectionStampDescription;
    }

    /**
     * Sets the value of the inspectionStampDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInspectionStampDescription(String value) {
        this.inspectionStampDescription = value;
    }

    /**
     * Gets the value of the eventRoom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventRoom() {
        return eventRoom;
    }

    /**
     * Sets the value of the eventRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventRoom(String value) {
        this.eventRoom = value;
    }

    /**
     * Gets the value of the eventLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventLocation() {
        return eventLocation;
    }

    /**
     * Sets the value of the eventLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventLocation(String value) {
        this.eventLocation = value;
    }

    /**
     * Gets the value of the bandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandName() {
        return bandName;
    }

    /**
     * Sets the value of the bandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandName(String value) {
        this.bandName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the documentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDate() {
        return documentDate;
    }

    /**
     * Sets the value of the documentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDate(XMLGregorianCalendar value) {
        this.documentDate = value;
    }

    /**
     * Gets the value of the licenseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseId() {
        return licenseId;
    }

    /**
     * Sets the value of the licenseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseId(String value) {
        this.licenseId = value;
    }

    /**
     * Gets the value of the licenseLineId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLicenseLineId() {
        return licenseLineId;
    }

    /**
     * Sets the value of the licenseLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLicenseLineId(Long value) {
        this.licenseLineId = value;
    }

}
