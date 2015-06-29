
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemServingStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SystemServingStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ELIGIBLE"/>
 *     &lt;enumeration value="RARELY_SERVED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SystemServingStatus")
@XmlEnum
public enum SystemServingStatus {


    /**
     * 
     *                 Criterion is eligible to serve.
     *                 Not rarely served and not inactive for search.
     *               
     * 
     */
    ELIGIBLE,

    /**
     * 
     *                 Rarely served. Criteria.isRarelyServed is true.
     *               
     * 
     */
    RARELY_SERVED;

    public String value() {
        return name();
    }

    public static SystemServingStatus fromValue(String v) {
        return valueOf(v);
    }

}
