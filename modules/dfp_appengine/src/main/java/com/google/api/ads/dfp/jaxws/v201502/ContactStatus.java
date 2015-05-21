
package com.google.api.ads.dfp.jaxws.v201502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contact.Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Contact.Status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNINVITED"/>
 *     &lt;enumeration value="INVITE_PENDNG"/>
 *     &lt;enumeration value="INVITE_EXPIRED"/>
 *     &lt;enumeration value="INVITE_CANCELED"/>
 *     &lt;enumeration value="USER_ACTIVE"/>
 *     &lt;enumeration value="USER_DISABLED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Contact.Status")
@XmlEnum
public enum ContactStatus {


    /**
     * 
     *                 The contact has not been invited to see their orders.
     *               
     * 
     */
    UNINVITED,

    /**
     * 
     *                 The contact has been invited to see their orders, but has not yet
     *                 accepted the invitation.
     *               
     * 
     */
    INVITE_PENDNG,

    /**
     * 
     *                 The contact has been invited to see their orders, but the invitation
     *                 has already expired.
     *               
     * 
     */
    INVITE_EXPIRED,

    /**
     * 
     *                 The contact was invited to see their orders, but the invitation was
     *                 cancelled.
     *               
     * 
     */
    INVITE_CANCELED,

    /**
     * 
     *                 The contact has access to login and view their orders.
     *               
     * 
     */
    USER_ACTIVE,

    /**
     * 
     *                 The contact accepted an invitation to see their orders, but their
     *                 access was later revoked.
     *               
     * 
     */
    USER_DISABLED,

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

    public static ContactStatus fromValue(String v) {
        return valueOf(v);
    }

}
