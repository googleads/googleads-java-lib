
package com.google.api.ads.adwords.jaxws.v201502.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SharedSetError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SharedSetError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CUSTOMER_CANNOT_CREATE_SHARED_SET_OF_THIS_TYPE"/>
 *     &lt;enumeration value="DUPLICATE_NAME"/>
 *     &lt;enumeration value="EXCEEDS_MAX_SHARED_SETS_FOR_TYPE"/>
 *     &lt;enumeration value="INVALID_SET_NAME"/>
 *     &lt;enumeration value="SHARED_SET_REMOVED"/>
 *     &lt;enumeration value="SHARED_SET_IN_USE"/>
 *     &lt;enumeration value="TYPE_CANNOT_BE_CHANGED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SharedSetError.Reason")
@XmlEnum
public enum SharedSetErrorReason {

    CUSTOMER_CANNOT_CREATE_SHARED_SET_OF_THIS_TYPE,
    DUPLICATE_NAME,
    EXCEEDS_MAX_SHARED_SETS_FOR_TYPE,
    INVALID_SET_NAME,
    SHARED_SET_REMOVED,
    SHARED_SET_IN_USE,
    TYPE_CANNOT_BE_CHANGED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static SharedSetErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
