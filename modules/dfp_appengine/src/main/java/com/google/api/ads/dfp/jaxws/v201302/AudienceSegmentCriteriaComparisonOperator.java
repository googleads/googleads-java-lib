
package com.google.api.ads.dfp.jaxws.v201302;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudienceSegmentCriteria.ComparisonOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AudienceSegmentCriteria.ComparisonOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IS"/>
 *     &lt;enumeration value="IS_NOT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AudienceSegmentCriteria.ComparisonOperator")
@XmlEnum
public enum AudienceSegmentCriteriaComparisonOperator {

    IS,
    IS_NOT;

    public String value() {
        return name();
    }

    public static AudienceSegmentCriteriaComparisonOperator fromValue(String v) {
        return valueOf(v);
    }

}
