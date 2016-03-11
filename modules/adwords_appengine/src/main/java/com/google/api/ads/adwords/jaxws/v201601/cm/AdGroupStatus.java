
package com.google.api.ads.adwords.jaxws.v201601.cm;

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
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="ENABLED"/>
 *     &lt;enumeration value="PAUSED"/>
 *     &lt;enumeration value="REMOVED"/>
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
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

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
    REMOVED;

    public String value() {
        return name();
    }

    public static AdGroupStatus fromValue(String v) {
        return valueOf(v);
    }

}
