
package com.google.api.ads.dfp.jaxws.v201408;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentMetadataTargetingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentMetadataTargetingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VALUES_DO_NOT_BELONG_TO_A_HIERARCHY"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContentMetadataTargetingError.Reason")
@XmlEnum
public enum ContentMetadataTargetingErrorReason {


    /**
     * 
     *                 One or more of the values specified in a {@code ContentMetadataHierarchyTargeting}
     *                 do not belong to the keys defined in any of the hierarchies on the network.
     *               
     * 
     */
    VALUES_DO_NOT_BELONG_TO_A_HIERARCHY,

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

    public static ContentMetadataTargetingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
