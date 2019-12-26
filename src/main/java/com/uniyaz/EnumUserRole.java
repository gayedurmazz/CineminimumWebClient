
package com.uniyaz;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumUserRole.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumUserRole"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADMIN"/&gt;
 *     &lt;enumeration value="USER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumUserRole")
@XmlEnum
public enum EnumUserRole {

    ADMIN,
    USER;

    public String value() {
        return name();
    }

    public static EnumUserRole fromValue(String v) {
        return valueOf(v);
    }

}
