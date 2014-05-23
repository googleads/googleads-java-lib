
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegmentationDimension.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SegmentationDimension">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="DATE_DAY"/>
 *     &lt;enumeration value="DATE_WEEK"/>
 *     &lt;enumeration value="DATE_MONTH"/>
 *     &lt;enumeration value="DATE_QUARTER"/>
 *     &lt;enumeration value="DATE_YEAR"/>
 *     &lt;enumeration value="DAY_OF_WEEK"/>
 *     &lt;enumeration value="DEVICE_TYPE"/>
 *     &lt;enumeration value="DISPLAY_FORMAT"/>
 *     &lt;enumeration value="DISPLAY_FORMATxNETWORK"/>
 *     &lt;enumeration value="HOUR_OF_DAY"/>
 *     &lt;enumeration value="NETWORK"/>
 *     &lt;enumeration value="TARGETING_GROUP"/>
 *     &lt;enumeration value="VIDEO_AD"/>
 *     &lt;enumeration value="CONVERSION_TYPE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SegmentationDimension")
@XmlEnum
public enum SegmentationDimension {

    NONE("NONE"),
    DATE_DAY("DATE_DAY"),
    DATE_WEEK("DATE_WEEK"),
    DATE_MONTH("DATE_MONTH"),
    DATE_QUARTER("DATE_QUARTER"),
    DATE_YEAR("DATE_YEAR"),
    DAY_OF_WEEK("DAY_OF_WEEK"),
    DEVICE_TYPE("DEVICE_TYPE"),
    DISPLAY_FORMAT("DISPLAY_FORMAT"),
    @XmlEnumValue("DISPLAY_FORMATxNETWORK")
    DISPLAY_FORMA_TX_NETWORK("DISPLAY_FORMATxNETWORK"),
    HOUR_OF_DAY("HOUR_OF_DAY"),
    NETWORK("NETWORK"),

    /**
     * 
     *                 Applies only to {@link VideoAdService.get}
     *               
     * 
     */
    TARGETING_GROUP("TARGETING_GROUP"),

    /**
     * 
     *                 Applies only to {@link VideoTargetingGroupService.get}
     *               
     * 
     */
    VIDEO_AD("VIDEO_AD"),

    /**
     * 
     *                 Applies only to {@link VideoAdService.get, VideoCampaignService.get}
     *               
     * 
     */
    CONVERSION_TYPE("CONVERSION_TYPE"),

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN("UNKNOWN");
    private final String value;

    SegmentationDimension(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SegmentationDimension fromValue(String v) {
        for (SegmentationDimension c: SegmentationDimension.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
