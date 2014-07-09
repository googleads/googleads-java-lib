
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENABLED"/>
 *     &lt;enumeration value="PAUSED"/>
 *     &lt;enumeration value="REMOVED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignStatus")
@XmlEnum
public enum CampaignStatus {


    /**
     * 
     *                 Campaign is currently serving ads depending on budget information.
     *               
     * 
     */
    ENABLED,

    /**
     * 
     *                 Campaign has been paused by the user.
     *               
     * 
     */
    PAUSED,

    /**
     * 
     *                 Campaign has been removed.
     *               
     * 
     */
    REMOVED;

    public String value() {
        return name();
    }

    public static CampaignStatus fromValue(String v) {
        return valueOf(v);
    }

}
