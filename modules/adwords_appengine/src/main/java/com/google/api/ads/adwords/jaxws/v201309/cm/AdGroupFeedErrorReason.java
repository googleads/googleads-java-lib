
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdGroupFeedError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdGroupFeedError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE"/>
 *     &lt;enumeration value="INVALID_ID"/>
 *     &lt;enumeration value="CANNOT_ADD_ALREADY_EXISTING_ADGROUP_FEED"/>
 *     &lt;enumeration value="CANNOT_OPERATE_ON_DELETED_ADGROUP_FEED"/>
 *     &lt;enumeration value="INVALID_PLACEHOLDER_TYPES"/>
 *     &lt;enumeration value="MISSING_FEEDMAPPING_FOR_PLACEHOLDER_TYPE"/>
 *     &lt;enumeration value="FEEDS_ONLY_UNDER_ENHANCED_CAMPAIGNS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdGroupFeedError.Reason")
@XmlEnum
public enum AdGroupFeedErrorReason {


    /**
     * 
     *                 An active feed already exists for this adgroup and place holder type.
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
     *                 The AdGroupFeed already exists. SET should be used to modify the existing AdGroupFeed.
     *               
     * 
     */
    CANNOT_ADD_ALREADY_EXISTING_ADGROUP_FEED,

    /**
     * 
     *                 Cannot operate on removed adgroup feed.
     *               
     * 
     */
    CANNOT_OPERATE_ON_DELETED_ADGROUP_FEED,

    /**
     * 
     *                 Invalid placeholder type ids.
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
     *                 AdGroupFeeds are only allowed under enhanced campaigns.
     *               
     * 
     */
    FEEDS_ONLY_UNDER_ENHANCED_CAMPAIGNS,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AdGroupFeedErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
