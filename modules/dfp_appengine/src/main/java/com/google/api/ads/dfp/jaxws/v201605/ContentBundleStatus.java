
package com.google.api.ads.dfp.jaxws.v201605;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentBundleStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentBundleStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="ARCHIVED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContentBundleStatus")
@XmlEnum
public enum ContentBundleStatus {


    /**
     * 
     *                 The object is active and stats are collected.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 The object is no longer active and no stats collected.
     *               
     * 
     */
    INACTIVE,

    /**
     * 
     *                 The object has been archived.
     *               
     * 
     */
    ARCHIVED;

    public String value() {
        return name();
    }

    public static ContentBundleStatus fromValue(String v) {
        return valueOf(v);
    }

}
