
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Feed.Origin.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Feed.Origin">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USER"/>
 *     &lt;enumeration value="ADWORDS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Feed.Origin")
@XmlEnum
public enum FeedOrigin {


    /**
     * 
     *                 This {@link Feed} was created by the user. FeedAttributes may therefore be added by the
     *                 user.
     *               
     * 
     */
    USER,

    /**
     * 
     *                 This {@link Feed} is managed automatically. The user cannot add more FeedAttributes.
     *               
     * 
     */
    ADWORDS,

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

    public static FeedOrigin fromValue(String v) {
        return valueOf(v);
    }

}
