
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetingGroupSortable.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TargetingGroupSortable">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="TARGETING_GROUP_NAME"/>
 *     &lt;enumeration value="STATUS"/>
 *     &lt;enumeration value="BID"/>
 *     &lt;enumeration value="TARGETING_GROUP_ID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TargetingGroupSortable")
@XmlEnum
public enum TargetingGroupSortable {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,
    TARGETING_GROUP_NAME,
    STATUS,
    BID,
    TARGETING_GROUP_ID;

    public String value() {
        return name();
    }

    public static TargetingGroupSortable fromValue(String v) {
        return valueOf(v);
    }

}
