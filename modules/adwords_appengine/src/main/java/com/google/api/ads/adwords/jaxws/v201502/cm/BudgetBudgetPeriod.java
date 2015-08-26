
package com.google.api.ads.adwords.jaxws.v201502.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Budget.BudgetPeriod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Budget.BudgetPeriod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DAILY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Budget.BudgetPeriod")
@XmlEnum
public enum BudgetBudgetPeriod {

    DAILY;

    public String value() {
        return name();
    }

    public static BudgetBudgetPeriod fromValue(String v) {
        return valueOf(v);
    }

}
