
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetTopBoxCreativeError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SetTopBoxCreativeError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DURATION_IMMUTABLE"/>
 *     &lt;enumeration value="EXTERNAL_ASSET_ID_IMMUTABLE"/>
 *     &lt;enumeration value="EXTERNAL_ASSET_ID_REQUIRED"/>
 *     &lt;enumeration value="PROVIDER_ID_IMMUTABLE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SetTopBoxCreativeError.Reason")
@XmlEnum
public enum SetTopBoxCreativeErrorReason {


    /**
     * 
     *                 Set-top box creative durations are immutable after creation.
     *               
     * 
     */
    DURATION_IMMUTABLE,

    /**
     * 
     *                 Set-top box creative external asset IDs are immutable after creation.
     *               
     * 
     */
    EXTERNAL_ASSET_ID_IMMUTABLE,

    /**
     * 
     *                 Set-top box creatives require an external asset ID.
     *               
     * 
     */
    EXTERNAL_ASSET_ID_REQUIRED,

    /**
     * 
     *                 Set-top box creative provider IDs are immutable after creation.
     *               
     * 
     */
    PROVIDER_ID_IMMUTABLE,

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

    public static SetTopBoxCreativeErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
