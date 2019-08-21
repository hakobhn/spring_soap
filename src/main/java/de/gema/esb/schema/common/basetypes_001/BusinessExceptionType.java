
package de.gema.esb.schema.common.basetypes_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Application/Business-level exceptions  results from the unsuccessful logical outcome of a request.  This may be due to the entity being in an invalid state Application/business-level exceptions require significantly more data to properly define the cause of the error
 * 
 * <p>Java class for BusinessExceptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessExceptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.gema.de/ESB/Schema/Common/BaseTypes-001}ESBException"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessExceptionType")
public class BusinessExceptionType
    extends ESBException
{


}
