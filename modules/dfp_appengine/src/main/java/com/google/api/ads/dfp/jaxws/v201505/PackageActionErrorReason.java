
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageActionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PackageActionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROPOSAL_LINE_ITEMS_HAVE_BEEN_CREATED"/>
 *     &lt;enumeration value="PROPOSAL_NOT_EDITABLE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PackageActionError.Reason")
@XmlEnum
public enum PackageActionErrorReason {


    /**
     * 
     *                 The operation is not applicable because the proposal line items under these packages
     *                 have already been created.
     *               
     * 
     */
    PROPOSAL_LINE_ITEMS_HAVE_BEEN_CREATED,

    /**
     * 
     *                 The operation is not applicable because the containing proposal is not editable.
     *               
     * 
     */
    PROPOSAL_NOT_EDITABLE,

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

    public static PackageActionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
