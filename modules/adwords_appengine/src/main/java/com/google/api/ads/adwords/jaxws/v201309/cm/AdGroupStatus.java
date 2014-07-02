
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdGroup.Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdGroup.Status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENABLED"/>
 *     &lt;enumeration value="PAUSED"/>
 *     &lt;enumeration value="DELETED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdGroup.Status")
@XmlEnum
public enum AdGroupStatus {


    /**
     * 
     *                 Active.
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
     *                 Removed.
     *               
     * 
     */
    DELETED;

    public String value() {
        return name();
    }

    public static AdGroupStatus fromValue(String v) {
        return valueOf(v);
    }

}
