
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetingGroupCriterionSortable.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TargetingGroupCriterionSortable">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="CRITERION_ID"/>
 *     &lt;enumeration value="TARGETING_GROUP_ID"/>
 *     &lt;enumeration value="STATUS"/>
 *     &lt;enumeration value="NAME"/>
 *     &lt;enumeration value="TYPE"/>
 *     &lt;enumeration value="TARGETING_GROUP_NAME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TargetingGroupCriterionSortable")
@XmlEnum
public enum TargetingGroupCriterionSortable {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,
    CRITERION_ID,
    TARGETING_GROUP_ID,
    STATUS,
    NAME,
    TYPE,
    TARGETING_GROUP_NAME;

    public String value() {
        return name();
    }

    public static TargetingGroupCriterionSortable fromValue(String v) {
        return valueOf(v);
    }

}
