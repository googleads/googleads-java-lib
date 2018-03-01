// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201802.ch;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="adGroupChangeStatus" type="{https://adwords.google.com/api/adwords/ch/v201802}ChangeStatus" minOccurs="0"/>
 *         &lt;element name="changedAds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="changedCriteria" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="removedCriteria" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="changedFeeds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="removedFeeds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="changedAdGroupBidModifierCriteria" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="removedAdGroupBidModifierCriteria" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
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
    "removedCriteria",
    "changedFeeds",
    "removedFeeds",
    "changedAdGroupBidModifierCriteria",
    "removedAdGroupBidModifierCriteria"
})
public class AdGroupChangeData {

    protected Long adGroupId;
    @XmlSchemaType(name = "string")
    protected ChangeStatus adGroupChangeStatus;
    @XmlElement(type = Long.class)
    protected List<Long> changedAds;
    @XmlElement(type = Long.class)
    protected List<Long> changedCriteria;
    @XmlElement(type = Long.class)
    protected List<Long> removedCriteria;
    @XmlElement(type = Long.class)
    protected List<Long> changedFeeds;
    @XmlElement(type = Long.class)
    protected List<Long> removedFeeds;
    @XmlElement(type = Long.class)
    protected List<Long> changedAdGroupBidModifierCriteria;
    @XmlElement(type = Long.class)
    protected List<Long> removedAdGroupBidModifierCriteria;

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
     * Gets the value of the removedCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removedCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemovedCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getRemovedCriteria() {
        if (removedCriteria == null) {
            removedCriteria = new ArrayList<Long>();
        }
        return this.removedCriteria;
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
     * Gets the value of the removedFeeds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removedFeeds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemovedFeeds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getRemovedFeeds() {
        if (removedFeeds == null) {
            removedFeeds = new ArrayList<Long>();
        }
        return this.removedFeeds;
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
     * Gets the value of the removedAdGroupBidModifierCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removedAdGroupBidModifierCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemovedAdGroupBidModifierCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getRemovedAdGroupBidModifierCriteria() {
        if (removedAdGroupBidModifierCriteria == null) {
            removedAdGroupBidModifierCriteria = new ArrayList<Long>();
        }
        return this.removedAdGroupBidModifierCriteria;
    }

}
