
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoCampaignError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoCampaignError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="AFTER_MAXIMUM_ALLOWABLE_DATE"/>
 *     &lt;enumeration value="CANNOT_SET_DATE_TO_PAST"/>
 *     &lt;enumeration value="DUPLICATE_CAMPAIGN_NAME"/>
 *     &lt;enumeration value="INVALID_CAMPAIGN_NAME"/>
 *     &lt;enumeration value="START_DATE_AFTER_END_DATE"/>
 *     &lt;enumeration value="CANNOT_MODIFY_START_DATE_IF_ALREADY_STARTED"/>
 *     &lt;enumeration value="INVALID_OPERATION_IF_SERVING_STATUS_HAS_ENDED"/>
 *     &lt;enumeration value="CAMPAIGN_LIMIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoCampaignError.Reason")
@XmlEnum
public enum VideoCampaignErrorReason {


    /**
     * 
     *                 Default error.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 A date was used that is past the system "last" date.
     *               
     * 
     */
    AFTER_MAXIMUM_ALLOWABLE_DATE,

    /**
     * 
     *                 Trying to modify a date into the past.
     *               
     * 
     */
    CANNOT_SET_DATE_TO_PAST,

    /**
     * 
     *                 Campaign name already exists.
     *               
     * 
     */
    DUPLICATE_CAMPAIGN_NAME,

    /**
     * 
     *                 Campaign name cannot be used.
     *               
     * 
     */
    INVALID_CAMPAIGN_NAME,

    /**
     * 
     *                 Campaign start date was after end date.
     *               
     * 
     */
    START_DATE_AFTER_END_DATE,

    /**
     * 
     *                 Trying to change start date on a campaign that has started.
     *               
     * 
     */
    CANNOT_MODIFY_START_DATE_IF_ALREADY_STARTED,

    /**
     * 
     *                 Operation not allowed on a campaign whose serving status has ended
     *               
     * 
     */
    INVALID_OPERATION_IF_SERVING_STATUS_HAS_ENDED,

    /**
     * 
     *                 Exceeds the account limit for the number of campaigns.
     *               
     * 
     */
    CAMPAIGN_LIMIT;

    public String value() {
        return name();
    }

    public static VideoCampaignErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
