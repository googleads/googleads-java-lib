
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdGroupAd.Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdGroupAd.Status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENABLED"/>
 *     &lt;enumeration value="PAUSED"/>
 *     &lt;enumeration value="DISABLED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdGroupAd.Status")
@XmlEnum
public enum AdGroupAdStatus {


    /**
     * 
     *                 Enabled.
     *               
     * 
     */
    ENABLED,

    /**
     * 
     *                 Paused.
     *               
     * 
     */
    PAUSED,

    /**
     * 
     *                 Disabled.
     *               
     * 
     */
    DISABLED;

    public String value() {
        return name();
    }

    public static AdGroupAdStatus fromValue(String v) {
        return valueOf(v);
    }

}
