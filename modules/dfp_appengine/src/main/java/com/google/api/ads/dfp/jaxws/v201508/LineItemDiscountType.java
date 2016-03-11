
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItemDiscountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineItemDiscountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABSOLUTE_VALUE"/>
 *     &lt;enumeration value="PERCENTAGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineItemDiscountType")
@XmlEnum
public enum LineItemDiscountType {


    /**
     * 
     *                 An absolute value will be discounted from the line item's cost.
     *               
     * 
     */
    ABSOLUTE_VALUE,

    /**
     * 
     *                 A percentage of the cost will be applied as discount for booking the line
     *                 item.
     *               
     * 
     */
    PERCENTAGE;

    public String value() {
        return name();
    }

    public static LineItemDiscountType fromValue(String v) {
        return valueOf(v);
    }

}
