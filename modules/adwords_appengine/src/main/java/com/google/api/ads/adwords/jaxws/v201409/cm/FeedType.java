
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Feed.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Feed.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="SITELINK"/>
 *     &lt;enumeration value="CALL"/>
 *     &lt;enumeration value="APP"/>
 *     &lt;enumeration value="REVIEW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Feed.Type")
@XmlEnum
public enum FeedType {

    NONE,

    /**
     * 
     *                 Sitelink placeholder typed
     *               
     * 
     */
    SITELINK,

    /**
     * 
     *                 Call placeholder typed
     *               
     * 
     */
    CALL,

    /**
     * 
     *                 App placeholder typed
     *               
     * 
     */
    APP,

    /**
     * 
     *                 Review placeholder typed
     *               
     * 
     */
    REVIEW;

    public String value() {
        return name();
    }

    public static FeedType fromValue(String v) {
        return valueOf(v);
    }

}
