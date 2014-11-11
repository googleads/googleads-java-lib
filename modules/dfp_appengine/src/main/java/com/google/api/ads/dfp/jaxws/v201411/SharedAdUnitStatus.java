
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SharedAdUnitStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SharedAdUnitStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="REJECTED"/>
 *     &lt;enumeration value="UNSHARED"/>
 *     &lt;enumeration value="PLACEHOLDER"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SharedAdUnitStatus")
@XmlEnum
public enum SharedAdUnitStatus {


    /**
     * 
     *                 The initial status of a shared ad unit; this indicates that a distributor network has
     *                 shared an ad unit with a content provider network, but the content provider has yet to
     *                 decide whether it's approved or rejected. In this case, the content provider will be unable to
     *                 target the corresponding ad unit, and thus, the content provider line items that target this
     *                 ad unit will not serve.
     *               
     * 
     */
    PENDING,

    /**
     * 
     *                 This indicates the content provider has approved the corresponding ad unit for shared selling.
     *                 The ad unit will now be eligible for targeting within the content provider network, and any
     *                 line items targeting this ad unit will be eligible to be served.
     *               
     * 
     */
    APPROVED,

    /**
     * 
     *                 This indicates the content provider has rejected the corresponding ad unit for shared selling.
     *                 The ad unit will not be eligible for targeting within the content provider network, and any
     *                 line items targeting this ad unit will not be eligible to be served.
     *               
     * 
     */
    REJECTED,

    /**
     * 
     *                 This indicates that a previously shared ad unit has now been unshared by the distributor
     *                 network. The corresponding ad unit will not be eligible for targeting within the content
     *                 provider network, and any line items targeting this ad unit will not be eligible to be served.
     *               
     * 
     */
    UNSHARED,

    /**
     * 
     *                 This indicates that the corresponding ad unit is an ancestor of a shared ad unit,
     *                 which is synchronized in order to maintain identical hierarchies between the distributor and
     *                 content provider networks. A content provider's line item which targets this ad unit will
     *                 serve, but only for requests from explicitly or implicitly shared lower-level ad units.
     *               
     * 
     */
    PLACEHOLDER,

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

    public static SharedAdUnitStatus fromValue(String v) {
        return valueOf(v);
    }

}
