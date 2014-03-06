
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PagingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PagingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="START_INDEX_CANNOT_BE_NEGATIVE"/>
 *     &lt;enumeration value="NUMBER_OF_RESULTS_CANNOT_BE_NEGATIVE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PagingError.Reason")
@XmlEnum
public enum PagingErrorReason {

    START_INDEX_CANNOT_BE_NEGATIVE,
    NUMBER_OF_RESULTS_CANNOT_BE_NEGATIVE,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static PagingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
