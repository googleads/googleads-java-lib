
package com.google.api.ads.dfp.jaxws.v201502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomFieldValueError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomFieldValueError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CUSTOM_FIELD_NOT_FOUND"/>
 *     &lt;enumeration value="CUSTOM_FIELD_INACTIVE"/>
 *     &lt;enumeration value="CUSTOM_FIELD_OPTION_NOT_FOUND"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomFieldValueError.Reason")
@XmlEnum
public enum CustomFieldValueErrorReason {


    /**
     * 
     *                 An attempt was made to modify or create a {@link CustomFieldValue} for
     *                 a {@link CustomField} that does not exist.
     *               
     * 
     */
    CUSTOM_FIELD_NOT_FOUND,

    /**
     * 
     *                 An attempt was made to create a new value for a custom field
     *                 that is inactive.
     *               
     * 
     */
    CUSTOM_FIELD_INACTIVE,

    /**
     * 
     *                 An attempt was made to modify or create a {@link CustomFieldValue} corresponding
     *                 to a {@link CustomFieldOption} that could not be found.
     *               
     * 
     */
    CUSTOM_FIELD_OPTION_NOT_FOUND,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CustomFieldValueErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
