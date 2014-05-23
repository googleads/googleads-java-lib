
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetingGroupError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TargetingGroupError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="DUPLICATE_TARGETING_GROUP_ID"/>
 *     &lt;enumeration value="DUPLICATE_TARGETING_GROUP_NAME"/>
 *     &lt;enumeration value="DETECTED_DUPLICATE_TARGETING_GROUP_NAME"/>
 *     &lt;enumeration value="IMMUTABLE_FIELD"/>
 *     &lt;enumeration value="INVALID_TARGETING_GROUP_ID"/>
 *     &lt;enumeration value="INVALID_TARGETING_GROUP_NAME"/>
 *     &lt;enumeration value="NOT_PERSISTENT"/>
 *     &lt;enumeration value="TARGETING_GROUP_NOT_FOUND"/>
 *     &lt;enumeration value="TOO_MANY_TARGETING_GROUPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TargetingGroupError.Reason")
@XmlEnum
public enum TargetingGroupErrorReason {


    /**
     * 
     *                 Default error.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Another targeting group with the same id already exists.
     *               
     * 
     */
    DUPLICATE_TARGETING_GROUP_ID,

    /**
     * 
     *                 Targeting group name already exists.
     *               
     * 
     */
    DUPLICATE_TARGETING_GROUP_NAME,

    /**
     * 
     *                 There are duplicated targeting group names in the storage.
     *               
     * 
     */
    DETECTED_DUPLICATE_TARGETING_GROUP_NAME,

    /**
     * 
     *                 Trying to change a immutable field.
     *               
     * 
     */
    IMMUTABLE_FIELD,

    /**
     * 
     *                 Targeting group id is invalid in the operation context.
     *               
     * 
     */
    INVALID_TARGETING_GROUP_ID,

    /**
     * 
     *                 Targeting group name cannot be used.
     *               
     * 
     */
    INVALID_TARGETING_GROUP_NAME,

    /**
     * 
     *                 Trying to set values on a targeting group that is not persistent.
     *               
     * 
     */
    NOT_PERSISTENT,

    /**
     * 
     *                 Targeting group for set operation not found.
     *               
     * 
     */
    TARGETING_GROUP_NOT_FOUND,

    /**
     * 
     *                 Too many targeting group in this campaign.
     *               
     * 
     */
    TOO_MANY_TARGETING_GROUPS;

    public String value() {
        return name();
    }

    public static TargetingGroupErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
