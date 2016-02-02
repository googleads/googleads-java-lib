
package com.google.api.ads.adwords.jaxws.v201601.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ad.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Ad.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEPRECATED_AD"/>
 *     &lt;enumeration value="IMAGE_AD"/>
 *     &lt;enumeration value="PRODUCT_AD"/>
 *     &lt;enumeration value="TEMPLATE_AD"/>
 *     &lt;enumeration value="TEXT_AD"/>
 *     &lt;enumeration value="THIRD_PARTY_REDIRECT_AD"/>
 *     &lt;enumeration value="DYNAMIC_SEARCH_AD"/>
 *     &lt;enumeration value="CALL_ONLY_AD"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Ad.Type")
@XmlEnum
public enum AdType {

    DEPRECATED_AD,
    IMAGE_AD,
    PRODUCT_AD,
    TEMPLATE_AD,
    TEXT_AD,
    THIRD_PARTY_REDIRECT_AD,
    DYNAMIC_SEARCH_AD,
    CALL_ONLY_AD,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AdType fromValue(String v) {
        return valueOf(v);
    }

}
