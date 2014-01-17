
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItemCreativeAssociationOperationError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineItemCreativeAssociationOperationError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_ALLOWED"/>
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *     &lt;enumeration value="CANNOT_ACTIVATE_INVALID_CREATIVE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineItemCreativeAssociationOperationError.Reason")
@XmlEnum
public enum LineItemCreativeAssociationOperationErrorReason {


    /**
     * 
     *                 The operation is not allowed due to permissions
     *               
     * 
     */
    NOT_ALLOWED,

    /**
     * 
     *                 The operation is not applicable to the current state
     *               
     * 
     */
    NOT_APPLICABLE,

    /**
     * 
     *                 Cannot activate an invalid creative
     *               
     * 
     */
    CANNOT_ACTIVATE_INVALID_CREATIVE,

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

    public static LineItemCreativeAssociationOperationErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
