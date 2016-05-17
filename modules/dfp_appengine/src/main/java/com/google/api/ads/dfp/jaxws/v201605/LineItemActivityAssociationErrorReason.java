
package com.google.api.ads.dfp.jaxws.v201605;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItemActivityAssociationError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineItemActivityAssociationError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_ACTIVITY_FOR_ADVERTISER"/>
 *     &lt;enumeration value="INVALID_COST_TYPE_FOR_ASSOCIATION"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineItemActivityAssociationError.Reason")
@XmlEnum
public enum LineItemActivityAssociationErrorReason {


    /**
     * 
     *                 When associating an activity to a line item the activity must belong to the same
     *                 advertiser as the line item.
     *               
     * 
     */
    INVALID_ACTIVITY_FOR_ADVERTISER,

    /**
     * 
     *                 Activities can only be associated with line items of {@link CostType.CPA}.
     *               
     * 
     */
    INVALID_COST_TYPE_FOR_ASSOCIATION,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static LineItemActivityAssociationErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
