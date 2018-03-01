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
 *             Holds information about a changed feed and any feeds items within the feed.
 *           
 * 
 * <p>Java class for FeedChangeData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedChangeData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feedId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="feedChangeStatus" type="{https://adwords.google.com/api/adwords/ch/v201802}ChangeStatus" minOccurs="0"/>
 *         &lt;element name="changedFeedItems" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="removedFeedItems" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedChangeData", propOrder = {
    "feedId",
    "feedChangeStatus",
    "changedFeedItems",
    "removedFeedItems"
})
public class FeedChangeData {

    protected Long feedId;
    @XmlSchemaType(name = "string")
    protected ChangeStatus feedChangeStatus;
    @XmlElement(type = Long.class)
    protected List<Long> changedFeedItems;
    @XmlElement(type = Long.class)
    protected List<Long> removedFeedItems;

    /**
     * Gets the value of the feedId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFeedId() {
        return feedId;
    }

    /**
     * Sets the value of the feedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFeedId(Long value) {
        this.feedId = value;
    }

    /**
     * Gets the value of the feedChangeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeStatus }
     *     
     */
    public ChangeStatus getFeedChangeStatus() {
        return feedChangeStatus;
    }

    /**
     * Sets the value of the feedChangeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeStatus }
     *     
     */
    public void setFeedChangeStatus(ChangeStatus value) {
        this.feedChangeStatus = value;
    }

    /**
     * Gets the value of the changedFeedItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changedFeedItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangedFeedItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getChangedFeedItems() {
        if (changedFeedItems == null) {
            changedFeedItems = new ArrayList<Long>();
        }
        return this.changedFeedItems;
    }

    /**
     * Gets the value of the removedFeedItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removedFeedItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemovedFeedItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getRemovedFeedItems() {
        if (removedFeedItems == null) {
            removedFeedItems = new ArrayList<Long>();
        }
        return this.removedFeedItems;
    }

}
