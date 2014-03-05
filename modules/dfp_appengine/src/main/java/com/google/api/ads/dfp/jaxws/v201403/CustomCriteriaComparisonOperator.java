
package com.google.api.ads.dfp.jaxws.v201403;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomCriteria.ComparisonOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomCriteria.ComparisonOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IS"/>
 *     &lt;enumeration value="IS_NOT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomCriteria.ComparisonOperator")
@XmlEnum
public enum CustomCriteriaComparisonOperator {

    IS,
    IS_NOT;

    public String value() {
        return name();
    }

    public static CustomCriteriaComparisonOperator fromValue(String v) {
        return valueOf(v);
    }

}
