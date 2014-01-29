
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericTargetingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GenericTargetingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONFLICTING_INCLUSION_OR_EXCLUSION_OF_SIBLINGS"/>
 *     &lt;enumeration value="INCLUDING_DESCENDANTS_OF_EXCLUDED_CRITERIA"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GenericTargetingError.Reason")
@XmlEnum
public enum GenericTargetingErrorReason {


    /**
     * 
     *                 Both including and excluding sibling criteria is disallowed.
     *               
     * 
     */
    CONFLICTING_INCLUSION_OR_EXCLUSION_OF_SIBLINGS,

    /**
     * 
     *                 Including descendants of excluded criteria is disallowed.
     *               
     * 
     */
    INCLUDING_DESCENDANTS_OF_EXCLUDED_CRITERIA,

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

    public static GenericTargetingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
