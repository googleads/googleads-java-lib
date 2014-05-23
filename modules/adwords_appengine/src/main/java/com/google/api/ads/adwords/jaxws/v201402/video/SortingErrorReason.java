
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SORT_ORDER_MISMATCH"/>
 *     &lt;enumeration value="INVALID_FIELD"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SortingError.Reason")
@XmlEnum
public enum SortingErrorReason {


    /**
     * 
     *                 Mismatch between the lists of fields specified for sorting and
     *                 corresponding sort order.
     *               
     * 
     */
    SORT_ORDER_MISMATCH,

    /**
     * 
     *                 Unsupported or invalid field specified for sorting.
     *               
     * 
     */
    INVALID_FIELD,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static SortingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
