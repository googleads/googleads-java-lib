
package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MISSING_CONTENTS"/>
 *     &lt;enumeration value="SIZE_TOO_LARGE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FileError.Reason")
@XmlEnum
public enum FileErrorReason {


    /**
     * 
     *                 The provided byte array is empty.
     *               
     * 
     */
    MISSING_CONTENTS,

    /**
     * 
     *                 The provided file is larger than the maximum size defined for the
     *                 network.
     *               
     * 
     */
    SIZE_TOO_LARGE,

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

    public static FileErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
