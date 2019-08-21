
package de.gema.esb.schema.common.basetypes_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * System Exceptions are caused by the malfunction of the system.  This may include system software, hardware failures, network failures, failed access to a point application or resource.   These types of exceptions may require system support depending on its nature
 * 
 * <p>Java class for SystemExceptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemExceptionType"&gt;
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
@XmlType(name = "SystemExceptionType")
public class SystemExceptionType
    extends ESBException
{


}
