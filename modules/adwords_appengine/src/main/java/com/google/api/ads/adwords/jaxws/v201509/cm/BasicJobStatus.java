
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasicJobStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BasicJobStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="PROCESSING"/>
 *     &lt;enumeration value="FAILED"/>
 *     &lt;enumeration value="PENDING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BasicJobStatus")
@XmlEnum
public enum BasicJobStatus {


    /**
     * 
     *                 The job has completed (successfully or otherwise) and all its complete
     *                 result is available.
     *               
     * 
     */
    COMPLETED,

    /**
     * 
     *                 The job is being actively processed by one or more tasks.
     *               
     * 
     */
    PROCESSING,

    /**
     * 
     *                 The job has encountered severe failures and could not be completed.
     *               
     * 
     */
    FAILED,

    /**
     * 
     *                 The job request has been received, and is pending receipt of additional
     *                 request parts, validation and assignment to tasks for processing.
     *               
     * 
     */
    PENDING;

    public String value() {
        return name();
    }

    public static BasicJobStatus fromValue(String v) {
        return valueOf(v);
    }

}
