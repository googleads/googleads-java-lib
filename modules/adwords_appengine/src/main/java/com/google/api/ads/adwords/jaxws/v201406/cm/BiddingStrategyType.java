
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BiddingStrategyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BiddingStrategyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BUDGET_OPTIMIZER"/>
 *     &lt;enumeration value="CONVERSION_OPTIMIZER"/>
 *     &lt;enumeration value="MANUAL_CPC"/>
 *     &lt;enumeration value="MANUAL_CPM"/>
 *     &lt;enumeration value="PAGE_ONE_PROMOTED"/>
 *     &lt;enumeration value="PERCENT_CPA"/>
 *     &lt;enumeration value="TARGET_SPEND"/>
 *     &lt;enumeration value="ENHANCED_CPC"/>
 *     &lt;enumeration value="TARGET_CPA"/>
 *     &lt;enumeration value="TARGET_ROAS"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BiddingStrategyType")
@XmlEnum
public enum BiddingStrategyType {

    BUDGET_OPTIMIZER,
    CONVERSION_OPTIMIZER,
    MANUAL_CPC,
    MANUAL_CPM,
    PAGE_ONE_PROMOTED,
    PERCENT_CPA,
    TARGET_SPEND,
    ENHANCED_CPC,
    TARGET_CPA,
    TARGET_ROAS,

    /**
     * 
     *                 Special bidding strategy type used to reset the bidding strategy at AdGroup and
     *                 AdGroupCriterion.
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

    public static BiddingStrategyType fromValue(String v) {
        return valueOf(v);
    }

}
