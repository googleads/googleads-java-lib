
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the status of a triggered {@link PremiumRateValue} (formerly
 *             referred to as a {@code RateCardCustomization}).
 *           
 * 
 * <p>Java class for ProposalLineItemPremium complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProposalLineItemPremium">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="premiumRateValue" type="{https://www.google.com/apis/ads/publisher/v201411}PremiumRateValue" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201411}ProposalLineItemPremiumStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProposalLineItemPremium", propOrder = {
    "premiumRateValue",
    "status"
})
public class ProposalLineItemPremium {

    protected PremiumRateValue premiumRateValue;
    protected ProposalLineItemPremiumStatus status;

    /**
     * Gets the value of the premiumRateValue property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumRateValue }
     *     
     */
    public PremiumRateValue getPremiumRateValue() {
        return premiumRateValue;
    }

    /**
     * Sets the value of the premiumRateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumRateValue }
     *     
     */
    public void setPremiumRateValue(PremiumRateValue value) {
        this.premiumRateValue = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ProposalLineItemPremiumStatus }
     *     
     */
    public ProposalLineItemPremiumStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProposalLineItemPremiumStatus }
     *     
     */
    public void setStatus(ProposalLineItemPremiumStatus value) {
        this.status = value;
    }

}
