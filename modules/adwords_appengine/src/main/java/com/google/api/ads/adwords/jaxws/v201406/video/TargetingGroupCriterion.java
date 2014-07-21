
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the association between a {@link TargetingGroup} and a targeting
 *             {@link BaseCriterion}.
 *           
 * 
 * <p>Java class for TargetingGroupCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetingGroupCriterion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetingGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="targetingGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="criterion" type="{https://adwords.google.com/api/adwords/video/v201406}BaseCriterion" minOccurs="0"/>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TargetingGroupCriterion.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetingGroupCriterion", propOrder = {
    "targetingGroupId",
    "targetingGroupName",
    "criterion",
    "campaignId",
    "targetingGroupCriterionType"
})
@XmlSeeAlso({
    BiddableTargetingGroupCriterion.class,
    NegativeTargetingGroupCriterion.class,
    ReportedTargetingGroupCriterion.class
})
public class TargetingGroupCriterion {

    protected Long targetingGroupId;
    protected String targetingGroupName;
    protected BaseCriterion criterion;
    protected Long campaignId;
    @XmlElement(name = "TargetingGroupCriterion.Type")
    protected String targetingGroupCriterionType;

    /**
     * Gets the value of the targetingGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTargetingGroupId() {
        return targetingGroupId;
    }

    /**
     * Sets the value of the targetingGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTargetingGroupId(Long value) {
        this.targetingGroupId = value;
    }

    /**
     * Gets the value of the targetingGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetingGroupName() {
        return targetingGroupName;
    }

    /**
     * Sets the value of the targetingGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetingGroupName(String value) {
        this.targetingGroupName = value;
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
     * Gets the value of the targetingGroupCriterionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetingGroupCriterionType() {
        return targetingGroupCriterionType;
    }

    /**
     * Sets the value of the targetingGroupCriterionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetingGroupCriterionType(String value) {
        this.targetingGroupCriterionType = value;
    }

}
