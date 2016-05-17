
package com.google.api.ads.dfp.jaxws.v201605;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Company.CreditStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Company.CreditStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="ON_HOLD"/>
 *     &lt;enumeration value="CREDIT_STOP"/>
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="BLOCKED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Company.CreditStatus")
@XmlEnum
public enum CompanyCreditStatus {


    /**
     * 
     *                 When the credit status is active, all line items in all orders
     *                 belonging to the company will be served. This is a Basic as well as an
     *                 Advanced Credit Status setting.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 When the credit status is on hold, the publisher cannot activate new line
     *                 items of the company. However, line items that were activated before the
     *                 credit status change will remain active. You can still create orders and
     *                 line items for the company. This is an Advanced Credit Status setting.
     *               
     * 
     */
    ON_HOLD,

    /**
     * 
     *                 When the credit status is credit stop, the publisher cannot activate new
     *                 line items of the company. However, line items that were activated before
     *                 the credit status change will remain active. You cannot create any new
     *                 orders or line items for the company. This is an Advanced Credit Status
     *                 setting.
     *               
     * 
     */
    CREDIT_STOP,

    /**
     * 
     *                 When the credit status is inactive, the publisher cannot activate new
     *                 line items of the company. However, line items that were activated before
     *                 the credit status change will remain active. You cannot create any new
     *                 orders or line items for the company. It is used to mark companies with
     *                 which business is to be discontinued. Such companies are not listed in
     *                 Doubleclick for Publishers website. This is a Basic as well as an
     *                 Advanced Credit Status setting.
     *               
     * 
     */
    INACTIVE,

    /**
     * 
     *                 When the credit status of a company is marked blocked, then all active
     *                 line items belonging to the company will stop serving with immediate
     *                 effect. You cannot active new line items of the company nor can you
     *                 create any new orders or line items belonging to the company. This is an
     *                 Advanced Credit Status setting.
     *               
     * 
     */
    BLOCKED;

    public String value() {
        return name();
    }

    public static CompanyCreditStatus fromValue(String v) {
        return valueOf(v);
    }

}
