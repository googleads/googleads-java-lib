
package com.google.api.ads.dfp.jaxws.v201211;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentStatusDefinedBy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentStatusDefinedBy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CMS"/>
 *     &lt;enumeration value="USER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContentStatusDefinedBy")
@XmlEnum
public enum ContentStatusDefinedBy {


    /**
     * 
     *                 Indicates that the status of the {@code Content} is defined by the CMS.
     *               
     * 
     */
    CMS,

    /**
     * 
     *                 Indicates that the status of the {@code Content} is defined by the user.
     *               
     * 
     */
    USER;

    public String value() {
        return name();
    }

    public static ContentStatusDefinedBy fromValue(String v) {
        return valueOf(v);
    }

}
