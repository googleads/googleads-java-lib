
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoCampaign.TargetingMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoCampaign.TargetingMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTO"/>
 *     &lt;enumeration value="MANUAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoCampaign.TargetingMode")
@XmlEnum
public enum VideoCampaignTargetingMode {

    AUTO,

    /**
     * 
     *                 Manual targeting.
     *               
     * 
     */
    MANUAL;

    public String value() {
        return name();
    }

    public static VideoCampaignTargetingMode fromValue(String v) {
        return valueOf(v);
    }

}
