
package com.google.api.ads.adwords.jaxws.v201406.rm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="REMARKETING"/>
 *     &lt;enumeration value="LOGICAL"/>
 *     &lt;enumeration value="EXTERNAL_REMARKETING"/>
 *     &lt;enumeration value="SIMILAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserListType")
@XmlEnum
public enum UserListType {


    /**
     * 
     *                 UNKNOWN value can not be passed as input.
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 UserList represented as a collection of conversion types.
     *               
     * 
     */
    REMARKETING,

    /**
     * 
     *                 UserList represented as a combination of other user lists/interests.
     *               
     * 
     */
    LOGICAL,

    /**
     * 
     *                 UserList created in the DoubleClick platform.
     *               
     * 
     */
    EXTERNAL_REMARKETING,

    /**
     * 
     *                 UserList with users similar to users of another UserList.
     *               
     * 
     */
    SIMILAR;

    public String value() {
        return name();
    }

    public static UserListType fromValue(String v) {
        return valueOf(v);
    }

}
