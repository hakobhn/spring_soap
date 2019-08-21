
package de.gema.esb.schema.partnerinteract.activitycontactmgmt.partnerinteraction_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for documentReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documentReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="archivingTypeCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="documentTypeCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="contentReference"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;base64Binary"&gt;
 *                 &lt;attribute ref="{http://www.w3.org/2005/05/xmlmime}contentType"/&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
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
@XmlType(name = "documentReferenceType", propOrder = {
    "archivingTypeCode",
    "documentTypeCode",
    "contentReference"
})
public class DocumentReferenceType {

    protected String archivingTypeCode;
    protected String documentTypeCode;
    @XmlElement(required = true)
    protected DocumentReferenceType.ContentReference contentReference;

    /**
     * Gets the value of the archivingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchivingTypeCode() {
        return archivingTypeCode;
    }

    /**
     * Sets the value of the archivingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchivingTypeCode(String value) {
        this.archivingTypeCode = value;
    }

    /**
     * Gets the value of the documentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTypeCode() {
        return documentTypeCode;
    }

    /**
     * Sets the value of the documentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTypeCode(String value) {
        this.documentTypeCode = value;
    }

    /**
     * Gets the value of the contentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType.ContentReference }
     *     
     */
    public DocumentReferenceType.ContentReference getContentReference() {
        return contentReference;
    }

    /**
     * Sets the value of the contentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType.ContentReference }
     *     
     */
    public void setContentReference(DocumentReferenceType.ContentReference value) {
        this.contentReference = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;base64Binary"&gt;
     *       &lt;attribute ref="{http://www.w3.org/2005/05/xmlmime}contentType"/&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ContentReference {

        @XmlValue
        protected byte[] value;
        @XmlAttribute(name = "contentType", namespace = "http://www.w3.org/2005/05/xmlmime")
        protected String contentType;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setValue(byte[] value) {
            this.value = value;
        }

        /**
         * Gets the value of the contentType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContentType() {
            return contentType;
        }

        /**
         * Sets the value of the contentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContentType(String value) {
            this.contentType = value;
        }

    }

}
