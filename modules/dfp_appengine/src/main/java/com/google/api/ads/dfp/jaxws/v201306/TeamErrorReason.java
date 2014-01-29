
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TeamError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TeamError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENTITY_NOT_ON_USERS_TEAMS"/>
 *     &lt;enumeration value="MISSING_USERS_TEAM"/>
 *     &lt;enumeration value="ALL_TEAM_ASSOCIATION_NOT_ALLOWED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TeamError.Reason")
@XmlEnum
public enum TeamErrorReason {


    /**
     * 
     *                 User cannot use this entity because it not on any of the user's teams.
     *               
     * 
     */
    ENTITY_NOT_ON_USERS_TEAMS,

    /**
     * 
     *                 Entity cannot be created because it is not on any of the user's teams.
     *               
     * 
     */
    MISSING_USERS_TEAM,

    /**
     * 
     *                 A team that gives access to all entities of a given type cannot be
     *                 associated with an entity of that type.
     *               
     * 
     */
    ALL_TEAM_ASSOCIATION_NOT_ALLOWED,

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

    public static TeamErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
