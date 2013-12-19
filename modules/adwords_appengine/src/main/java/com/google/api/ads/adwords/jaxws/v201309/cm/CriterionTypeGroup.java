
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CriterionTypeGroup.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CriterionTypeGroup">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KEYWORD"/>
 *     &lt;enumeration value="USER_INTEREST_AND_LIST"/>
 *     &lt;enumeration value="VERTICAL"/>
 *     &lt;enumeration value="GENDER"/>
 *     &lt;enumeration value="AGE_RANGE"/>
 *     &lt;enumeration value="PLACEMENT"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CriterionTypeGroup")
@XmlEnum
public enum CriterionTypeGroup {


    /**
     * 
     *                 Criteria for targeting keywords. e.g. 'mars cruise'
     *                 KEYWORD may be used as a content bid dimension. Keywords are always a targeting dimension,
     *                 so may not be set as a target "ALL" dimension with {@link TargetRestriction}.
     *               
     * 
     */
    KEYWORD,

    /**
     * 
     *                 Criteria for targeting lists of users.  Lists may represent users with particular
     *                 interests, or they may represent users who have interacted with an advertiser's site in
     *                 particular ways.
     *               
     * 
     */
    USER_INTEREST_AND_LIST,

    /**
     * 
     *                 Criteria for targeting similar categories of placements, e.g. 'category::Animals>Pets'
     *                 Used only for content network targeting.
     *               
     * 
     */
    VERTICAL,

    /**
     * 
     *                 Criteria for targeting gender.
     *               
     * 
     */
    GENDER,

    /**
     * 
     *                 Criteria for targeting age ranges.
     *               
     * 
     */
    AGE_RANGE,

    /**
     * 
     *                 Criteria for targeting placements. aka Website. e.g. 'www.flowers4sale.com'
     *                 This group also includes mobile applications and mobile app categories.
     *               
     * 
     */
    PLACEMENT,

    /**
     * 
     *                 Special criteria type group used to reset the existing value.
     *               
     * 
     */
    NONE,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CriterionTypeGroup fromValue(String v) {
        return valueOf(v);
    }

}
