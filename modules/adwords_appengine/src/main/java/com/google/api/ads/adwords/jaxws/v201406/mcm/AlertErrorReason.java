
package com.google.api.ads.adwords.jaxws.v201406.mcm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlertError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_CLIENT_IDS_SELECTED"/>
 *     &lt;enumeration value="INVALID_CLIENT_ID_SELECTED"/>
 *     &lt;enumeration value="INVALID_CLIENT_ID_FORMAT"/>
 *     &lt;enumeration value="UNAVAILABLE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlertError.Reason")
@XmlEnum
public enum AlertErrorReason {


    /**
     * 
     *                 Error indicating the {@link AlertQuery} used the
     *                 {@link com.google.ads.api.services.mcm.alerts.alert.ClientSpec#ID_LIST} option,
     *                 but failed to provide any customer IDs.
     *               
     * 
     */
    NO_CLIENT_IDS_SELECTED,

    /**
     * 
     *                 Error indicating a customer ID in the {@link AlertQuery} does not match a managed account.
     *               
     * 
     */
    INVALID_CLIENT_ID_SELECTED,

    /**
     * 
     *                 Error indicating a customer ID in the {@link AlertQuery} is not valid.
     *               
     * 
     */
    INVALID_CLIENT_ID_FORMAT,

    /**
     * 
     *                 Error indicating the backend is temporarily unavailable.
     *               
     * 
     */
    UNAVAILABLE,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AlertErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
