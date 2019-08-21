
package de.gema.esb.schema.common.basetypes_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Validation exceptions are caused by invalid data sent to or required by the service.  This results in a data validation exception.  It may be possible for the user to fix the data and restart their operation if the user was the source of the data.
 * 
 * <p>Java class for ValidationExceptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidationExceptionType"&gt;
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
@XmlType(name = "ValidationExceptionType")
public class ValidationExceptionType
    extends ESBException
{


}
