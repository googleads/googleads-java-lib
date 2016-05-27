
package com.google.api.ads.adwords.jaxws.v201605.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShoppingBiddingDimensionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShoppingBiddingDimensionStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="OBSOLETE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShoppingBiddingDimensionStatus")
@XmlEnum
public enum ShoppingBiddingDimensionStatus {


    /**
     * 
     *                 Default status. Should not be used.
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 The dimension is active and it can be used for bidding.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 The dimension is deprecated and should not be used for bidding.
     *               
     * 
     */
    OBSOLETE;

    public String value() {
        return name();
    }

    public static ShoppingBiddingDimensionStatus fromValue(String v) {
        return valueOf(v);
    }

}
