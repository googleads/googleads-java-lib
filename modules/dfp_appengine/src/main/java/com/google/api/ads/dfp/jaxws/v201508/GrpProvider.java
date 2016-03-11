
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrpProvider.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GrpProvider">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="NIELSEN"/>
 *     &lt;enumeration value="COMSCORE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GrpProvider")
@XmlEnum
public enum GrpProvider {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Indicates that GRP provider is Nielsen.
     *               
     * 
     */
    NIELSEN,

    /**
     * 
     *                 Indicates that GRP provider is Comscore.
     *               
     * 
     */
    COMSCORE;

    public String value() {
        return name();
    }

    public static GrpProvider fromValue(String v) {
        return valueOf(v);
    }

}
