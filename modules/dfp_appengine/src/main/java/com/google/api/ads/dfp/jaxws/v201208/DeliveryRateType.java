
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryRateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryRateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EVENLY"/>
 *     &lt;enumeration value="FRONTLOADED"/>
 *     &lt;enumeration value="AS_FAST_AS_POSSIBLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryRateType")
@XmlEnum
public enum DeliveryRateType {


    /**
     * 
     *                 Line items are served as evenly as possible across the number of
     *                 days specified in a line item's {@link LineItem#duration}.
     *               
     * 
     */
    EVENLY,

    /**
     * 
     *                 Line items are served more aggressively in the beginning of the flight
     *                 date. This option is only available for premium publishers.
     *               
     * 
     */
    FRONTLOADED,

    /**
     * 
     *                 The booked impressions for a line item may be delivered well before the
     *                 {@link LineItem#endDateTime}. Other lower-priority or lower-value line
     *                 items will be stopped from delivering until this line item meets the number
     *                 of impressions or clicks it is booked for.
     *               
     * 
     */
    AS_FAST_AS_POSSIBLE;

    public String value() {
        return name();
    }

    public static DeliveryRateType fromValue(String v) {
        return valueOf(v);
    }

}
