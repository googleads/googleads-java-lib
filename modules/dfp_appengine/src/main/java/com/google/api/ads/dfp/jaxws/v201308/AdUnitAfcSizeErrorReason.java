
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdUnitAfcSizeError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdUnitAfcSizeError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID"/>
 *     &lt;enumeration value="DOESNT_FIT"/>
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdUnitAfcSizeError.Reason")
@XmlEnum
public enum AdUnitAfcSizeErrorReason {


    /**
     * 
     *                 The supplied Afc size is not valid.
     *               
     * 
     */
    INVALID,

    /**
     * 
     *                 The supplied {@link AdUnit} size does not fit into any of the Afc sizes
     *                 specified by the ad unit's {@link AdSenseSettings}.
     *               
     * 
     */
    DOESNT_FIT,

    /**
     * 
     *                 The supplied Afc size is not applicable for the {@link AdUnit}. This
     *                 should only be set on the root {@link AdUnit}.
     *               
     * 
     */
    NOT_APPLICABLE,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AdUnitAfcSizeErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
