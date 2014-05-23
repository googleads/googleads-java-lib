
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetingGroupCriterionSelector.CriterionUse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TargetingGroupCriterionSelector.CriterionUse">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BIDDABLE"/>
 *     &lt;enumeration value="NEGATIVE"/>
 *     &lt;enumeration value="ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TargetingGroupCriterionSelector.CriterionUse")
@XmlEnum
public enum TargetingGroupCriterionSelectorCriterionUse {


    /**
     * 
     *                 Include only targetable (i.e. biddable) criterions.
     *               
     * 
     */
    BIDDABLE,

    /**
     * 
     *                 Include only negative criterions.
     *               
     * 
     */
    NEGATIVE,

    /**
     * 
     *                 Return all criterions regardless of the relation type.
     *               
     * 
     */
    ALL;

    public String value() {
        return name();
    }

    public static TargetingGroupCriterionSelectorCriterionUse fromValue(String v) {
        return valueOf(v);
    }

}
