
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchJobProcessingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BatchJobProcessingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="INPUT_FILE_CORRUPTION"/>
 *     &lt;enumeration value="FILE_FORMAT_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BatchJobProcessingError.Reason")
@XmlEnum
public enum BatchJobProcessingErrorReason {

    UNKNOWN,

    /**
     * 
     *                 The input file was corrupted.
     *               
     * 
     */
    INPUT_FILE_CORRUPTION,

    /**
     * 
     *                 The input file had a format error.
     *               
     * 
     */
    FILE_FORMAT_ERROR;

    public String value() {
        return name();
    }

    public static BatchJobProcessingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
