
package com.google.api.ads.adwords.jaxws.v201502.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Setting for shopping campaigns. Defines the universe of products covered by the campaign.
 *             Encapsulates a merchant ID, sales country, and campaign priority.
 *           
 * 
 * <p>Java class for ShoppingSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShoppingSetting">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201502}Setting">
 *       &lt;sequence>
 *         &lt;element name="merchantId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="salesCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campaignPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="enableLocal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingSetting", propOrder = {
    "merchantId",
    "salesCountry",
    "campaignPriority",
    "enableLocal"
})
public class ShoppingSetting
    extends Setting
{

    protected Long merchantId;
    protected String salesCountry;
    protected Integer campaignPriority;
    protected Boolean enableLocal;

    /**
     * Gets the value of the merchantId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMerchantId() {
        return merchantId;
    }

    /**
     * Sets the value of the merchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMerchantId(Long value) {
        this.merchantId = value;
    }

    /**
     * Gets the value of the salesCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesCountry() {
        return salesCountry;
    }

    /**
     * Sets the value of the salesCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesCountry(String value) {
        this.salesCountry = value;
    }

    /**
     * Gets the value of the campaignPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCampaignPriority() {
        return campaignPriority;
    }

    /**
     * Sets the value of the campaignPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCampaignPriority(Integer value) {
        this.campaignPriority = value;
    }

    /**
     * Gets the value of the enableLocal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableLocal() {
        return enableLocal;
    }

    /**
     * Sets the value of the enableLocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableLocal(Boolean value) {
        this.enableLocal = value;
    }

}
