
package com.google.api.ads.dfp.jaxws.v201302;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemplateInstantiatedCreativeError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TemplateInstantiatedCreativeError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INACTIVE_CREATIVE_TEMPLATE"/>
 *     &lt;enumeration value="FILE_TYPE_NOT_ALLOWED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TemplateInstantiatedCreativeError.Reason")
@XmlEnum
public enum TemplateInstantiatedCreativeErrorReason {


    /**
     * 
     *                 A new creative cannot be created from an inactive creative template.
     *               
     * 
     */
    INACTIVE_CREATIVE_TEMPLATE,

    /**
     * 
     *                 An uploaded file type is not allowed
     *               
     * 
     */
    FILE_TYPE_NOT_ALLOWED,

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

    public static TemplateInstantiatedCreativeErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
