
package de.gema.esb.schema.partnerinteract.activitycontactmgmt.partnerinteraction_001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Z_SST_046_WRAPPER_TASK_ARCHIVE
 * 
 * <p>Java class for CRMTaskRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMTaskRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partnerId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="categoryId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="categoryTypeCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="languageCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.gema.de/ESB/Schema/Common/BaseTypes-001}LanguageCodeType"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="playList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="play" type="{http://www.gema.de/ESB/Schema/PartnerInteract/ActivityContactMgmt/PartnerInteraction-001}PlayType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="licenseList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="license" type="{http://www.gema.de/ESB/Schema/PartnerInteract/ActivityContactMgmt/PartnerInteraction-001}licenseType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="masterDataList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="masterData" type="{http://www.gema.de/ESB/Schema/PartnerInteract/ActivityContactMgmt/PartnerInteraction-001}masterDataType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="statusCompletedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="documentExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="documentId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="bundleId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="documentList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="document" type="{http://www.gema.de/ESB/Schema/PartnerInteract/ActivityContactMgmt/PartnerInteraction-001}documentType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "CRMTaskRequestType", propOrder = {
    "partnerId",
    "categoryId",
    "categoryTypeCode",
    "channel",
    "description",
    "languageCode",
    "playList",
    "licenseList",
    "masterDataList",
    "statusCompletedFlag",
    "documentExpiryDate",
    "documentId",
    "bundleId",
    "documentList"
})
public class CRMTaskRequestType {

    @XmlElement(required = true)
    protected String partnerId;
    protected String categoryId;
    protected String categoryTypeCode;
    protected String channel;
    protected String description;
    @XmlElement(required = true)
    protected String languageCode;
    protected CRMTaskRequestType.PlayList playList;
    protected CRMTaskRequestType.LicenseList licenseList;
    protected CRMTaskRequestType.MasterDataList masterDataList;
    protected Boolean statusCompletedFlag;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar documentExpiryDate;
    protected String documentId;
    protected String bundleId;
    protected CRMTaskRequestType.DocumentList documentList;

    /**
     * Gets the value of the partnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * Sets the value of the partnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerId(String value) {
        this.partnerId = value;
    }

    /**
     * Gets the value of the categoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the value of the categoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryId(String value) {
        this.categoryId = value;
    }

    /**
     * Gets the value of the categoryTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryTypeCode() {
        return categoryTypeCode;
    }

    /**
     * Sets the value of the categoryTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryTypeCode(String value) {
        this.categoryTypeCode = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the playList property.
     * 
     * @return
     *     possible object is
     *     {@link CRMTaskRequestType.PlayList }
     *     
     */
    public CRMTaskRequestType.PlayList getPlayList() {
        return playList;
    }

    /**
     * Sets the value of the playList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMTaskRequestType.PlayList }
     *     
     */
    public void setPlayList(CRMTaskRequestType.PlayList value) {
        this.playList = value;
    }

    /**
     * Gets the value of the licenseList property.
     * 
     * @return
     *     possible object is
     *     {@link CRMTaskRequestType.LicenseList }
     *     
     */
    public CRMTaskRequestType.LicenseList getLicenseList() {
        return licenseList;
    }

    /**
     * Sets the value of the licenseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMTaskRequestType.LicenseList }
     *     
     */
    public void setLicenseList(CRMTaskRequestType.LicenseList value) {
        this.licenseList = value;
    }

    /**
     * Gets the value of the masterDataList property.
     * 
     * @return
     *     possible object is
     *     {@link CRMTaskRequestType.MasterDataList }
     *     
     */
    public CRMTaskRequestType.MasterDataList getMasterDataList() {
        return masterDataList;
    }

    /**
     * Sets the value of the masterDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMTaskRequestType.MasterDataList }
     *     
     */
    public void setMasterDataList(CRMTaskRequestType.MasterDataList value) {
        this.masterDataList = value;
    }

    /**
     * Gets the value of the statusCompletedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusCompletedFlag() {
        return statusCompletedFlag;
    }

    /**
     * Sets the value of the statusCompletedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusCompletedFlag(Boolean value) {
        this.statusCompletedFlag = value;
    }

    /**
     * Gets the value of the documentExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentExpiryDate() {
        return documentExpiryDate;
    }

    /**
     * Sets the value of the documentExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentExpiryDate(XMLGregorianCalendar value) {
        this.documentExpiryDate = value;
    }

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the bundleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleId() {
        return bundleId;
    }

    /**
     * Sets the value of the bundleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleId(String value) {
        this.bundleId = value;
    }

    /**
     * Gets the value of the documentList property.
     * 
     * @return
     *     possible object is
     *     {@link CRMTaskRequestType.DocumentList }
     *     
     */
    public CRMTaskRequestType.DocumentList getDocumentList() {
        return documentList;
    }

    /**
     * Sets the value of the documentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMTaskRequestType.DocumentList }
     *     
     */
    public void setDocumentList(CRMTaskRequestType.DocumentList value) {
        this.documentList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="document" type="{http://www.gema.de/ESB/Schema/PartnerInteract/ActivityContactMgmt/PartnerInteraction-001}documentType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "document"
    })
    public static class DocumentList {

        @XmlElement(required = true)
        protected List<DocumentType> document;

        /**
         * Gets the value of the document property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the document property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentType }
         * 
         * 
         */
        public List<DocumentType> getDocument() {
            if (document == null) {
                document = new ArrayList<DocumentType>();
            }
            return this.document;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="license" type="{http://www.gema.de/ESB/Schema/PartnerInteract/ActivityContactMgmt/PartnerInteraction-001}licenseType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "license"
    })
    public static class LicenseList {

        @XmlElement(required = true)
        protected List<LicenseType> license;

        /**
         * Gets the value of the license property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the license property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLicense().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LicenseType }
         * 
         * 
         */
        public List<LicenseType> getLicense() {
            if (license == null) {
                license = new ArrayList<LicenseType>();
            }
            return this.license;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="masterData" type="{http://www.gema.de/ESB/Schema/PartnerInteract/ActivityContactMgmt/PartnerInteraction-001}masterDataType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "masterData"
    })
    public static class MasterDataList {

        @XmlElement(required = true)
        protected List<MasterDataType> masterData;

        /**
         * Gets the value of the masterData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the masterData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMasterData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MasterDataType }
         * 
         * 
         */
        public List<MasterDataType> getMasterData() {
            if (masterData == null) {
                masterData = new ArrayList<MasterDataType>();
            }
            return this.masterData;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="play" type="{http://www.gema.de/ESB/Schema/PartnerInteract/ActivityContactMgmt/PartnerInteraction-001}PlayType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "play"
    })
    public static class PlayList {

        @XmlElement(required = true)
        protected List<PlayType> play;

        /**
         * Gets the value of the play property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the play property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlay().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PlayType }
         * 
         * 
         */
        public List<PlayType> getPlay() {
            if (play == null) {
                play = new ArrayList<PlayType>();
            }
            return this.play;
        }

    }

}
