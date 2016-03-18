
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomCriteriaSet.LogicalOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomCriteriaSet.LogicalOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AND"/>
 *     &lt;enumeration value="OR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomCriteriaSet.LogicalOperator")
@XmlEnum
public enum CustomCriteriaSetLogicalOperator {

    AND,
    OR;

    public String value() {
        return name();
    }

    public static CustomCriteriaSetLogicalOperator fromValue(String v) {
        return valueOf(v);
    }

}
