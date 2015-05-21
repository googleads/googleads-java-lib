
package com.google.api.ads.adwords.jaxws.v201502.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationExtension.Source.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationExtension.Source">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADWORDS_FRONTEND"/>
 *     &lt;enumeration value="LBC_SYNC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationExtension.Source")
@XmlEnum
public enum LocationExtensionSource {


    /**
     * 
     *                 From manual entry in adwords frontend
     *               
     * 
     */
    ADWORDS_FRONTEND,

    /**
     * 
     *                 From LBC business/address data
     *               
     * 
     */
    LBC_SYNC;

    public String value() {
        return name();
    }

    public static LocationExtensionSource fromValue(String v) {
        return valueOf(v);
    }

}
