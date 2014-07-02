
package com.google.api.ads.adwords.jaxws.v201402.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerFeedError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerFeedError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE"/>
 *     &lt;enumeration value="INVALID_ID"/>
 *     &lt;enumeration value="CANNOT_ADD_ALREADY_EXISTING_CUSTOMER_FEED"/>
 *     &lt;enumeration value="CANNOT_MODIFY_DELETED_CUSTOMER_FEED"/>
 *     &lt;enumeration value="INVALID_PLACEHOLDER_TYPES"/>
 *     &lt;enumeration value="MISSING_FEEDMAPPING_FOR_PLACEHOLDER_TYPE"/>
 *     &lt;enumeration value="PLACEHOLDER_TYPE_NOT_ALLOWED_ON_CUSTOMER_FEED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerFeedError.Reason")
@XmlEnum
public enum CustomerFeedErrorReason {


    /**
     * 
     *                 An active feed already exists for this customer and place holder type.
     *               
     * 
     */
    FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE,

    /**
     * 
     *                 The specified id does not exist.
     *               
     * 
     */
    INVALID_ID,

    /**
     * 
     *                 The CustomerFeed already exists. SET should be used to modify the existing CustomerFeed.
     *               
     * 
     */
    CANNOT_ADD_ALREADY_EXISTING_CUSTOMER_FEED,

    /**
     * 
     *                 Cannot modify removed customer feed.
     *               
     * 
     */
    CANNOT_MODIFY_DELETED_CUSTOMER_FEED,

    /**
     * 
     *                 Invalid placeholder types.
     *               
     * 
     */
    INVALID_PLACEHOLDER_TYPES,

    /**
     * 
     *                 Feed mapping for this placeholder type does not exist.
     *               
     * 
     */
    MISSING_FEEDMAPPING_FOR_PLACEHOLDER_TYPE,

    /**
     * 
     *                 Placeholder not allowed at the account level.
     *               
     * 
     */
    PLACEHOLDER_TYPE_NOT_ALLOWED_ON_CUSTOMER_FEED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CustomerFeedErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
