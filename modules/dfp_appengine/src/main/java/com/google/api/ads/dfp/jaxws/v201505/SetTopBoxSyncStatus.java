
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetTopBoxSyncStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SetTopBoxSyncStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_READY"/>
 *     &lt;enumeration value="SYNC_PENDING"/>
 *     &lt;enumeration value="SYNCED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SetTopBoxSyncStatus")
@XmlEnum
public enum SetTopBoxSyncStatus {


    /**
     * 
     *                 The line item is not ready to be synced.
     *               
     * 
     */
    NOT_READY,

    /**
     * 
     *                 The line item is currently being synced.
     *               
     * 
     */
    SYNC_PENDING,

    /**
     * 
     *                 The line item has been synced.
     *               
     * 
     */
    SYNCED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static SetTopBoxSyncStatus fromValue(String v) {
        return valueOf(v);
    }

}
