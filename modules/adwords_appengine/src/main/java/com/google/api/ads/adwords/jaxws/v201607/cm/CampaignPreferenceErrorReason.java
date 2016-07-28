
package com.google.api.ads.adwords.jaxws.v201607.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignPreferenceError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignPreferenceError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PREFERENCE_ALREADY_EXISTS"/>
 *     &lt;enumeration value="PREFERENCE_NOT_FOUND"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignPreferenceError.Reason")
@XmlEnum
public enum CampaignPreferenceErrorReason {


    /**
     * 
     *                 A campaign cannot have two preferences with the same preference key.
     *               
     * 
     */
    PREFERENCE_ALREADY_EXISTS,

    /**
     * 
     *                 No preference matched the given preference key.
     *               
     * 
     */
    PREFERENCE_NOT_FOUND,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CampaignPreferenceErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
