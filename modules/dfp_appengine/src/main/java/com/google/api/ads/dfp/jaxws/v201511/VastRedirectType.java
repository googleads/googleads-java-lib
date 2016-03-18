
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VastRedirectType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VastRedirectType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LINEAR"/>
 *     &lt;enumeration value="NON_LINEAR"/>
 *     &lt;enumeration value="LINEAR_AND_NON_LINEAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VastRedirectType")
@XmlEnum
public enum VastRedirectType {


    /**
     * 
     *                 The VAST XML contains only {@code linear} ads.
     *               
     * 
     */
    LINEAR,

    /**
     * 
     *                 The VAST XML contains only {@code nonlinear} ads.
     *               
     * 
     */
    NON_LINEAR,

    /**
     * 
     *                 The VAST XML contains both {@code linear} and {@code nonlinear} ads.
     *               
     * 
     */
    LINEAR_AND_NON_LINEAR;

    public String value() {
        return name();
    }

    public static VastRedirectType fromValue(String v) {
        return valueOf(v);
    }

}
