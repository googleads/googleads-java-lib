
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryUnitPartnerAssociationError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InventoryUnitPartnerAssociationError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANCESTOR_AD_UNIT_HAS_PARTNER_ASSOCIATION"/>
 *     &lt;enumeration value="DESCENDANT_AD_UNIT_HAS_PARTNER_ASSOCIATION"/>
 *     &lt;enumeration value="SAME_PARTNER_ASSOCIATION_IN_INVENTORY_HIERARCHY"/>
 *     &lt;enumeration value="NO_PARTNER_CATCH_ALL"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InventoryUnitPartnerAssociationError.Reason")
@XmlEnum
public enum InventoryUnitPartnerAssociationErrorReason {


    /**
     * 
     *                 Indicates the error that the ancestor inventory unit has already been associated to
     *                 a partner.
     *               
     * 
     */
    ANCESTOR_AD_UNIT_HAS_PARTNER_ASSOCIATION,

    /**
     * 
     *                 Indicates the error that at least one of the descendant inventory units have already
     *                 been associated to a partner.
     *               
     * 
     */
    DESCENDANT_AD_UNIT_HAS_PARTNER_ASSOCIATION,

    /**
     * 
     *                 Indicates the error that the partner intended to be associated has already
     *                 been associated to another inventory unit in this network.
     *               
     * 
     */
    SAME_PARTNER_ASSOCIATION_IN_INVENTORY_HIERARCHY,

    /**
     * 
     *                 Indicates the error that the partner intended to be associated has no default
     *                 financial term. Default financial term is essential for those partner associating with
     *                 inventory units.
     *               
     * 
     */
    NO_PARTNER_CATCH_ALL,

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

    public static InventoryUnitPartnerAssociationErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
