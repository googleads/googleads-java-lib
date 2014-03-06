
package com.google.api.ads.adwords.jaxws.v201402.express;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpressBusiness.Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExpressBusiness.Status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="DELETED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExpressBusiness.Status")
@XmlEnum
public enum ExpressBusinessStatus {

    ACTIVE,
    DELETED;

    public String value() {
        return name();
    }

    public static ExpressBusinessStatus fromValue(String v) {
        return valueOf(v);
    }

}
