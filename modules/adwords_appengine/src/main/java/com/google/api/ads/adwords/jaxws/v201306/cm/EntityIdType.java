
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityId.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityId.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADGROUP_ID"/>
 *     &lt;enumeration value="AD_ID"/>
 *     &lt;enumeration value="CAMPAIGN_ID"/>
 *     &lt;enumeration value="CUSTOMER_ID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityId.Type")
@XmlEnum
public enum EntityIdType {

    ADGROUP_ID,
    AD_ID,
    CAMPAIGN_ID,
    CUSTOMER_ID;

    public String value() {
        return name();
    }

    public static EntityIdType fromValue(String v) {
        return valueOf(v);
    }

}
