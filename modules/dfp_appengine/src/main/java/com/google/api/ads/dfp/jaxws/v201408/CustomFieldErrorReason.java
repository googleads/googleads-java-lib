
package com.google.api.ads.dfp.jaxws.v201408;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomFieldError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomFieldError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_CUSTOM_FIELD_FOR_OPTION"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomFieldError.Reason")
@XmlEnum
public enum CustomFieldErrorReason {


    /**
     * 
     *                 An attempt was made to create a {@link CustomFieldOption} for
     *                 a {@link CustomField} that does not have {@link CustomFieldDataType#DROPDOWN}.
     *               
     * 
     */
    INVALID_CUSTOM_FIELD_FOR_OPTION,

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

    public static CustomFieldErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
