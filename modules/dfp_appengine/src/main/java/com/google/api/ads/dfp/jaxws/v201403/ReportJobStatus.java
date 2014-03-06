
package com.google.api.ads.dfp.jaxws.v201403;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportJobStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportJobStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="IN_PROGRESS"/>
 *     &lt;enumeration value="FAILED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportJobStatus")
@XmlEnum
public enum ReportJobStatus {


    /**
     * 
     *                 The {@link ReportJob} has completed successfully and is ready to download.
     *               
     * 
     */
    COMPLETED,

    /**
     * 
     *                 The {@link ReportJob} is still being executed.
     *               
     * 
     */
    IN_PROGRESS,

    /**
     * 
     *                 The {@link ReportJob} has failed to run to completion.
     *               
     * 
     */
    FAILED;

    public String value() {
        return name();
    }

    public static ReportJobStatus fromValue(String v) {
        return valueOf(v);
    }

}
