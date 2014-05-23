
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoCampaignCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoCampaignCriterion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="campaignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="criterion" type="{https://adwords.google.com/api/adwords/video/v201402}BaseCriterion" minOccurs="0"/>
 *         &lt;element name="VideoCampaignCriterion.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoCampaignCriterion", propOrder = {
    "campaignId",
    "campaignName",
    "criterion",
    "videoCampaignCriterionType"
})
@XmlSeeAlso({
    ReportedVideoCampaignCriterion.class,
    NegativeVideoCampaignCriterion.class
})
public class VideoCampaignCriterion {

    protected Long campaignId;
    protected String campaignName;
    protected BaseCriterion criterion;
    @XmlElement(name = "VideoCampaignCriterion.Type")
    protected String videoCampaignCriterionType;

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
     * Gets the value of the criterion property.
     * 
     * @return
     *     possible object is
     *     {@link BaseCriterion }
     *     
     */
    public BaseCriterion getCriterion() {
        return criterion;
    }

    /**
     * Sets the value of the criterion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseCriterion }
     *     
     */
    public void setCriterion(BaseCriterion value) {
        this.criterion = value;
    }

    /**
     * Gets the value of the videoCampaignCriterionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoCampaignCriterionType() {
        return videoCampaignCriterionType;
    }

    /**
     * Sets the value of the videoCampaignCriterionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoCampaignCriterionType(String value) {
        this.videoCampaignCriterionType = value;
    }

}
