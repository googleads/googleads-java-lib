
package com.google.api.ads.adwords.jaxws.v201601.cm;

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
 *     &lt;enumeration value="DUPLICATE_TEMP_IDS"/>
 *     &lt;enumeration value="TEMP_ID_ENTITY_HAD_ERRORS"/>
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
    CANNOT_SET_ID_FOR_ADD,

    /**
     * 
     *                 Creating more than one entity with the same temp ID is not allowed.
     *               
     * 
     */
    DUPLICATE_TEMP_IDS,

    /**
     * 
     *                 Parent object with specified temp id failed validation, so no deep
     *                 validation will be done for this child entity.
     *               
     * 
     */
    TEMP_ID_ENTITY_HAD_ERRORS;

    public String value() {
        return name();
    }

    public static NewEntityCreationErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
