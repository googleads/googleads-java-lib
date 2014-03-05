
package com.google.api.ads.dfp.jaxws.v201403;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The group of rate card customiations.
 *           
 * 
 * <p>Java class for RateCardCustomizationGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateCardCustomizationGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rateCardId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pricingMethod" type="{https://www.google.com/apis/ads/publisher/v201403}PricingMethod" minOccurs="0"/>
 *         &lt;element name="rateCardFeature" type="{https://www.google.com/apis/ads/publisher/v201403}RateCardFeature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateCardCustomizationGroup", propOrder = {
    "id",
    "rateCardId",
    "pricingMethod",
    "rateCardFeature"
})
public class RateCardCustomizationGroup {

    protected Long id;
    protected Long rateCardId;
    protected PricingMethod pricingMethod;
    protected RateCardFeature rateCardFeature;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the rateCardId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRateCardId() {
        return rateCardId;
    }

    /**
     * Sets the value of the rateCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRateCardId(Long value) {
        this.rateCardId = value;
    }

    /**
     * Gets the value of the pricingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PricingMethod }
     *     
     */
    public PricingMethod getPricingMethod() {
        return pricingMethod;
    }

    /**
     * Sets the value of the pricingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingMethod }
     *     
     */
    public void setPricingMethod(PricingMethod value) {
        this.pricingMethod = value;
    }

    /**
     * Gets the value of the rateCardFeature property.
     * 
     * @return
     *     possible object is
     *     {@link RateCardFeature }
     *     
     */
    public RateCardFeature getRateCardFeature() {
        return rateCardFeature;
    }

    /**
     * Sets the value of the rateCardFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCardFeature }
     *     
     */
    public void setRateCardFeature(RateCardFeature value) {
        this.rateCardFeature = value;
    }

}
