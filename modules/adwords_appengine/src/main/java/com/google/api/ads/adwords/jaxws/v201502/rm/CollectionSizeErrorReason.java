
package com.google.api.ads.adwords.jaxws.v201502.rm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollectionSizeError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollectionSizeError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TOO_FEW"/>
 *     &lt;enumeration value="TOO_MANY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CollectionSizeError.Reason")
@XmlEnum
public enum CollectionSizeErrorReason {

    TOO_FEW,
    TOO_MANY;

    public String value() {
        return name();
    }

    public static CollectionSizeErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
