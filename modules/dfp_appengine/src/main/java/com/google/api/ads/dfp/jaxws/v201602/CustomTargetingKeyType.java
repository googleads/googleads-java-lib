
package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomTargetingKey.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomTargetingKey.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PREDEFINED"/>
 *     &lt;enumeration value="FREEFORM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomTargetingKey.Type")
@XmlEnum
public enum CustomTargetingKeyType {


    /**
     * 
     *                 Target audiences by criteria values that are defined in advance.
     *               
     * 
     */
    PREDEFINED,

    /**
     * 
     *                 Target audiences by adding criteria values when creating line items.
     *               
     * 
     */
    FREEFORM;

    public String value() {
        return name();
    }

    public static CustomTargetingKeyType fromValue(String v) {
        return valueOf(v);
    }

}
