
package com.google.api.ads.adwords.jaxws.v201607.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANNOT_CREATE_TABLE_ENTRY"/>
 *     &lt;enumeration value="NO_TABLE_ENTRY_CLASS_FOR_VIEW_TYPE"/>
 *     &lt;enumeration value="TABLE_SERVICE_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataError.Reason")
@XmlEnum
public enum DataErrorReason {

    CANNOT_CREATE_TABLE_ENTRY,
    NO_TABLE_ENTRY_CLASS_FOR_VIEW_TYPE,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    TABLE_SERVICE_ERROR;

    public String value() {
        return name();
    }

    public static DataErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
