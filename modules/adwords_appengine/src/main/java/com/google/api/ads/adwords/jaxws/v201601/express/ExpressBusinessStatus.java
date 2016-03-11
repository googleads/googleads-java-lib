
package com.google.api.ads.adwords.jaxws.v201601.express;

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
 *     &lt;enumeration value="ENABLED"/>
 *     &lt;enumeration value="REMOVED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExpressBusiness.Status")
@XmlEnum
public enum ExpressBusinessStatus {

    ENABLED,
    REMOVED;

    public String value() {
        return name();
    }

    public static ExpressBusinessStatus fromValue(String v) {
        return valueOf(v);
    }

}
