
package com.google.api.ads.adwords.jaxws.v201309.mcm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlertType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCOUNT_ON_TARGET"/>
 *     &lt;enumeration value="DECLINED_PAYMENT"/>
 *     &lt;enumeration value="CREDIT_CARD_EXPIRING"/>
 *     &lt;enumeration value="ACCOUNT_BUDGET_ENDING"/>
 *     &lt;enumeration value="CAMPAIGN_ENDING"/>
 *     &lt;enumeration value="PAYMENT_NOT_ENTERED"/>
 *     &lt;enumeration value="MISSING_BANK_REFERENCE_NUMBER"/>
 *     &lt;enumeration value="CAMPAIGN_ENDED"/>
 *     &lt;enumeration value="ACCOUNT_BUDGET_BURN_RATE"/>
 *     &lt;enumeration value="USER_INVITE_PENDING"/>
 *     &lt;enumeration value="USER_INVITE_ACCEPTED"/>
 *     &lt;enumeration value="MANAGER_LINK_PENDING"/>
 *     &lt;enumeration value="ZERO_DAILY_SPENDING_LIMIT"/>
 *     &lt;enumeration value="TV_ACCOUNT_ON_TARGET"/>
 *     &lt;enumeration value="TV_ACCOUNT_BUDGET_ENDING"/>
 *     &lt;enumeration value="TV_ZERO_DAILY_SPENDING_LIMIT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlertType")
@XmlEnum
public enum AlertType {


    /**
     * 
     *                 The account budget has either been mostly or completely used.
     *               
     * 
     */
    ACCOUNT_ON_TARGET,

    /**
     * 
     *                 A payment was declined.
     *               
     * 
     */
    DECLINED_PAYMENT,

    /**
     * 
     *                 The credit card on file is expiring.
     *               
     * 
     */
    CREDIT_CARD_EXPIRING,

    /**
     * 
     *                 The end date on the account budget is approaching or has occurred.
     *               
     * 
     */
    ACCOUNT_BUDGET_ENDING,

    /**
     * 
     *                 A campaign's end date is approaching.
     *               
     * 
     */
    CAMPAIGN_ENDING,

    /**
     * 
     *                 The account does not yet have a payment method set up.
     *               
     * 
     */
    PAYMENT_NOT_ENTERED,

    /**
     * 
     *                 The account's payment method lacks a bank reference number.
     *               
     * 
     */
    MISSING_BANK_REFERENCE_NUMBER,

    /**
     * 
     *                 A campaign's end date is approaching.
     *               
     * 
     */
    CAMPAIGN_ENDED,

    /**
     * 
     *                 The account's prepay bank transfer balance is low.
     *               
     * 
     */
    ACCOUNT_BUDGET_BURN_RATE,

    /**
     * 
     *                 Confirmation of a user invitation is pending.
     *               
     * 
     */
    USER_INVITE_PENDING,

    /**
     * 
     *                 A user invitation has been accepted.
     *               
     * 
     */
    USER_INVITE_ACCEPTED,

    /**
     * 
     *                 A client manager invitation is pending.
     *               
     * 
     */
    MANAGER_LINK_PENDING,

    /**
     * 
     *                 This account has stopped serving due to a miscellaneous error.
     *               
     * 
     */
    ZERO_DAILY_SPENDING_LIMIT,

    /**
     * 
     *                 The TV account budget has either been mostly or completely used.
     *               
     * 
     */
    TV_ACCOUNT_ON_TARGET,

    /**
     * 
     *                 The end date on the TV account budget is approaching or has occurred.
     *               
     * 
     */
    TV_ACCOUNT_BUDGET_ENDING,

    /**
     * 
     *                 This TV account has stopped serving due to a miscellaneous error.
     *               
     * 
     */
    TV_ZERO_DAILY_SPENDING_LIMIT,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AlertType fromValue(String v) {
        return valueOf(v);
    }

}
