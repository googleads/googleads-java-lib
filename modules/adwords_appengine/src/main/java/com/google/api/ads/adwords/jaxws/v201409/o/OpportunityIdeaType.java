
package com.google.api.ads.adwords.jaxws.v201409.o;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpportunityIdeaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OpportunityIdeaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KEYWORD"/>
 *     &lt;enumeration value="BID"/>
 *     &lt;enumeration value="BUDGET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OpportunityIdeaType")
@XmlEnum
public enum OpportunityIdeaType {


    /**
     * 
     *                 Keyword idea.
     *               
     * 
     */
    KEYWORD,

    /**
     * 
     *                 Bid idea.
     *               
     * 
     */
    BID,

    /**
     * 
     *                 Budget idea.
     *               
     * 
     */
    BUDGET;

    public String value() {
        return name();
    }

    public static OpportunityIdeaType fromValue(String v) {
        return valueOf(v);
    }

}
