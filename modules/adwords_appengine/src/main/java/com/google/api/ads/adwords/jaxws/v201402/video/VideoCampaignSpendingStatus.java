
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoCampaign.SpendingStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoCampaign.SpendingStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNAVAILABLE"/>
 *     &lt;enumeration value="SUSPENDED"/>
 *     &lt;enumeration value="CONSTRAINED"/>
 *     &lt;enumeration value="NON_CONSTRAINED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoCampaign.SpendingStatus")
@XmlEnum
public enum VideoCampaignSpendingStatus {

    UNAVAILABLE,

    /**
     * 
     *                 The campaign does not serve because there is no fund in the owner account.
     *               
     * 
     */
    SUSPENDED,

    /**
     * 
     *                 The spending is constrained by the daily budget.
     *               
     * 
     */
    CONSTRAINED,

    /**
     * 
     *                 The spending is not constrained by the daily budget.
     *               
     * 
     */
    NON_CONSTRAINED;

    public String value() {
        return name();
    }

    public static VideoCampaignSpendingStatus fromValue(String v) {
        return valueOf(v);
    }

}
