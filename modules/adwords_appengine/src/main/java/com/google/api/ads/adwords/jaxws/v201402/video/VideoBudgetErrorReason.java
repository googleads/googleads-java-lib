
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoBudgetError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoBudgetError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MONEY_AMOUNT_LESS_THAN_CURRENCY_MINIMUM_CPC"/>
 *     &lt;enumeration value="MONEY_AMOUNT_LESS_THAN_MAXIMUM_AD_GROUP_CPM"/>
 *     &lt;enumeration value="MONEY_AMOUNT_LESS_THAN_MAXIMUM_SITE_CPM"/>
 *     &lt;enumeration value="MONEY_AMOUNT_LESS_THAN_MINIMUM_AD_GROUP_CPC"/>
 *     &lt;enumeration value="MONEY_AMOUNT_LESS_THAN_MINIMUM_CRITERIA_CPC"/>
 *     &lt;enumeration value="MONEY_AMOUNT_TOO_LARGE"/>
 *     &lt;enumeration value="NON_MULTIPLE_OF_MINIMUM_CURRENCY_UNIT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoBudgetError.Reason")
@XmlEnum
public enum VideoBudgetErrorReason {


    /**
     * 
     *                 A money amount was less than the minimum CPC for currency.
     *               
     * 
     */
    MONEY_AMOUNT_LESS_THAN_CURRENCY_MINIMUM_CPC,

    /**
     * 
     *                 A money amount was less than the maximum ad group CPM.
     *               
     * 
     */
    MONEY_AMOUNT_LESS_THAN_MAXIMUM_AD_GROUP_CPM,

    /**
     * 
     *                 A money amount was less than the maximum site CPM.
     *               
     * 
     */
    MONEY_AMOUNT_LESS_THAN_MAXIMUM_SITE_CPM,

    /**
     * 
     *                 A money amount was less than the minimum ad group CPC.
     *               
     * 
     */
    MONEY_AMOUNT_LESS_THAN_MINIMUM_AD_GROUP_CPC,

    /**
     * 
     *                 A money amount was less than the minimum criteria CPC.
     *               
     * 
     */
    MONEY_AMOUNT_LESS_THAN_MINIMUM_CRITERIA_CPC,

    /**
     * 
     *                 A money amount was greater than the maximum allowed.
     *               
     * 
     */
    MONEY_AMOUNT_TOO_LARGE,

    /**
     * 
     *                 A money amount was not a multiple of a minimum unit.
     *               
     * 
     */
    NON_MULTIPLE_OF_MINIMUM_CURRENCY_UNIT,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static VideoBudgetErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
