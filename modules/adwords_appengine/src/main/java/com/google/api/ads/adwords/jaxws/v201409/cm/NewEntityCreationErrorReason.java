
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewEntityCreationError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NewEntityCreationError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANNOT_SET_ID_FOR_ADD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NewEntityCreationError.Reason")
@XmlEnum
public enum NewEntityCreationErrorReason {


    /**
     * 
     *                 Do not set the id field while creating new entities.
     *               
     * 
     */
    CANNOT_SET_ID_FOR_ADD;

    public String value() {
        return name();
    }

    public static NewEntityCreationErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
