
package com.google.api.ads.adwords.jaxws.v201306.ch;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Holds information about a changed adgroup
 *           
 * 
 * <p>Java class for AdGroupChangeData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroupChangeData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="adGroupChangeStatus" type="{https://adwords.google.com/api/adwords/ch/v201306}ChangeStatus" minOccurs="0"/>
 *         &lt;element name="changedAds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="changedCriteria" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deletedCriteria" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="changedFeeds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deletedFeeds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="changedAdGroupBidModifierCriteria" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deletedAdGroupBidModifierCriteria" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroupChangeData", propOrder = {
    "adGroupId",
    "adGroupChangeStatus",
    "changedAds",
    "changedCriteria",
    "deletedCriteria",
    "changedFeeds",
    "deletedFeeds",
    "changedAdGroupBidModifierCriteria",
    "deletedAdGroupBidModifierCriteria"
})
public class AdGroupChangeData {

    protected Long adGroupId;
    protected ChangeStatus adGroupChangeStatus;
    @XmlElement(type = Long.class)
    protected List<Long> changedAds;
    @XmlElement(type = Long.class)
    protected List<Long> changedCriteria;
    @XmlElement(type = Long.class)
    protected List<Long> deletedCriteria;
    @XmlElement(type = Long.class)
    protected List<Long> changedFeeds;
    @XmlElement(type = Long.class)
    protected List<Long> deletedFeeds;
    @XmlElement(type = Long.class)
    protected List<Long> changedAdGroupBidModifierCriteria;
    @XmlElement(type = Long.class)
    protected List<Long> deletedAdGroupBidModifierCriteria;

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
     * Gets the value of the adGroupChangeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeStatus }
     *     
     */
    public ChangeStatus getAdGroupChangeStatus() {
        return adGroupChangeStatus;
    }

    /**
     * Sets the value of the adGroupChangeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeStatus }
     *     
     */
    public void setAdGroupChangeStatus(ChangeStatus value) {
        this.adGroupChangeStatus = value;
    }

    /**
     * Gets the value of the changedAds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changedAds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangedAds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getChangedAds() {
        if (changedAds == null) {
            changedAds = new ArrayList<Long>();
        }
        return this.changedAds;
    }

    /**
     * Gets the value of the changedCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changedCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangedCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getChangedCriteria() {
        if (changedCriteria == null) {
            changedCriteria = new ArrayList<Long>();
        }
        return this.changedCriteria;
    }

    /**
     * Gets the value of the deletedCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deletedCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeletedCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getDeletedCriteria() {
        if (deletedCriteria == null) {
            deletedCriteria = new ArrayList<Long>();
        }
        return this.deletedCriteria;
    }

    /**
     * Gets the value of the changedFeeds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changedFeeds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangedFeeds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getChangedFeeds() {
        if (changedFeeds == null) {
            changedFeeds = new ArrayList<Long>();
        }
        return this.changedFeeds;
    }

    /**
     * Gets the value of the deletedFeeds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deletedFeeds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeletedFeeds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getDeletedFeeds() {
        if (deletedFeeds == null) {
            deletedFeeds = new ArrayList<Long>();
        }
        return this.deletedFeeds;
    }

    /**
     * Gets the value of the changedAdGroupBidModifierCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changedAdGroupBidModifierCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangedAdGroupBidModifierCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getChangedAdGroupBidModifierCriteria() {
        if (changedAdGroupBidModifierCriteria == null) {
            changedAdGroupBidModifierCriteria = new ArrayList<Long>();
        }
        return this.changedAdGroupBidModifierCriteria;
    }

    /**
     * Gets the value of the deletedAdGroupBidModifierCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deletedAdGroupBidModifierCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeletedAdGroupBidModifierCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getDeletedAdGroupBidModifierCriteria() {
        if (deletedAdGroupBidModifierCriteria == null) {
            deletedAdGroupBidModifierCriteria = new ArrayList<Long>();
        }
        return this.deletedAdGroupBidModifierCriteria;
    }

}
