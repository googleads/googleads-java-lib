
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Predicate.Operator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Predicate.Operator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQUALS"/>
 *     &lt;enumeration value="NOT_EQUALS"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="NOT_IN"/>
 *     &lt;enumeration value="GREATER_THAN"/>
 *     &lt;enumeration value="GREATER_THAN_EQUALS"/>
 *     &lt;enumeration value="LESS_THAN"/>
 *     &lt;enumeration value="LESS_THAN_EQUALS"/>
 *     &lt;enumeration value="STARTS_WITH"/>
 *     &lt;enumeration value="STARTS_WITH_IGNORE_CASE"/>
 *     &lt;enumeration value="CONTAINS"/>
 *     &lt;enumeration value="CONTAINS_IGNORE_CASE"/>
 *     &lt;enumeration value="DOES_NOT_CONTAIN"/>
 *     &lt;enumeration value="DOES_NOT_CONTAIN_IGNORE_CASE"/>
 *     &lt;enumeration value="CONTAINS_ANY"/>
 *     &lt;enumeration value="CONTAINS_ALL"/>
 *     &lt;enumeration value="CONTAINS_NONE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Predicate.Operator")
@XmlEnum
public enum PredicateOperator {

    EQUALS,
    NOT_EQUALS,
    IN,
    NOT_IN,
    GREATER_THAN,
    GREATER_THAN_EQUALS,
    LESS_THAN,
    LESS_THAN_EQUALS,
    STARTS_WITH,
    STARTS_WITH_IGNORE_CASE,
    CONTAINS,
    CONTAINS_IGNORE_CASE,
    DOES_NOT_CONTAIN,
    DOES_NOT_CONTAIN_IGNORE_CASE,
    CONTAINS_ANY,
    CONTAINS_ALL,
    CONTAINS_NONE,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static PredicateOperator fromValue(String v) {
        return valueOf(v);
    }

}
