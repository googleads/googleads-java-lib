
package com.google.api.ads.dfp.jaxws.v201502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItemCreativeAssociation.Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineItemCreativeAssociation.Status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="NOT_SERVING"/>
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="DELETED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineItemCreativeAssociation.Status")
@XmlEnum
public enum LineItemCreativeAssociationStatus {


    /**
     * 
     *                 The association is active and the associated {@link Creative} can be
     *                 served.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 The association is active but the associated {@link Creative} may not be
     *                 served, because its size is not targeted by the line item.
     *               
     * 
     */
    NOT_SERVING,

    /**
     * 
     *                 The association is inactive and the associated {@link Creative} is
     *                 ineligible for being served.
     *               
     * 
     */
    INACTIVE,

    /**
     * 
     *                 The association is deleted and the associated {@link Creative} is
     *                 ineligible for being served.
     *               
     * 
     */
    DELETED,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API
     *                 version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static LineItemCreativeAssociationStatus fromValue(String v) {
        return valueOf(v);
    }

}
