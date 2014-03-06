
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetCreativeTemplateVariable.MimeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetCreativeTemplateVariable.MimeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="JPG"/>
 *     &lt;enumeration value="PNG"/>
 *     &lt;enumeration value="GIF"/>
 *     &lt;enumeration value="SWF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssetCreativeTemplateVariable.MimeType")
@XmlEnum
public enum AssetCreativeTemplateVariableMimeType {

    JPG,
    PNG,
    GIF,
    SWF;

    public String value() {
        return name();
    }

    public static AssetCreativeTemplateVariableMimeType fromValue(String v) {
        return valueOf(v);
    }

}
