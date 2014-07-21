
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServingIssue.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServingIssue.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCOUNT_SUSPENDED"/>
 *     &lt;enumeration value="ACCOUNT_CLOSED"/>
 *     &lt;enumeration value="ACCOUNT_DISABLED"/>
 *     &lt;enumeration value="SUSPENDED"/>
 *     &lt;enumeration value="LIMITED_BY_BUDGET"/>
 *     &lt;enumeration value="INSTREAM_TOO_HIGH"/>
 *     &lt;enumeration value="ALL_CREATIVES_UNHEALTHY"/>
 *     &lt;enumeration value="SOME_CREATIVES_DISAPPROVED"/>
 *     &lt;enumeration value="ALL_CREATIVES_DISAPPROVED"/>
 *     &lt;enumeration value="SOME_CREATIVES_LABELED"/>
 *     &lt;enumeration value="ALL_CREATIVES_LABELED"/>
 *     &lt;enumeration value="SOME_CREATIVES_UNREVIEWED"/>
 *     &lt;enumeration value="ALL_CREATIVES_UNREVIEWED"/>
 *     &lt;enumeration value="SOME_CREATIVES_ELIGIBLE"/>
 *     &lt;enumeration value="ALL_CREATIVES_ELIGIBLE"/>
 *     &lt;enumeration value="VIDEO_ADS_WITHOUT_TARGETING"/>
 *     &lt;enumeration value="ACTIVE_AD_WITH_ALL_FORMATS_PAUSED"/>
 *     &lt;enumeration value="TARGETING_BID_REQUIRED"/>
 *     &lt;enumeration value="INSLATE_DEPRECATED"/>
 *     &lt;enumeration value="TARGETING_DUPLICATE_NAME"/>
 *     &lt;enumeration value="TARGETING_MISMATCH"/>
 *     &lt;enumeration value="TARGETING_NO_VIDEOAD"/>
 *     &lt;enumeration value="STUDY_INVITATION"/>
 *     &lt;enumeration value="SURVEY_INVITATION"/>
 *     &lt;enumeration value="NO_VIDEO_AD_SERVING"/>
 *     &lt;enumeration value="ALL_VIDEO_ADS_PENDING"/>
 *     &lt;enumeration value="SOME_VIDEO_ADS_PENDING"/>
 *     &lt;enumeration value="ALL_VIDEO_ADS_UNHEALTHY"/>
 *     &lt;enumeration value="SOME_VIDEO_ADS_UNHEALTHY"/>
 *     &lt;enumeration value="NO_VIDEO"/>
 *     &lt;enumeration value="NO_TARGETING"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServingIssue.Reason")
@XmlEnum
public enum ServingIssueReason {

    ACCOUNT_SUSPENDED,
    ACCOUNT_CLOSED,
    ACCOUNT_DISABLED,
    SUSPENDED,
    LIMITED_BY_BUDGET,
    INSTREAM_TOO_HIGH,
    ALL_CREATIVES_UNHEALTHY,
    SOME_CREATIVES_DISAPPROVED,
    ALL_CREATIVES_DISAPPROVED,
    SOME_CREATIVES_LABELED,
    ALL_CREATIVES_LABELED,
    SOME_CREATIVES_UNREVIEWED,
    ALL_CREATIVES_UNREVIEWED,
    SOME_CREATIVES_ELIGIBLE,
    ALL_CREATIVES_ELIGIBLE,
    VIDEO_ADS_WITHOUT_TARGETING,
    ACTIVE_AD_WITH_ALL_FORMATS_PAUSED,
    TARGETING_BID_REQUIRED,
    INSLATE_DEPRECATED,
    TARGETING_DUPLICATE_NAME,
    TARGETING_MISMATCH,
    TARGETING_NO_VIDEOAD,
    STUDY_INVITATION,
    SURVEY_INVITATION,
    NO_VIDEO_AD_SERVING,
    ALL_VIDEO_ADS_PENDING,
    SOME_VIDEO_ADS_PENDING,
    ALL_VIDEO_ADS_UNHEALTHY,
    SOME_VIDEO_ADS_UNHEALTHY,
    NO_VIDEO,
    NO_TARGETING,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ServingIssueReason fromValue(String v) {
        return valueOf(v);
    }

}
