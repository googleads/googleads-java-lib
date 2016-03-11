
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedAttributeReferenceError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedAttributeReferenceError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANNOT_REFERENCE_DELETED_FEED"/>
 *     &lt;enumeration value="INVALID_FEED_NAME"/>
 *     &lt;enumeration value="INVALID_FEED_ATTRIBUTE_NAME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeedAttributeReferenceError.Reason")
@XmlEnum
public enum FeedAttributeReferenceErrorReason {


    /**
     * 
     *                 A feed referenced by ID has been deleted.
     *               
     * 
     */
    CANNOT_REFERENCE_DELETED_FEED,

    /**
     * 
     *                 There is no active feed with the given name.
     *               
     * 
     */
    INVALID_FEED_NAME,

    /**
     * 
     *                 There is no feed attribute in an active feed with the given name.
     *               
     * 
     */
    INVALID_FEED_ATTRIBUTE_NAME;

    public String value() {
        return name();
    }

    public static FeedAttributeReferenceErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
