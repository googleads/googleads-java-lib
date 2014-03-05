
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedMappingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedMappingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_PLACEHOLDER_FIELD"/>
 *     &lt;enumeration value="INVALID_PLACEHOLDER_TYPE"/>
 *     &lt;enumeration value="NO_ATTRIBUTE_FIELD_MAPPINGS"/>
 *     &lt;enumeration value="FEED_ATTRIBUTE_TYPE_MISMATCH"/>
 *     &lt;enumeration value="MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_TYPE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeedMappingError.Reason")
@XmlEnum
public enum FeedMappingErrorReason {


    /**
     * 
     *                 The given placeholder field does not exist.
     *               
     * 
     */
    INVALID_PLACEHOLDER_FIELD,

    /**
     * 
     *                 The given placeholder type does not exist.
     *               
     * 
     */
    INVALID_PLACEHOLDER_TYPE,

    /**
     * 
     *                 A feed mapping must contain at least one attribute field mapping.
     *               
     * 
     */
    NO_ATTRIBUTE_FIELD_MAPPINGS,

    /**
     * 
     *                 The type of the feed attribute referenced in the attribute field mapping must match
     *                 the type of the placeholder field.
     *               
     * 
     */
    FEED_ATTRIBUTE_TYPE_MISMATCH,

    /**
     * 
     *                 Only one feed mapping for a placeholder type is allowed per feed or customer
     *                 (depending on the placeholder type).
     *               
     * 
     */
    MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_TYPE,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static FeedMappingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
