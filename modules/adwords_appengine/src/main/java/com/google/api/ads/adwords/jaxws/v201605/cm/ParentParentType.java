
package com.google.api.ads.adwords.jaxws.v201605.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Parent.ParentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Parent.ParentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PARENT_PARENT"/>
 *     &lt;enumeration value="PARENT_NOT_A_PARENT"/>
 *     &lt;enumeration value="PARENT_UNDETERMINED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Parent.ParentType")
@XmlEnum
public enum ParentParentType {

    PARENT_PARENT,
    PARENT_NOT_A_PARENT,
    PARENT_UNDETERMINED,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ParentParentType fromValue(String v) {
        return valueOf(v);
    }

}
