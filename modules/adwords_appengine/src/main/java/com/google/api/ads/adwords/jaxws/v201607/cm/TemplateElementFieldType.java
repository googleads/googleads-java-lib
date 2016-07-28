
package com.google.api.ads.adwords.jaxws.v201607.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemplateElementField.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TemplateElementField.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADDRESS"/>
 *     &lt;enumeration value="AUDIO"/>
 *     &lt;enumeration value="ENUM"/>
 *     &lt;enumeration value="IMAGE"/>
 *     &lt;enumeration value="BACKGROUND_IMAGE"/>
 *     &lt;enumeration value="NUMBER"/>
 *     &lt;enumeration value="TEXT"/>
 *     &lt;enumeration value="URL"/>
 *     &lt;enumeration value="VIDEO"/>
 *     &lt;enumeration value="VISIBLE_URL"/>
 *     &lt;enumeration value="MEDIA_BUNDLE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TemplateElementField.Type")
@XmlEnum
public enum TemplateElementFieldType {


    /**
     * 
     *                 Address field type (text).
     *               
     * 
     */
    ADDRESS,

    /**
     * 
     *                 Audio field type (Media).
     *               
     * 
     */
    AUDIO,

    /**
     * 
     *                 Enum field type (text).
     *               
     * 
     */
    ENUM,

    /**
     * 
     *                 Image field type (Media).
     *               
     * 
     */
    IMAGE,

    /**
     * 
     *                 Background Image field type (Media).
     *               
     * 
     */
    BACKGROUND_IMAGE,

    /**
     * 
     *                 Number field type (text).
     *               
     * 
     */
    NUMBER,

    /**
     * 
     *                 Text field type (text).
     *               
     * 
     */
    TEXT,

    /**
     * 
     *                 URL field type (text).
     *               
     * 
     */
    URL,

    /**
     * 
     *                 Video field type (Media).
     *               
     * 
     */
    VIDEO,

    /**
     * 
     *                 Visible URL field type (text).
     *               
     * 
     */
    VISIBLE_URL,

    /**
     * 
     *                 A ZIP file containing HTML5 assets.
     *               
     * 
     */
    MEDIA_BUNDLE,

    /**
     * 
     *                 UNKNOWN type can not be passed as input.
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static TemplateElementFieldType fromValue(String v) {
        return valueOf(v);
    }

}
