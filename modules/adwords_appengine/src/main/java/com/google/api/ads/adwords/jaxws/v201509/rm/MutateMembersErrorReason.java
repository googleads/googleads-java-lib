
package com.google.api.ads.adwords.jaxws.v201509.rm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MutateMembersError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MutateMembersError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="UNSUPPORTED_METHOD"/>
 *     &lt;enumeration value="INVALID_USER_LIST_ID"/>
 *     &lt;enumeration value="INVALID_USER_LIST_TYPE"/>
 *     &lt;enumeration value="INVALID_DATA_TYPE"/>
 *     &lt;enumeration value="INVALID_SHA256_FORMAT"/>
 *     &lt;enumeration value="OPERATOR_CONFLICT_FOR_SAME_USER_LIST_ID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MutateMembersError.Reason")
@XmlEnum
public enum MutateMembersErrorReason {

    UNKNOWN("UNKNOWN"),
    UNSUPPORTED_METHOD("UNSUPPORTED_METHOD"),
    INVALID_USER_LIST_ID("INVALID_USER_LIST_ID"),
    INVALID_USER_LIST_TYPE("INVALID_USER_LIST_TYPE"),
    INVALID_DATA_TYPE("INVALID_DATA_TYPE"),
    @XmlEnumValue("INVALID_SHA256_FORMAT")
    INVALID_SHA_256_FORMAT("INVALID_SHA256_FORMAT"),
    OPERATOR_CONFLICT_FOR_SAME_USER_LIST_ID("OPERATOR_CONFLICT_FOR_SAME_USER_LIST_ID");
    private final String value;

    MutateMembersErrorReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MutateMembersErrorReason fromValue(String v) {
        for (MutateMembersErrorReason c: MutateMembersErrorReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
