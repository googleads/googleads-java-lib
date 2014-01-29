
package com.google.api.ads.adwords.jaxws.v201306.o;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficEstimatorError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficEstimatorError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_CAMPAIGN_FOR_AD_GROUP_ESTIMATE_REQUEST"/>
 *     &lt;enumeration value="NO_AD_GROUP_FOR_KEYWORD_ESTIMATE_REQUEST"/>
 *     &lt;enumeration value="NO_MAX_CPC_FOR_KEYWORD_ESTIMATE_REQUEST"/>
 *     &lt;enumeration value="TOO_MANY_KEYWORD_ESTIMATE_REQUESTS"/>
 *     &lt;enumeration value="TOO_MANY_CAMPAIGN_ESTIMATE_REQUESTS"/>
 *     &lt;enumeration value="TOO_MANY_ADGROUP_ESTIMATE_REQUESTS"/>
 *     &lt;enumeration value="TOO_MANY_TARGETS"/>
 *     &lt;enumeration value="KEYWORD_TOO_LONG"/>
 *     &lt;enumeration value="KEYWORD_CONTAINS_BROAD_MATCH_MODIFIERS"/>
 *     &lt;enumeration value="INVALID_INPUT"/>
 *     &lt;enumeration value="SERVICE_UNAVAILABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrafficEstimatorError.Reason")
@XmlEnum
public enum TrafficEstimatorErrorReason {


    /**
     * 
     *                 When the request with {@code null} campaign ID in
     *                 {@link com.google.ads.api.services.trafficestimator.CampaignEstimateRequest}
     *                 contains an
     *                 {@link com.google.ads.api.services.trafficestimator.AdGroupEstimateRequest}
     *                 with an ID.
     *               
     * 
     */
    NO_CAMPAIGN_FOR_AD_GROUP_ESTIMATE_REQUEST,

    /**
     * 
     *                 When the request with {@code null} adgroup ID in
     *                 {@link com.google.ads.api.services.trafficestimator.AdGroupEstimateRequest}
     *                 contains a
     *                 {@link com.google.ads.api.services.trafficestimator.KeywordEstimateRequest}
     *                 with an ID.
     *               
     * 
     */
    NO_AD_GROUP_FOR_KEYWORD_ESTIMATE_REQUEST,

    /**
     * 
     *                 All
     *                 {@link com.google.ads.api.services.trafficestimator.KeywordEstimateRequest}
     *                 items should have maxCpc associated with them.
     *               
     * 
     */
    NO_MAX_CPC_FOR_KEYWORD_ESTIMATE_REQUEST,

    /**
     * 
     *                 When there are more
     *                 {@link com.google.ads.api.services.trafficestimator.KeywordEstimateRequest}s
     *                 in the request than TrafficEstimatorService allows.
     *               
     * 
     */
    TOO_MANY_KEYWORD_ESTIMATE_REQUESTS,

    /**
     * 
     *                 When there are more
     *                 {@link com.google.ads.api.services.trafficestimator.CampaignEstimateRequest}s
     *                 in the request than TrafficEstimatorService allows.
     *               
     * 
     */
    TOO_MANY_CAMPAIGN_ESTIMATE_REQUESTS,

    /**
     * 
     *                 When there are more
     *                 {@link com.google.ads.api.services.trafficestimator.AdGroupEstimateRequest}s
     *                 in the request than TrafficEstimatorService allows.
     *               
     * 
     */
    TOO_MANY_ADGROUP_ESTIMATE_REQUESTS,

    /**
     * 
     *                 When there are more targets
     *                 in the request than TrafficEstimatorService allows. See documentation
     *                 on {@link com.google.ads.api.services.trafficestimator.CampaignEstimateRequest}
     *                 for more information about this error.
     *               
     * 
     */
    TOO_MANY_TARGETS,

    /**
     * 
     *                 Request contains a keyword that is too long for backends to handle.
     *               
     * 
     */
    KEYWORD_TOO_LONG,

    /**
     * 
     *                 Request contains a keyword that contains broad match modifiers.
     *               
     * 
     */
    KEYWORD_CONTAINS_BROAD_MATCH_MODIFIERS,

    /**
     * 
     *                 When an unexpected error occurs.
     *               
     * 
     */
    INVALID_INPUT,

    /**
     * 
     *                 When backend service calls fail.
     *               
     * 
     */
    SERVICE_UNAVAILABLE;

    public String value() {
        return name();
    }

    public static TrafficEstimatorErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
