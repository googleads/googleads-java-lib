
package com.google.api.ads.adwords.jaxws.v201406.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201406.cm.Paging;


/**
 * 
 *             A filter for selecting video campaign criterions for a customer.
 *             Only those criterions that match all filters will be returned.
 *           
 * 
 * <p>Java class for TargetingGroupCriterionSelector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetingGroupCriterionSelector">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="criteriaDimension" type="{https://adwords.google.com/api/adwords/video/v201406}CriteriaDimension" minOccurs="0"/>
 *         &lt;element name="criterionTypes" type="{https://adwords.google.com/api/adwords/video/v201406}BaseCriterion.Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userStatuses" type="{https://adwords.google.com/api/adwords/video/v201406}UserStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="campaignStatuses" type="{https://adwords.google.com/api/adwords/video/v201406}VideoCampaignStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="statsSelector" type="{https://adwords.google.com/api/adwords/video/v201406}StatsSelector" minOccurs="0"/>
 *         &lt;element name="paging" type="{https://adwords.google.com/api/adwords/cm/v201406}Paging" minOccurs="0"/>
 *         &lt;element name="sorting" type="{https://adwords.google.com/api/adwords/video/v201406}Sorting" minOccurs="0"/>
 *         &lt;element name="campaignIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="targetingGroupIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="criterionIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="criterionUse" type="{https://adwords.google.com/api/adwords/video/v201406}TargetingGroupCriterionSelector.CriterionUse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetingGroupCriterionSelector", propOrder = {
    "criteriaDimension",
    "criterionTypes",
    "userStatuses",
    "campaignStatuses",
    "statsSelector",
    "paging",
    "sorting",
    "campaignIds",
    "targetingGroupIds",
    "criterionIds",
    "criterionUse"
})
public class TargetingGroupCriterionSelector {

    protected CriteriaDimension criteriaDimension;
    protected List<BaseCriterionType> criterionTypes;
    protected List<UserStatus> userStatuses;
    protected List<VideoCampaignStatus> campaignStatuses;
    protected StatsSelector statsSelector;
    protected Paging paging;
    protected Sorting sorting;
    @XmlElement(type = Long.class)
    protected List<Long> campaignIds;
    @XmlElement(type = Long.class)
    protected List<Long> targetingGroupIds;
    @XmlElement(type = Long.class)
    protected List<Long> criterionIds;
    protected TargetingGroupCriterionSelectorCriterionUse criterionUse;

    /**
     * Gets the value of the criteriaDimension property.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaDimension }
     *     
     */
    public CriteriaDimension getCriteriaDimension() {
        return criteriaDimension;
    }

    /**
     * Sets the value of the criteriaDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaDimension }
     *     
     */
    public void setCriteriaDimension(CriteriaDimension value) {
        this.criteriaDimension = value;
    }

    /**
     * Gets the value of the criterionTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criterionTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriterionTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseCriterionType }
     * 
     * 
     */
    public List<BaseCriterionType> getCriterionTypes() {
        if (criterionTypes == null) {
            criterionTypes = new ArrayList<BaseCriterionType>();
        }
        return this.criterionTypes;
    }

    /**
     * Gets the value of the userStatuses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userStatuses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserStatuses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserStatus }
     * 
     * 
     */
    public List<UserStatus> getUserStatuses() {
        if (userStatuses == null) {
            userStatuses = new ArrayList<UserStatus>();
        }
        return this.userStatuses;
    }

    /**
     * Gets the value of the campaignStatuses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaignStatuses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignStatuses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoCampaignStatus }
     * 
     * 
     */
    public List<VideoCampaignStatus> getCampaignStatuses() {
        if (campaignStatuses == null) {
            campaignStatuses = new ArrayList<VideoCampaignStatus>();
        }
        return this.campaignStatuses;
    }

    /**
     * Gets the value of the statsSelector property.
     * 
     * @return
     *     possible object is
     *     {@link StatsSelector }
     *     
     */
    public StatsSelector getStatsSelector() {
        return statsSelector;
    }

    /**
     * Sets the value of the statsSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsSelector }
     *     
     */
    public void setStatsSelector(StatsSelector value) {
        this.statsSelector = value;
    }

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link Paging }
     *     
     */
    public Paging getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paging }
     *     
     */
    public void setPaging(Paging value) {
        this.paging = value;
    }

    /**
     * Gets the value of the sorting property.
     * 
     * @return
     *     possible object is
     *     {@link Sorting }
     *     
     */
    public Sorting getSorting() {
        return sorting;
    }

    /**
     * Sets the value of the sorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sorting }
     *     
     */
    public void setSorting(Sorting value) {
        this.sorting = value;
    }

    /**
     * Gets the value of the campaignIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaignIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCampaignIds() {
        if (campaignIds == null) {
            campaignIds = new ArrayList<Long>();
        }
        return this.campaignIds;
    }

    /**
     * Gets the value of the targetingGroupIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetingGroupIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetingGroupIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getTargetingGroupIds() {
        if (targetingGroupIds == null) {
            targetingGroupIds = new ArrayList<Long>();
        }
        return this.targetingGroupIds;
    }

    /**
     * Gets the value of the criterionIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criterionIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriterionIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCriterionIds() {
        if (criterionIds == null) {
            criterionIds = new ArrayList<Long>();
        }
        return this.criterionIds;
    }

    /**
     * Gets the value of the criterionUse property.
     * 
     * @return
     *     possible object is
     *     {@link TargetingGroupCriterionSelectorCriterionUse }
     *     
     */
    public TargetingGroupCriterionSelectorCriterionUse getCriterionUse() {
        return criterionUse;
    }

    /**
     * Sets the value of the criterionUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetingGroupCriterionSelectorCriterionUse }
     *     
     */
    public void setCriterionUse(TargetingGroupCriterionSelectorCriterionUse value) {
        this.criterionUse = value;
    }

}
