
package com.google.api.ads.adwords.jaxws.v201603.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents an ad in an ad group.
 *           
 * 
 * <p>Java class for AdGroupAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroupAd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ad" type="{https://adwords.google.com/api/adwords/cm/v201603}Ad" minOccurs="0"/>
 *         &lt;element name="experimentData" type="{https://adwords.google.com/api/adwords/cm/v201603}AdGroupAdExperimentData" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201603}AdGroupAd.Status" minOccurs="0"/>
 *         &lt;element name="approvalStatus" type="{https://adwords.google.com/api/adwords/cm/v201603}AdGroupAd.ApprovalStatus" minOccurs="0"/>
 *         &lt;element name="trademarks" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="disapprovalReasons" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="trademarkDisapproved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="labels" type="{https://adwords.google.com/api/adwords/cm/v201603}Label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="baseCampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="baseAdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="forwardCompatibilityMap" type="{https://adwords.google.com/api/adwords/cm/v201603}String_StringMapEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroupAd", propOrder = {
    "adGroupId",
    "ad",
    "experimentData",
    "status",
    "approvalStatus",
    "trademarks",
    "disapprovalReasons",
    "trademarkDisapproved",
    "labels",
    "baseCampaignId",
    "baseAdGroupId",
    "forwardCompatibilityMap"
})
public class AdGroupAd {

    protected Long adGroupId;
    protected Ad ad;
    protected AdGroupAdExperimentData experimentData;
    @XmlSchemaType(name = "string")
    protected AdGroupAdStatus status;
    @XmlSchemaType(name = "string")
    protected AdGroupAdApprovalStatus approvalStatus;
    protected List<String> trademarks;
    protected List<String> disapprovalReasons;
    protected Boolean trademarkDisapproved;
    protected List<Label> labels;
    protected Long baseCampaignId;
    protected Long baseAdGroupId;
    protected List<StringStringMapEntry> forwardCompatibilityMap;

    /**
     * Gets the value of the adGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdGroupId() {
        return adGroupId;
    }

    /**
     * Sets the value of the adGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdGroupId(Long value) {
        this.adGroupId = value;
    }

    /**
     * Gets the value of the ad property.
     * 
     * @return
     *     possible object is
     *     {@link Ad }
     *     
     */
    public Ad getAd() {
        return ad;
    }

    /**
     * Sets the value of the ad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ad }
     *     
     */
    public void setAd(Ad value) {
        this.ad = value;
    }

    /**
     * Gets the value of the experimentData property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupAdExperimentData }
     *     
     */
    public AdGroupAdExperimentData getExperimentData() {
        return experimentData;
    }

    /**
     * Sets the value of the experimentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupAdExperimentData }
     *     
     */
    public void setExperimentData(AdGroupAdExperimentData value) {
        this.experimentData = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupAdStatus }
     *     
     */
    public AdGroupAdStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupAdStatus }
     *     
     */
    public void setStatus(AdGroupAdStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the approvalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupAdApprovalStatus }
     *     
     */
    public AdGroupAdApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * Sets the value of the approvalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupAdApprovalStatus }
     *     
     */
    public void setApprovalStatus(AdGroupAdApprovalStatus value) {
        this.approvalStatus = value;
    }

    /**
     * Gets the value of the trademarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trademarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrademarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTrademarks() {
        if (trademarks == null) {
            trademarks = new ArrayList<String>();
        }
        return this.trademarks;
    }

    /**
     * Gets the value of the disapprovalReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disapprovalReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisapprovalReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDisapprovalReasons() {
        if (disapprovalReasons == null) {
            disapprovalReasons = new ArrayList<String>();
        }
        return this.disapprovalReasons;
    }

    /**
     * Gets the value of the trademarkDisapproved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrademarkDisapproved() {
        return trademarkDisapproved;
    }

    /**
     * Sets the value of the trademarkDisapproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrademarkDisapproved(Boolean value) {
        this.trademarkDisapproved = value;
    }

    /**
     * Gets the value of the labels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Label }
     * 
     * 
     */
    public List<Label> getLabels() {
        if (labels == null) {
            labels = new ArrayList<Label>();
        }
        return this.labels;
    }

    /**
     * Gets the value of the baseCampaignId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBaseCampaignId() {
        return baseCampaignId;
    }

    /**
     * Sets the value of the baseCampaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBaseCampaignId(Long value) {
        this.baseCampaignId = value;
    }

    /**
     * Gets the value of the baseAdGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBaseAdGroupId() {
        return baseAdGroupId;
    }

    /**
     * Sets the value of the baseAdGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBaseAdGroupId(Long value) {
        this.baseAdGroupId = value;
    }

    /**
     * Gets the value of the forwardCompatibilityMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forwardCompatibilityMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForwardCompatibilityMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringStringMapEntry }
     * 
     * 
     */
    public List<StringStringMapEntry> getForwardCompatibilityMap() {
        if (forwardCompatibilityMap == null) {
            forwardCompatibilityMap = new ArrayList<StringStringMapEntry>();
        }
        return this.forwardCompatibilityMap;
    }

}
