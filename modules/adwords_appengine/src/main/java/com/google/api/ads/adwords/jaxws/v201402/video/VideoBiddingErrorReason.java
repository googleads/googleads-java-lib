
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoBiddingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoBiddingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BID_AMOUNT_REQUIRED"/>
 *     &lt;enumeration value="BID_TOO_SMALL"/>
 *     &lt;enumeration value="BID_TOO_BIG"/>
 *     &lt;enumeration value="BID_TOO_MANY_FRACTIONAL_DIGITS"/>
 *     &lt;enumeration value="BID_TOO_HIGH_FOR_DAILY_BUDGET"/>
 *     &lt;enumeration value="NON_POSITIVE_BID"/>
 *     &lt;enumeration value="BID_FOR_DEPRECATED_FORMAT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoBiddingError.Reason")
@XmlEnum
public enum VideoBiddingErrorReason {


    /**
     * 
     *                 Bid amount can not be null.
     *               
     * 
     */
    BID_AMOUNT_REQUIRED,

    /**
     * 
     *                 Bid amount is too small.
     *               
     * 
     */
    BID_TOO_SMALL,

    /**
     * 
     *                 Bid amount is too big.
     *               
     * 
     */
    BID_TOO_BIG,

    /**
     * 
     *                 Bid has too many fractional digit precision.
     *               
     * 
     */
    BID_TOO_MANY_FRACTIONAL_DIGITS,

    /**
     * 
     *                 Bid is too high for the daily budget.
     *               
     * 
     */
    BID_TOO_HIGH_FOR_DAILY_BUDGET,

    /**
     * 
     *                 Bids must have a positive amount.
     *               
     * 
     */
    NON_POSITIVE_BID,

    /**
     * 
     *                 A bid was specified for a deprecated format.
     *               
     * 
     */
    BID_FOR_DEPRECATED_FORMAT,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static VideoBiddingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
