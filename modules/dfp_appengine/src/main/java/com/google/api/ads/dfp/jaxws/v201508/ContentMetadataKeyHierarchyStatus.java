
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentMetadataKeyHierarchyStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentMetadataKeyHierarchyStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="DELETED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContentMetadataKeyHierarchyStatus")
@XmlEnum
public enum ContentMetadataKeyHierarchyStatus {


    /**
     * 
     *                 The hierarchy is active and user-visable.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 The hierarchy is deleted and not user-visable.
     *               
     * 
     */
    DELETED,

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

    public static ContentMetadataKeyHierarchyStatus fromValue(String v) {
        return valueOf(v);
    }

}
