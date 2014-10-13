
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignSharedSetError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignSharedSetError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAMPAIGN_SHARED_SET_DOES_NOT_EXIST"/>
 *     &lt;enumeration value="SHARED_SET_NOT_ACTIVE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignSharedSetError.Reason")
@XmlEnum
public enum CampaignSharedSetErrorReason {

    CAMPAIGN_SHARED_SET_DOES_NOT_EXIST,
    SHARED_SET_NOT_ACTIVE,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CampaignSharedSetErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
