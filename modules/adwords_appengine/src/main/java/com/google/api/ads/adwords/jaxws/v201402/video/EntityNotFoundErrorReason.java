
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityNotFoundError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityNotFoundError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_ID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityNotFoundError.Reason")
@XmlEnum
public enum EntityNotFoundErrorReason {


    /**
     * 
     *                 The specified id refered to an entity which either doesn't exist or is not accessible to the
     *                 customer. e.g. campaign belongs to another customer.
     *               
     * 
     */
    INVALID_ID;

    public String value() {
        return name();
    }

    public static EntityNotFoundErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
