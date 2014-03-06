
package com.google.api.ads.adwords.jaxws.v201402.express;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Promotion.Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Promotion.Status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DRAFT"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="PAUSED"/>
 *     &lt;enumeration value="DELETED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Promotion.Status")
@XmlEnum
public enum PromotionStatus {

    DRAFT,
    ACTIVE,
    PAUSED,
    DELETED;

    public String value() {
        return name();
    }

    public static PromotionStatus fromValue(String v) {
        return valueOf(v);
    }

}
