
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="ARCHIVED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContentStatus")
@XmlEnum
public enum ContentStatus {


    /**
     * 
     *                 Indicates the {@link Content} has been created and is eligible to have
     *                 ads served against it.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 Indicates the {@link Content} has been deactivated and cannot have ads
     *                 served against it.
     *               
     * 
     */
    INACTIVE,

    /**
     * 
     *                 Indicates the {@link Content} has been archived; user-visible.
     *               
     * 
     */
    ARCHIVED,

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

    public static ContentStatus fromValue(String v) {
        return valueOf(v);
    }

}
