
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LabelError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DUPLICATE_NAME"/>
 *     &lt;enumeration value="INVALID_LABEL_NAME"/>
 *     &lt;enumeration value="INVALID_LABEL_TYPE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LabelError.Reason")
@XmlEnum
public enum LabelErrorReason {


    /**
     * 
     *                 Label name must be unique.
     *               
     * 
     */
    DUPLICATE_NAME,

    /**
     * 
     *                 Label names cannot be empty
     *               
     * 
     */
    INVALID_LABEL_NAME,

    /**
     * 
     *                 Invalid Label type. A specific type of Label is required.
     *               
     * 
     */
    INVALID_LABEL_TYPE,

    /**
     * 
     *                 Default error.
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static LabelErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
