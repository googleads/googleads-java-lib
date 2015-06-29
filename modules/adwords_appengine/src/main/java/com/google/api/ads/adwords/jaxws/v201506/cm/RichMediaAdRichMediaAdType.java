
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RichMediaAd.RichMediaAdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RichMediaAd.RichMediaAdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STANDARD"/>
 *     &lt;enumeration value="IN_STREAM_VIDEO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RichMediaAd.RichMediaAdType")
@XmlEnum
public enum RichMediaAdRichMediaAdType {


    /**
     * 
     *                 Standard.
     *               
     * 
     */
    STANDARD,

    /**
     * 
     *                 In stream video ad.
     *               
     * 
     */
    IN_STREAM_VIDEO;

    public String value() {
        return name();
    }

    public static RichMediaAdRichMediaAdType fromValue(String v) {
        return valueOf(v);
    }

}
