
package com.google.api.ads.adwords.jaxws.v201506.o;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InStreamAdSpec.InStreamType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InStreamAdSpec.InStreamType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="IN_STREAM"/>
 *     &lt;enumeration value="IN_DISPLAY"/>
 *     &lt;enumeration value="IN_SLATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InStreamAdSpec.InStreamType")
@XmlEnum
public enum InStreamAdSpecInStreamType {

    UNKNOWN,

    /**
     * 
     *                 Ads play during, before, or after video content.
     *               
     * 
     */
    IN_STREAM,

    /**
     * 
     *                 Ads show up in display ad units against videos.
     *               
     * 
     */
    IN_DISPLAY,

    /**
     * 
     *                 A choice of ads is given to the customer, who picks one to watch.
     *               
     * 
     */
    IN_SLATE;

    public String value() {
        return name();
    }

    public static InStreamAdSpecInStreamType fromValue(String v) {
        return valueOf(v);
    }

}
