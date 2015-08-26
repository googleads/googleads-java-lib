
package com.google.api.ads.adwords.jaxws.v201502.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignAdExtension.Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignAdExtension.Status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENABLED"/>
 *     &lt;enumeration value="REMOVED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignAdExtension.Status")
@XmlEnum
public enum CampaignAdExtensionStatus {


    /**
     * 
     *                 Enabled.
     *               
     * 
     */
    ENABLED,

    /**
     * 
     *                 Removed.
     *               
     * 
     */
    REMOVED;

    public String value() {
        return name();
    }

    public static CampaignAdExtensionStatus fromValue(String v) {
        return valueOf(v);
    }

}
