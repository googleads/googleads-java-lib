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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A Feed which contains data used to populate ad customizers.
 *             
 *             <p>An AdCustomizerFeed is a view of a regular Feed, but with some simplifications intended to
 *             support the most common use cases.
 *           
 * 
 * <p>Java class for AdCustomizerFeed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdCustomizerFeed">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feedId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="feedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feedStatus" type="{https://adwords.google.com/api/adwords/cm/v201802}Feed.Status" minOccurs="0"/>
 *         &lt;element name="feedAttributes" type="{https://adwords.google.com/api/adwords/cm/v201802}AdCustomizerFeedAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdCustomizerFeed", propOrder = {
    "feedId",
    "feedName",
    "feedStatus",
    "feedAttributes"
})
public class AdCustomizerFeed {

    protected Long feedId;
    protected String feedName;
    @XmlSchemaType(name = "string")
    protected FeedStatus feedStatus;
    protected List<AdCustomizerFeedAttribute> feedAttributes;

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
     * Gets the value of the feedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedName() {
        return feedName;
    }

    /**
     * Sets the value of the feedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedName(String value) {
        this.feedName = value;
    }

    /**
     * Gets the value of the feedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FeedStatus }
     *     
     */
    public FeedStatus getFeedStatus() {
        return feedStatus;
    }

    /**
     * Sets the value of the feedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedStatus }
     *     
     */
    public void setFeedStatus(FeedStatus value) {
        this.feedStatus = value;
    }

    /**
     * Gets the value of the feedAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdCustomizerFeedAttribute }
     * 
     * 
     */
    public List<AdCustomizerFeedAttribute> getFeedAttributes() {
        if (feedAttributes == null) {
            feedAttributes = new ArrayList<AdCustomizerFeedAttribute>();
        }
        return this.feedAttributes;
    }

}
