
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelEntityAssociationError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LabelEntityAssociationError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_COMPANY_TYPE"/>
 *     &lt;enumeration value="DUPLICATE_ASSOCIATION"/>
 *     &lt;enumeration value="INVALID_ASSOCIATION"/>
 *     &lt;enumeration value="DUPLICATE_ASSOCIATION_WITH_NEGATION"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LabelEntityAssociationError.Reason")
@XmlEnum
public enum LabelEntityAssociationErrorReason {


    /**
     * 
     *                 Labels can only be associated with {@link Company.Type#HOUSE_ADVERTISER},
     *                 {@link Company.Type#ADVERTISER} and {@link Company.Type#AD_NETWORK} type
     *                 of companies.
     *               
     * 
     */
    INVALID_COMPANY_TYPE,

    /**
     * 
     *                 The label has already been attached to the entity.
     *               
     * 
     */
    DUPLICATE_ASSOCIATION,

    /**
     * 
     *                 A label is being applied to an entity that does not support that entity
     *                 type.
     *               
     * 
     */
    INVALID_ASSOCIATION,

    /**
     * 
     *                 The same label is being applied and negated to the same entity.
     *               
     * 
     */
    DUPLICATE_ASSOCIATION_WITH_NEGATION,

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

    public static LabelEntityAssociationErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
