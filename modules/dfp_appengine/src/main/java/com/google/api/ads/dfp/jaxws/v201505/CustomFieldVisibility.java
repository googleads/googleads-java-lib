
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomFieldVisibility.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomFieldVisibility">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="API_ONLY"/>
 *     &lt;enumeration value="READ_ONLY"/>
 *     &lt;enumeration value="FULL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomFieldVisibility")
@XmlEnum
public enum CustomFieldVisibility {


    /**
     * 
     *                 Only visible through the API.
     *               
     * 
     */
    API_ONLY,

    /**
     * 
     *                 Visible in the UI, but only editable through the API
     *               
     * 
     */
    READ_ONLY,

    /**
     * 
     *                 Visible and editable both in the API and the UI.
     *               
     * 
     */
    FULL;

    public String value() {
        return name();
    }

    public static CustomFieldVisibility fromValue(String v) {
        return valueOf(v);
    }

}
