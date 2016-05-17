
package com.google.api.ads.dfp.jaxws.v201605;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValueSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValueSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PARENT"/>
 *     &lt;enumeration value="DIRECTLY_SPECIFIED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValueSourceType")
@XmlEnum
public enum ValueSourceType {


    /**
     * 
     *                 The field's value is inherited from the parent object.
     *               
     * 
     */
    PARENT,

    /**
     * 
     *                 The field's value is user specified and not inherited.
     *               
     * 
     */
    DIRECTLY_SPECIFIED;

    public String value() {
        return name();
    }

    public static ValueSourceType fromValue(String v) {
        return valueOf(v);
    }

}
