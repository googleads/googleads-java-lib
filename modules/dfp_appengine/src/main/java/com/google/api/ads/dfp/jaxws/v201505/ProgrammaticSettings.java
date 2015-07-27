
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the additional settings of a programmatic order.
 *           
 * 
 * <p>Java class for ProgrammaticSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgrammaticSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adxBuyerNetworkId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="buyerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="buyerPlatform" type="{https://www.google.com/apis/ads/publisher/v201505}BuyerPlatform" minOccurs="0"/>
 *         &lt;element name="billingTermsType" type="{https://www.google.com/apis/ads/publisher/v201505}BillingTermsType" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201505}ProgrammaticStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgrammaticSettings", propOrder = {
    "adxBuyerNetworkId",
    "buyerId",
    "buyerPlatform",
    "billingTermsType",
    "status"
})
public class ProgrammaticSettings {

    protected Long adxBuyerNetworkId;
    protected Long buyerId;
    @XmlSchemaType(name = "string")
    protected BuyerPlatform buyerPlatform;
    @XmlSchemaType(name = "string")
    protected BillingTermsType billingTermsType;
    @XmlSchemaType(name = "string")
    protected ProgrammaticStatus status;

    /**
     * Gets the value of the adxBuyerNetworkId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdxBuyerNetworkId() {
        return adxBuyerNetworkId;
    }

    /**
     * Sets the value of the adxBuyerNetworkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdxBuyerNetworkId(Long value) {
        this.adxBuyerNetworkId = value;
    }

    /**
     * Gets the value of the buyerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBuyerId() {
        return buyerId;
    }

    /**
     * Sets the value of the buyerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBuyerId(Long value) {
        this.buyerId = value;
    }

    /**
     * Gets the value of the buyerPlatform property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerPlatform }
     *     
     */
    public BuyerPlatform getBuyerPlatform() {
        return buyerPlatform;
    }

    /**
     * Sets the value of the buyerPlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerPlatform }
     *     
     */
    public void setBuyerPlatform(BuyerPlatform value) {
        this.buyerPlatform = value;
    }

    /**
     * Gets the value of the billingTermsType property.
     * 
     * @return
     *     possible object is
     *     {@link BillingTermsType }
     *     
     */
    public BillingTermsType getBillingTermsType() {
        return billingTermsType;
    }

    /**
     * Sets the value of the billingTermsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingTermsType }
     *     
     */
    public void setBillingTermsType(BillingTermsType value) {
        this.billingTermsType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ProgrammaticStatus }
     *     
     */
    public ProgrammaticStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgrammaticStatus }
     *     
     */
    public void setStatus(ProgrammaticStatus value) {
        this.status = value;
    }

}
