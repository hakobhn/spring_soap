
package de.gema.esb.service.base.baseabstract_001_wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.2
 * 2019-08-21T09:15:12.111+04:00
 * Generated source version: 3.3.2
 */

@WebFault(name = "validationException", targetNamespace = "http://www.gema.de/ESB/Schema/Common/BaseTypes-001")
public class ValidationESBException extends Exception {

    private de.gema.esb.schema.common.basetypes_001.ValidationExceptionType validationException;

    public ValidationESBException() {
        super();
    }

    public ValidationESBException(String message) {
        super(message);
    }

    public ValidationESBException(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ValidationESBException(String message, de.gema.esb.schema.common.basetypes_001.ValidationExceptionType validationException) {
        super(message);
        this.validationException = validationException;
    }

    public ValidationESBException(String message, de.gema.esb.schema.common.basetypes_001.ValidationExceptionType validationException, java.lang.Throwable cause) {
        super(message, cause);
        this.validationException = validationException;
    }

    public de.gema.esb.schema.common.basetypes_001.ValidationExceptionType getFaultInfo() {
        return this.validationException;
    }
}