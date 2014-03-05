
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentMetadataKeyHierarchyError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentMetadataKeyHierarchyError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LEVEL_MISSING"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContentMetadataKeyHierarchyError.Reason")
@XmlEnum
public enum ContentMetadataKeyHierarchyErrorReason {


    /**
     * 
     *                 One or more levels of the hierarchy are missing. For example, if the levels are {1, 2, 2}
     *                 or {1, 3, 4}, this error will be thrown.
     *               
     * 
     */
    LEVEL_MISSING,

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

    public static ContentMetadataKeyHierarchyErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
