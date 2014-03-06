
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A customization of a {@link RateCard} which could be applied to the line item
 *             and charges extra premiums.
 *           
 * 
 * <p>Java class for RateCardCustomization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateCardCustomization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rateCardId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201311}RateCardCustomizationStatus" minOccurs="0"/>
 *         &lt;element name="rateCardFeature" type="{https://www.google.com/apis/ads/publisher/v201311}RateCardFeature" minOccurs="0"/>
 *         &lt;element name="adjustmentType" type="{https://www.google.com/apis/ads/publisher/v201311}RateCardCustomizationAdjustmentType" minOccurs="0"/>
 *         &lt;element name="adjustmentSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rateType" type="{https://www.google.com/apis/ads/publisher/v201311}RateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateCardCustomization", propOrder = {
    "rateCardId",
    "id",
    "status",
    "rateCardFeature",
    "adjustmentType",
    "adjustmentSize",
    "rateType"
})
public class RateCardCustomization {

    protected Long rateCardId;
    protected Long id;
    protected RateCardCustomizationStatus status;
    protected RateCardFeature rateCardFeature;
    protected RateCardCustomizationAdjustmentType adjustmentType;
    protected Long adjustmentSize;
    protected RateType rateType;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RateCardCustomizationStatus }
     *     
     */
    public RateCardCustomizationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCardCustomizationStatus }
     *     
     */
    public void setStatus(RateCardCustomizationStatus value) {
        this.status = value;
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

    /**
     * Gets the value of the adjustmentType property.
     * 
     * @return
     *     possible object is
     *     {@link RateCardCustomizationAdjustmentType }
     *     
     */
    public RateCardCustomizationAdjustmentType getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * Sets the value of the adjustmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCardCustomizationAdjustmentType }
     *     
     */
    public void setAdjustmentType(RateCardCustomizationAdjustmentType value) {
        this.adjustmentType = value;
    }

    /**
     * Gets the value of the adjustmentSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdjustmentSize() {
        return adjustmentSize;
    }

    /**
     * Sets the value of the adjustmentSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdjustmentSize(Long value) {
        this.adjustmentSize = value;
    }

    /**
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link RateType }
     *     
     */
    public RateType getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType }
     *     
     */
    public void setRateType(RateType value) {
        this.rateType = value;
    }

}
