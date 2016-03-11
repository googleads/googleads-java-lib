
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdUnitHierarchyError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdUnitHierarchyError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_DEPTH"/>
 *     &lt;enumeration value="INVALID_PARENT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdUnitHierarchyError.Reason")
@XmlEnum
public enum AdUnitHierarchyErrorReason {


    /**
     * 
     *                 The depth of the {@link AdUnit} in the inventory hierarchy is greater
     *                 than is allowed. The maximum allowed depth is two below the effective
     *                 root ad unit for Premium accounts and one level below effective root ad
     *                 unit for Small Business accounts.
     *               
     * 
     */
    INVALID_DEPTH,

    /**
     * 
     *                 The only valid {@link AdUnit#parentId} for a DFP Small Business account
     *                 is the {@link Network#effectiveRootAdUnitId}.
     *               
     * 
     */
    INVALID_PARENT,

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

    public static AdUnitHierarchyErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
