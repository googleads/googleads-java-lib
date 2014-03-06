
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NON_UNIQUE_NAME"/>
 *     &lt;enumeration value="FILE_NAME_TOO_LONG"/>
 *     &lt;enumeration value="FILE_SIZE_TOO_LARGE"/>
 *     &lt;enumeration value="MISSING_REQUIRED_DYNAMIC_ALLOCATION_CLIENT"/>
 *     &lt;enumeration value="MISSING_REQUIRED_DYNAMIC_ALLOCATION_HEIGHT"/>
 *     &lt;enumeration value="MISSING_REQUIRED_DYNAMIC_ALLOCATION_WIDTH"/>
 *     &lt;enumeration value="MISSING_REQUIRED_DYNAMIC_ALLOCATION_FORMAT"/>
 *     &lt;enumeration value="INVALID_CODE_SNIPPET_PARAMETER_VALUE"/>
 *     &lt;enumeration value="INVALID_ASSET_ID"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssetError.Reason")
@XmlEnum
public enum AssetErrorReason {


    /**
     * 
     *                 An asset name must be unique across advertiser.
     *               
     * 
     */
    NON_UNIQUE_NAME,

    /**
     * 
     *                 The file name is too long.
     *               
     * 
     */
    FILE_NAME_TOO_LONG,

    /**
     * 
     *                 The file size is too large.
     *               
     * 
     */
    FILE_SIZE_TOO_LARGE,

    /**
     * 
     *                 Required client code is not present in the code snippet.
     *               
     * 
     */
    MISSING_REQUIRED_DYNAMIC_ALLOCATION_CLIENT,

    /**
     * 
     *                 Required height is not present in the code snippet.
     *               
     * 
     */
    MISSING_REQUIRED_DYNAMIC_ALLOCATION_HEIGHT,

    /**
     * 
     *                 Required width is not present in the code snippet.
     *               
     * 
     */
    MISSING_REQUIRED_DYNAMIC_ALLOCATION_WIDTH,

    /**
     * 
     *                 Required format is not present in the mobile code snippet.
     *               
     * 
     */
    MISSING_REQUIRED_DYNAMIC_ALLOCATION_FORMAT,

    /**
     * 
     *                 The parameter value in the code snippet is invalid.
     *               
     * 
     */
    INVALID_CODE_SNIPPET_PARAMETER_VALUE,

    /**
     * 
     *                 Invalid asset Id.
     *               
     * 
     */
    INVALID_ASSET_ID,

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

    public static AssetErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
