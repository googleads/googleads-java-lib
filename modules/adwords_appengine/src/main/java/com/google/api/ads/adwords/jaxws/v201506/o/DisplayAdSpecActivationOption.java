
package com.google.api.ads.adwords.jaxws.v201506.o;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisplayAdSpec.ActivationOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisplayAdSpec.ActivationOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="STANDARD_EXPANDABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisplayAdSpec.ActivationOption")
@XmlEnum
public enum DisplayAdSpecActivationOption {

    UNKNOWN,

    /**
     * 
     *                 No activation option specified.
     *               
     * 
     */
    NONE,

    /**
     * 
     *                 Standard expandable format means the ad expands from a smaller
     *                 creative to a larger creative which is overlaid on top of the content,
     *                 rather than around it.
     *               
     * 
     */
    STANDARD_EXPANDABLE;

    public String value() {
        return name();
    }

    public static DisplayAdSpecActivationOption fromValue(String v) {
        return valueOf(v);
    }

}
