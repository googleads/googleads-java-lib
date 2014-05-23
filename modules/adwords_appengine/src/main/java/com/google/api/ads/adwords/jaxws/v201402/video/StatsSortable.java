
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatsSortable.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatsSortable">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AVERAGE_CPV"/>
 *     &lt;enumeration value="AVERAGE_CPM"/>
 *     &lt;enumeration value="VIEWS"/>
 *     &lt;enumeration value="VIEW_RATE"/>
 *     &lt;enumeration value="CTR"/>
 *     &lt;enumeration value="COST"/>
 *     &lt;enumeration value="COST_PER_CONVERSION"/>
 *     &lt;enumeration value="IMPRESSIONS"/>
 *     &lt;enumeration value="WEBSITE_CLICKS"/>
 *     &lt;enumeration value="CONVERSIONS"/>
 *     &lt;enumeration value="CONVERSION_RATE"/>
 *     &lt;enumeration value="VIEW_THROUGH_CONVERSIONS"/>
 *     &lt;enumeration value="CONVERSIONS_MANY_PER_VIEW"/>
 *     &lt;enumeration value="CONVERSION_RATE_MANY_PER_VIEW"/>
 *     &lt;enumeration value="COST_PER_CONVERSION_MANY_PER_VIEW"/>
 *     &lt;enumeration value="TOTAL_CONV_VALUE"/>
 *     &lt;enumeration value="VALUE_PER_CONV"/>
 *     &lt;enumeration value="VALUE_PER_CONV_MANY_PER_VIEW"/>
 *     &lt;enumeration value="PERCENT_SERVED"/>
 *     &lt;enumeration value="VIDEO_STARTS"/>
 *     &lt;enumeration value="QUARTILE_25S"/>
 *     &lt;enumeration value="QUARTILE_50S"/>
 *     &lt;enumeration value="QUARTILE_75S"/>
 *     &lt;enumeration value="QUARTILE_100S"/>
 *     &lt;enumeration value="QUARTILE_25_PERCENTS"/>
 *     &lt;enumeration value="QUARTILE_50_PERCENTS"/>
 *     &lt;enumeration value="QUARTILE_75_PERCENTS"/>
 *     &lt;enumeration value="QUARTILE_100_PERCENTS"/>
 *     &lt;enumeration value="FOLLOW_ON_SUBSCRIBES"/>
 *     &lt;enumeration value="FOLLOW_ON_SUBSCRIBE_RATE"/>
 *     &lt;enumeration value="FOLLOW_ON_VIEWS"/>
 *     &lt;enumeration value="FOLLOW_ON_VIEW_RATE"/>
 *     &lt;enumeration value="FOLLOW_ON_ADD_TO_PLAYLIST"/>
 *     &lt;enumeration value="FOLLOW_ON_COMMENTS"/>
 *     &lt;enumeration value="FOLLOW_ON_LIKES"/>
 *     &lt;enumeration value="FOLLOW_ON_SHARES"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatsSortable")
@XmlEnum
public enum StatsSortable {

    AVERAGE_CPV("AVERAGE_CPV"),
    AVERAGE_CPM("AVERAGE_CPM"),
    VIEWS("VIEWS"),
    VIEW_RATE("VIEW_RATE"),
    CTR("CTR"),
    COST("COST"),
    COST_PER_CONVERSION("COST_PER_CONVERSION"),
    IMPRESSIONS("IMPRESSIONS"),
    WEBSITE_CLICKS("WEBSITE_CLICKS"),
    CONVERSIONS("CONVERSIONS"),
    CONVERSION_RATE("CONVERSION_RATE"),
    VIEW_THROUGH_CONVERSIONS("VIEW_THROUGH_CONVERSIONS"),
    CONVERSIONS_MANY_PER_VIEW("CONVERSIONS_MANY_PER_VIEW"),
    CONVERSION_RATE_MANY_PER_VIEW("CONVERSION_RATE_MANY_PER_VIEW"),
    COST_PER_CONVERSION_MANY_PER_VIEW("COST_PER_CONVERSION_MANY_PER_VIEW"),
    TOTAL_CONV_VALUE("TOTAL_CONV_VALUE"),
    VALUE_PER_CONV("VALUE_PER_CONV"),
    VALUE_PER_CONV_MANY_PER_VIEW("VALUE_PER_CONV_MANY_PER_VIEW"),
    PERCENT_SERVED("PERCENT_SERVED"),
    VIDEO_STARTS("VIDEO_STARTS"),
    @XmlEnumValue("QUARTILE_25S")
    QUARTILE_25_S("QUARTILE_25S"),
    @XmlEnumValue("QUARTILE_50S")
    QUARTILE_50_S("QUARTILE_50S"),
    @XmlEnumValue("QUARTILE_75S")
    QUARTILE_75_S("QUARTILE_75S"),
    @XmlEnumValue("QUARTILE_100S")
    QUARTILE_100_S("QUARTILE_100S"),
    QUARTILE_25_PERCENTS("QUARTILE_25_PERCENTS"),
    QUARTILE_50_PERCENTS("QUARTILE_50_PERCENTS"),
    QUARTILE_75_PERCENTS("QUARTILE_75_PERCENTS"),
    QUARTILE_100_PERCENTS("QUARTILE_100_PERCENTS"),
    FOLLOW_ON_SUBSCRIBES("FOLLOW_ON_SUBSCRIBES"),
    FOLLOW_ON_SUBSCRIBE_RATE("FOLLOW_ON_SUBSCRIBE_RATE"),
    FOLLOW_ON_VIEWS("FOLLOW_ON_VIEWS"),
    FOLLOW_ON_VIEW_RATE("FOLLOW_ON_VIEW_RATE"),
    FOLLOW_ON_ADD_TO_PLAYLIST("FOLLOW_ON_ADD_TO_PLAYLIST"),
    FOLLOW_ON_COMMENTS("FOLLOW_ON_COMMENTS"),
    FOLLOW_ON_LIKES("FOLLOW_ON_LIKES"),
    FOLLOW_ON_SHARES("FOLLOW_ON_SHARES"),

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN("UNKNOWN");
    private final String value;

    StatsSortable(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatsSortable fromValue(String v) {
        for (StatsSortable c: StatsSortable.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
