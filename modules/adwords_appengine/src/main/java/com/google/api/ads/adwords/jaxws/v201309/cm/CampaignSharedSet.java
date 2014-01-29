
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignSharedSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignSharedSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sharedSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sharedSetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sharedSetType" type="{https://adwords.google.com/api/adwords/cm/v201309}SharedSetType" minOccurs="0"/>
 *         &lt;element name="campaignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201309}CampaignSharedSet.Status" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignSharedSet", propOrder = {
    "sharedSetId",
    "campaignId",
    "sharedSetName",
    "sharedSetType",
    "campaignName",
    "status"
})
public class CampaignSharedSet {

    protected Long sharedSetId;
    protected Long campaignId;
    protected String sharedSetName;
    protected SharedSetType sharedSetType;
    protected String campaignName;
    protected CampaignSharedSetStatus status;

    /**
     * Gets the value of the sharedSetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSharedSetId() {
        return sharedSetId;
    }

    /**
     * Sets the value of the sharedSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSharedSetId(Long value) {
        this.sharedSetId = value;
    }

    /**
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCampaignId(Long value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the sharedSetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedSetName() {
        return sharedSetName;
    }

    /**
     * Sets the value of the sharedSetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedSetName(String value) {
        this.sharedSetName = value;
    }

    /**
     * Gets the value of the sharedSetType property.
     * 
     * @return
     *     possible object is
     *     {@link SharedSetType }
     *     
     */
    public SharedSetType getSharedSetType() {
        return sharedSetType;
    }

    /**
     * Sets the value of the sharedSetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedSetType }
     *     
     */
    public void setSharedSetType(SharedSetType value) {
        this.sharedSetType = value;
    }

    /**
     * Gets the value of the campaignName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the value of the campaignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignName(String value) {
        this.campaignName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignSharedSetStatus }
     *     
     */
    public CampaignSharedSetStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignSharedSetStatus }
     *     
     */
    public void setStatus(CampaignSharedSetStatus value) {
        this.status = value;
    }

}
