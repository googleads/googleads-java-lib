
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Budget.BudgetDeliveryMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Budget.BudgetDeliveryMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STANDARD"/>
 *     &lt;enumeration value="ACCELERATED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Budget.BudgetDeliveryMethod")
@XmlEnum
public enum BudgetBudgetDeliveryMethod {


    /**
     * 
     *                 The budget server will throttle serving evenly across the entire time period.
     *               
     * 
     */
    STANDARD,

    /**
     * 
     *                 The budget server will not throttle serving, and ads will serve as fast as possible.
     *               
     * 
     */
    ACCELERATED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static BudgetBudgetDeliveryMethod fromValue(String v) {
        return valueOf(v);
    }

}
