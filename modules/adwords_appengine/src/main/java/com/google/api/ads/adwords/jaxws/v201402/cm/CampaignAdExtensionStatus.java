
package com.google.api.ads.adwords.jaxws.v201402.cm;

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
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="DELETED"/>
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
     *                 Active.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 Deleted.
     *               
     * 
     */
    DELETED;

    public String value() {
        return name();
    }

    public static CampaignAdExtensionStatus fromValue(String v) {
        return valueOf(v);
    }

}
