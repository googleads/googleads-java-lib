
package com.google.api.ads.adwords.jaxws.v201309.ch;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChangeStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FIELDS_UNCHANGED"/>
 *     &lt;enumeration value="FIELDS_CHANGED"/>
 *     &lt;enumeration value="NEW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChangeStatus")
@XmlEnum
public enum ChangeStatus {


    /**
     * 
     *                 The fields of this entity have not changed, but there may still be changes to its children.
     *               
     * 
     */
    FIELDS_UNCHANGED,

    /**
     * 
     *                 The fields of this entity have changed, for example the name of an adgroup.
     *               
     * 
     */
    FIELDS_CHANGED,

    /**
     * 
     *                 This entity was created during the time frame we're looking at.  We will not enumerate
     *                 all of the individual changes to this entity and its children.  Instead it should be loaded
     *                 from the appropriate service.
     *               
     * 
     */
    NEW;

    public String value() {
        return name();
    }

    public static ChangeStatus fromValue(String v) {
        return valueOf(v);
    }

}
