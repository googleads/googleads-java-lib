
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServingStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServingStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNDEFINED"/>
 *     &lt;enumeration value="REMOVED"/>
 *     &lt;enumeration value="CAMPAIGN_REMOVED"/>
 *     &lt;enumeration value="PAUSED"/>
 *     &lt;enumeration value="CAMPAIGN_PAUSED"/>
 *     &lt;enumeration value="ENDED"/>
 *     &lt;enumeration value="SUSPENDED"/>
 *     &lt;enumeration value="BROKEN"/>
 *     &lt;enumeration value="IMPROVABLE"/>
 *     &lt;enumeration value="LIMITED_BY_BUDGET"/>
 *     &lt;enumeration value="NOTIFICATION"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="SERVING"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServingStatus")
@XmlEnum
public enum ServingStatus {

    UNDEFINED,
    REMOVED,
    CAMPAIGN_REMOVED,
    PAUSED,
    CAMPAIGN_PAUSED,
    ENDED,
    SUSPENDED,
    BROKEN,
    IMPROVABLE,
    LIMITED_BY_BUDGET,
    NOTIFICATION,
    PENDING,
    SERVING,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ServingStatus fromValue(String v) {
        return valueOf(v);
    }

}
