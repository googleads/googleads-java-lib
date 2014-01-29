
package com.google.api.ads.dfp.jaxws.v201211;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeatureError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeatureError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MISSING_FEATURE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeatureError.Reason")
@XmlEnum
public enum FeatureErrorReason {


    /**
     * 
     *                 A feature is being used that is not enabled on the current network.
     *               
     * 
     */
    MISSING_FEATURE,

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

    public static FeatureErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
