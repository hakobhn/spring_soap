
package de.gema.esb.service.base.baseabstract_001_wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.2
 * 2019-08-21T09:15:12.154+04:00
 * Generated source version: 3.3.2
 */

@WebFault(name = "businessException", targetNamespace = "http://www.gema.de/ESB/Schema/Common/BaseTypes-001")
public class BusinessESBException extends Exception {

    private de.gema.esb.schema.common.basetypes_001.BusinessExceptionType businessException;

    public BusinessESBException() {
        super();
    }

    public BusinessESBException(String message) {
        super(message);
    }

    public BusinessESBException(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public BusinessESBException(String message, de.gema.esb.schema.common.basetypes_001.BusinessExceptionType businessException) {
        super(message);
        this.businessException = businessException;
    }

    public BusinessESBException(String message, de.gema.esb.schema.common.basetypes_001.BusinessExceptionType businessException, java.lang.Throwable cause) {
        super(message, cause);
        this.businessException = businessException;
    }

    public de.gema.esb.schema.common.basetypes_001.BusinessExceptionType getFaultInfo() {
        return this.businessException;
    }
}
