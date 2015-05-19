
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreativeSizeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreativeSizeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PIXEL"/>
 *     &lt;enumeration value="ASPECT_RATIO"/>
 *     &lt;enumeration value="INTERSTITIAL"/>
 *     &lt;enumeration value="NATIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreativeSizeType")
@XmlEnum
public enum CreativeSizeType {


    /**
     * 
     *                 Dimension based size, an actual height and width.
     *               
     * 
     */
    PIXEL,

    /**
     * 
     *                 Mobile size, that is expressed as a ratio of say 4 by 1, that could be
     *                 met by a 100 x 25 sized image.
     *               
     * 
     */
    ASPECT_RATIO,

    /**
     * 
     *                 Out-of-page size, that is not related to the slot it is served.  But rather
     *                 is a function of the snippet, and the values set. This must be used with
     *                 1x1 size.
     *               
     * 
     */
    INTERSTITIAL,

    /**
     * 
     *                 Native size, which is a function of the how the client renders the creative.
     *                 This must be used with 1x1 size.
     *               
     * 
     */
    NATIVE;

    public String value() {
        return name();
    }

    public static CreativeSizeType fromValue(String v) {
        return valueOf(v);
    }

}
