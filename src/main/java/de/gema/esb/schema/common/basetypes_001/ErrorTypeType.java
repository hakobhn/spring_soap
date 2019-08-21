
package de.gema.esb.schema.common.basetypes_001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Validation"/&gt;
 *     &lt;enumeration value="Business"/&gt;
 *     &lt;enumeration value="System"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ErrorTypeType")
@XmlEnum
public enum ErrorTypeType {

    @XmlEnumValue("Validation")
    VALIDATION("Validation"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("System")
    SYSTEM("System");
    private final String value;

    ErrorTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorTypeType fromValue(String v) {
        for (ErrorTypeType c: ErrorTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
