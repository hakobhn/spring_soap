
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
 * <p>Java class for incomingPostType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="incomingPostType"&gt;
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
 *         &lt;element name="documentId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="categoryCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="subCategoryCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="scanDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="channelCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="ZP1"/&gt;
 *               &lt;enumeration value="ZP2"/&gt;
 *               &lt;enumeration value="ZP3"/&gt;
 *               &lt;enumeration value="ZP4"/&gt;
 *               &lt;enumeration value="ZPE"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="bundleId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="languageCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.gema.de/ESB/Schema/Common/BaseTypes-001}LanguageCodeType"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="instruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="formular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="archiveFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usablePlayListFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="nonUsablePlayListReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deadlineFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="financialRelevanceFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="documentReferenceList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="documentReference" type="{http://www.gema.de/ESB/Schema/PartnerInteract/ActivityContactMgmt/PartnerInteraction-001}documentReferenceType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "incomingPostType", propOrder = {
    "partnerId",
    "documentId",
    "categoryCode",
    "subCategoryCode",
    "documentDate",
    "scanDate",
    "channelCode",
    "bundleId",
    "languageCode",
    "instruction",
    "formular",
    "archiveFlag",
    "subject",
    "bandName",
    "usablePlayListFlag",
    "nonUsablePlayListReason",
    "deadlineFlag",
    "financialRelevanceFlag",
    "email",
    "documentReferenceList"
})
public class IncomingPostType {

    @XmlElement(required = true)
    protected String partnerId;
    @XmlElement(required = true)
    protected String documentId;
    @XmlElement(required = true)
    protected String categoryCode;
    protected String subCategoryCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar documentDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scanDate;
    @XmlElement(required = true)
    protected String channelCode;
    @XmlElement(required = true)
    protected String bundleId;
    @XmlElement(required = true)
    protected String languageCode;
    protected String instruction;
    protected String formular;
    protected Boolean archiveFlag;
    protected String subject;
    protected String bandName;
    protected Boolean usablePlayListFlag;
    protected String nonUsablePlayListReason;
    protected Boolean deadlineFlag;
    protected Boolean financialRelevanceFlag;
    protected String email;
    protected IncomingPostType.DocumentReferenceList documentReferenceList;

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
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryCode(String value) {
        this.categoryCode = value;
    }

    /**
     * Gets the value of the subCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCategoryCode() {
        return subCategoryCode;
    }

    /**
     * Sets the value of the subCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCategoryCode(String value) {
        this.subCategoryCode = value;
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
     * Gets the value of the scanDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScanDate() {
        return scanDate;
    }

    /**
     * Sets the value of the scanDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScanDate(XMLGregorianCalendar value) {
        this.scanDate = value;
    }

    /**
     * Gets the value of the channelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * Sets the value of the channelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelCode(String value) {
        this.channelCode = value;
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
     * Gets the value of the instruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstruction() {
        return instruction;
    }

    /**
     * Sets the value of the instruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstruction(String value) {
        this.instruction = value;
    }

    /**
     * Gets the value of the formular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormular() {
        return formular;
    }

    /**
     * Sets the value of the formular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormular(String value) {
        this.formular = value;
    }

    /**
     * Gets the value of the archiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArchiveFlag() {
        return archiveFlag;
    }

    /**
     * Sets the value of the archiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArchiveFlag(Boolean value) {
        this.archiveFlag = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
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
     * Gets the value of the usablePlayListFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsablePlayListFlag() {
        return usablePlayListFlag;
    }

    /**
     * Sets the value of the usablePlayListFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsablePlayListFlag(Boolean value) {
        this.usablePlayListFlag = value;
    }

    /**
     * Gets the value of the nonUsablePlayListReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonUsablePlayListReason() {
        return nonUsablePlayListReason;
    }

    /**
     * Sets the value of the nonUsablePlayListReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonUsablePlayListReason(String value) {
        this.nonUsablePlayListReason = value;
    }

    /**
     * Gets the value of the deadlineFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeadlineFlag() {
        return deadlineFlag;
    }

    /**
     * Sets the value of the deadlineFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeadlineFlag(Boolean value) {
        this.deadlineFlag = value;
    }

    /**
     * Gets the value of the financialRelevanceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinancialRelevanceFlag() {
        return financialRelevanceFlag;
    }

    /**
     * Sets the value of the financialRelevanceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinancialRelevanceFlag(Boolean value) {
        this.financialRelevanceFlag = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the documentReferenceList property.
     * 
     * @return
     *     possible object is
     *     {@link IncomingPostType.DocumentReferenceList }
     *     
     */
    public IncomingPostType.DocumentReferenceList getDocumentReferenceList() {
        return documentReferenceList;
    }

    /**
     * Sets the value of the documentReferenceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomingPostType.DocumentReferenceList }
     *     
     */
    public void setDocumentReferenceList(IncomingPostType.DocumentReferenceList value) {
        this.documentReferenceList = value;
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
     *         &lt;element name="documentReference" type="{http://www.gema.de/ESB/Schema/PartnerInteract/ActivityContactMgmt/PartnerInteraction-001}documentReferenceType" maxOccurs="unbounded"/&gt;
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
        "documentReference"
    })
    public static class DocumentReferenceList {

        @XmlElement(required = true)
        protected List<DocumentReferenceType> documentReference;

        /**
         * Gets the value of the documentReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentReferenceType }
         * 
         * 
         */
        public List<DocumentReferenceType> getDocumentReference() {
            if (documentReference == null) {
                documentReference = new ArrayList<DocumentReferenceType>();
            }
            return this.documentReference;
        }

    }

}
