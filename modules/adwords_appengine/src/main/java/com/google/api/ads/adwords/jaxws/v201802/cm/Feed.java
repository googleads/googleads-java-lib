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
 *             A Feed identifies a source of data and its schema. The data for the Feed can either be
 *             user-entered via the FeedItemService or system-generated, in which case the data is provided
 *             automatically.
 *           
 * 
 * <p>Java class for Feed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Feed">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attributes" type="{https://adwords.google.com/api/adwords/cm/v201802}FeedAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201802}Feed.Status" minOccurs="0"/>
 *         &lt;element name="origin" type="{https://adwords.google.com/api/adwords/cm/v201802}Feed.Origin" minOccurs="0"/>
 *         &lt;element name="systemFeedGenerationData" type="{https://adwords.google.com/api/adwords/cm/v201802}SystemFeedGenerationData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Feed", propOrder = {
    "id",
    "name",
    "attributes",
    "status",
    "origin",
    "systemFeedGenerationData"
})
public class Feed {

    protected Long id;
    protected String name;
    protected List<FeedAttribute> attributes;
    @XmlSchemaType(name = "string")
    protected FeedStatus status;
    @XmlSchemaType(name = "string")
    protected FeedOrigin origin;
    protected SystemFeedGenerationData systemFeedGenerationData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeedAttribute }
     * 
     * 
     */
    public List<FeedAttribute> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<FeedAttribute>();
        }
        return this.attributes;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link FeedStatus }
     *     
     */
    public FeedStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedStatus }
     *     
     */
    public void setStatus(FeedStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link FeedOrigin }
     *     
     */
    public FeedOrigin getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedOrigin }
     *     
     */
    public void setOrigin(FeedOrigin value) {
        this.origin = value;
    }

    /**
     * Gets the value of the systemFeedGenerationData property.
     * 
     * @return
     *     possible object is
     *     {@link SystemFeedGenerationData }
     *     
     */
    public SystemFeedGenerationData getSystemFeedGenerationData() {
        return systemFeedGenerationData;
    }

    /**
     * Sets the value of the systemFeedGenerationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemFeedGenerationData }
     *     
     */
    public void setSystemFeedGenerationData(SystemFeedGenerationData value) {
        this.systemFeedGenerationData = value;
    }

}
