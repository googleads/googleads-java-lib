
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoBudget.BudgetDeliveryMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoBudget.BudgetDeliveryMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STANDARD"/>
 *     &lt;enumeration value="ACCELERATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoBudget.BudgetDeliveryMethod")
@XmlEnum
public enum VideoBudgetBudgetDeliveryMethod {


    /**
     * 
     *                 The budget server will throttle serving evenly across the entire time
     *                 period.
     *               
     * 
     */
    STANDARD,

    /**
     * 
     *                 The budget server will not throttle serving, and ads will serve as
     *                 fast as possible.
     *               
     * 
     */
    ACCELERATED;

    public String value() {
        return name();
    }

    public static VideoBudgetBudgetDeliveryMethod fromValue(String v) {
        return valueOf(v);
    }

}
