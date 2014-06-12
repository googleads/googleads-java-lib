
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdGroupAdError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdGroupAdError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AD_NOT_UNDER_ADGROUP"/>
 *     &lt;enumeration value="CANNOT_OPERATE_ON_DELETED_ADGROUPAD"/>
 *     &lt;enumeration value="CANNOT_CREATE_DEPRECATED_ADS"/>
 *     &lt;enumeration value="EMPTY_FIELD"/>
 *     &lt;enumeration value="ENTITY_REFERENCED_IN_MULTIPLE_OPS"/>
 *     &lt;enumeration value="UNSUPPORTED_OPERATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdGroupAdError.Reason")
@XmlEnum
public enum AdGroupAdErrorReason {


    /**
     * 
     *                 The specified ad was not found in the adgroup
     *               
     * 
     */
    AD_NOT_UNDER_ADGROUP,

    /**
     * 
     *                 Removed ads may not be modified
     *               
     * 
     */
    CANNOT_OPERATE_ON_DELETED_ADGROUPAD,

    /**
     * 
     *                 An ad of this type is deprecated and cannot be created. Only deletions
     *                 are permitted.
     *               
     * 
     */
    CANNOT_CREATE_DEPRECATED_ADS,

    /**
     * 
     *                 A required field was not specified or is an empty string.
     *               
     * 
     */
    EMPTY_FIELD,

    /**
     * 
     *                 An ad may only be modified once per call
     *               
     * 
     */
    ENTITY_REFERENCED_IN_MULTIPLE_OPS,

    /**
     * 
     *                 The specified operation is not supported.  Only ADD, SET, and REMOVE
     *                 are supported
     *               
     * 
     */
    UNSUPPORTED_OPERATION;

    public String value() {
        return name();
    }

    public static AdGroupAdErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
