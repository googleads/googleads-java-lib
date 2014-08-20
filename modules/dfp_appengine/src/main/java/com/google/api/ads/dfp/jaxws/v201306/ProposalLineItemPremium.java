
package com.google.api.ads.dfp.jaxws.v201306;

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
 *         &lt;element name="rateCardCustomizationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201306}ProposalLineItemPremiumStatus" minOccurs="0"/>
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
    "rateCardCustomizationId",
    "status"
})
public class ProposalLineItemPremium {

    protected Long rateCardCustomizationId;
    protected ProposalLineItemPremiumStatus status;

    /**
     * Gets the value of the rateCardCustomizationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRateCardCustomizationId() {
        return rateCardCustomizationId;
    }

    /**
     * Sets the value of the rateCardCustomizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRateCardCustomizationId(Long value) {
        this.rateCardCustomizationId = value;
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
