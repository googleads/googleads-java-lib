
package com.google.api.ads.adwords.jaxws.v201502.rm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumberRuleItem.NumberOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NumberRuleItem.NumberOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="GREATER_THAN"/>
 *     &lt;enumeration value="GREATER_THAN_OR_EQUAL"/>
 *     &lt;enumeration value="EQUALS"/>
 *     &lt;enumeration value="NOT_EQUAL"/>
 *     &lt;enumeration value="LESS_THAN"/>
 *     &lt;enumeration value="LESS_THAN_OR_EQUAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NumberRuleItem.NumberOperator")
@XmlEnum
public enum NumberRuleItemNumberOperator {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,
    GREATER_THAN,
    GREATER_THAN_OR_EQUAL,
    EQUALS,
    NOT_EQUAL,
    LESS_THAN,
    LESS_THAN_OR_EQUAL;

    public String value() {
        return name();
    }

    public static NumberRuleItemNumberOperator fromValue(String v) {
        return valueOf(v);
    }

}
