
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItemSummary.ReservationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineItemSummary.ReservationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RESERVED"/>
 *     &lt;enumeration value="UNRESERVED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineItemSummary.ReservationStatus")
@XmlEnum
public enum LineItemSummaryReservationStatus {


    /**
     * 
     *                 Indicates that inventory has been reserved for the line item.
     *               
     * 
     */
    RESERVED,

    /**
     * 
     *                 Indicates that inventory has not been reserved for the line item.
     *               
     * 
     */
    UNRESERVED;

    public String value() {
        return name();
    }

    public static LineItemSummaryReservationStatus fromValue(String v) {
        return valueOf(v);
    }

}
