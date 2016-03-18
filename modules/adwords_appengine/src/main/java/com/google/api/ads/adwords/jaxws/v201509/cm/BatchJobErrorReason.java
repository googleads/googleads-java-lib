
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchJobError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BatchJobError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="DISK_QUOTA_EXCEEDED"/>
 *     &lt;enumeration value="FAILED_TO_CREATE_JOB"/>
 *     &lt;enumeration value="INVALID_STATE_CHANGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BatchJobError.Reason")
@XmlEnum
public enum BatchJobErrorReason {

    UNKNOWN,

    /**
     * 
     *                 The user exceeded allowed disk quota for in-flight jobs.
     *               
     * 
     */
    DISK_QUOTA_EXCEEDED,

    /**
     * 
     *                 An internal error resulted in a failure to create the job.
     *               
     * 
     */
    FAILED_TO_CREATE_JOB,

    /**
     * 
     *                 The requested state change was invalid.
     *               
     * 
     */
    INVALID_STATE_CHANGE;

    public String value() {
        return name();
    }

    public static BatchJobErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
