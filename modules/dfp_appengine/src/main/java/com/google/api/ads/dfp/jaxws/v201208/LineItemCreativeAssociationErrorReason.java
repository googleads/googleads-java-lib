
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItemCreativeAssociationError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineItemCreativeAssociationError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREATIVE_IN_WRONG_ADVERTISERS_LIBRARY"/>
 *     &lt;enumeration value="INVALID_LINEITEM_CREATIVE_PAIRING"/>
 *     &lt;enumeration value="STARTDATE_BEFORE_LINEITEM_STARTDATE"/>
 *     &lt;enumeration value="STARTDATE_NOT_BEFORE_LINEITEM_ENDDATE"/>
 *     &lt;enumeration value="ENDDATE_AFTER_LINEITEM_ENDDATE"/>
 *     &lt;enumeration value="ENDDATE_NOT_AFTER_LINEITEM_STARTDATE"/>
 *     &lt;enumeration value="ENDDATE_NOT_AFTER_STARTDATE"/>
 *     &lt;enumeration value="ENDDATE_IN_THE_PAST"/>
 *     &lt;enumeration value="CANNOT_COPY_WITHIN_SAME_LINE_ITEM"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineItemCreativeAssociationError.Reason")
@XmlEnum
public enum LineItemCreativeAssociationErrorReason {


    /**
     * 
     *                 Cannot associate a creative to the wrong advertiser
     *               
     * 
     */
    CREATIVE_IN_WRONG_ADVERTISERS_LIBRARY,

    /**
     * 
     *                 The creative type being associated is a invalid for the line item type.
     *               
     * 
     */
    INVALID_LINEITEM_CREATIVE_PAIRING,

    /**
     * 
     *                 Association start date cannot be before line item start date
     *               
     * 
     */
    STARTDATE_BEFORE_LINEITEM_STARTDATE,

    /**
     * 
     *                 Association start date cannot be same as or after line item end date
     *               
     * 
     */
    STARTDATE_NOT_BEFORE_LINEITEM_ENDDATE,

    /**
     * 
     *                 Association end date cannot be after line item end date
     *               
     * 
     */
    ENDDATE_AFTER_LINEITEM_ENDDATE,

    /**
     * 
     *                 Association end date cannot be same as or before line item start date
     *               
     * 
     */
    ENDDATE_NOT_AFTER_LINEITEM_STARTDATE,

    /**
     * 
     *                 Association end date cannot be same as or before its start date
     *               
     * 
     */
    ENDDATE_NOT_AFTER_STARTDATE,

    /**
     * 
     *                 Association end date cannot be in the past.
     *               
     * 
     */
    ENDDATE_IN_THE_PAST,

    /**
     * 
     *                 Cannot copy an association to the same line item without
     *                 creating new creative
     *               
     * 
     */
    CANNOT_COPY_WITHIN_SAME_LINE_ITEM,

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

    public static LineItemCreativeAssociationErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
