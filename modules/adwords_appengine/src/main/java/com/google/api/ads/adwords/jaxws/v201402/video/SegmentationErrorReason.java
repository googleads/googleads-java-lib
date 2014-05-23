
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegmentationError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SegmentationError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INCOMPATIBLE_DIMENSIONS"/>
 *     &lt;enumeration value="UNSUPPORTED_SEGMENTATION"/>
 *     &lt;enumeration value="MAXIMUM_SEGMENTATION_DIMENSIONS_EXCEEDED"/>
 *     &lt;enumeration value="DATE_RANGE_TOO_LONG"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SegmentationError.Reason")
@XmlEnum
public enum SegmentationErrorReason {


    /**
     * 
     *                 Choice of segmentation dimensions that cannot be simultaneously used.
     *               
     * 
     */
    INCOMPATIBLE_DIMENSIONS,
    UNSUPPORTED_SEGMENTATION,

    /**
     * 
     *                 User tried to segment by more dimensions than supported.
     *               
     * 
     */
    MAXIMUM_SEGMENTATION_DIMENSIONS_EXCEEDED,

    /**
     * 
     *                 The specified date range is too long for the given date segmentation.
     *               
     * 
     */
    DATE_RANGE_TOO_LONG,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static SegmentationErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
