
package de.gema.esb.schema.common.primitivebasetypes_001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YesNo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="YesNo"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Y"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "YesNo", namespace = "http://www.gema.de/ESB/Schema/Common/PrimitiveBaseTypes-001")
@XmlEnum
public enum YesNo {


    /**
     * yes or true
     * 
     */
    Y,

    /**
     * no or false
     * 
     */
    N;

    public String value() {
        return name();
    }

    public static YesNo fromValue(String v) {
        return valueOf(v);
    }

}
