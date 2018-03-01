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
 *             A FeedMapping represents a mapping between feed attributes in a specific feed
 *             and placeholder fields for a specific placeholder type. This will tell the
 *             ads serving system which parts of the feed item should be used when
 *             populating a placeholder. Without this mapping the placeholder cannot be
 *             populated and the extension can not be displayed.
 *             
 *             <p>For a list of feed placeholders, see
 *             <a href="/adwords/api/docs/appendix/placeholders">
 *             https://developers.google.com/adwords/api/docs/appendix/placeholders
 *             </a></p>
 *           
 * 
 * <p>Java class for FeedMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feedMappingId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="feedId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="placeholderType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201802}FeedMapping.Status" minOccurs="0"/>
 *         &lt;element name="attributeFieldMappings" type="{https://adwords.google.com/api/adwords/cm/v201802}AttributeFieldMapping" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="criterionType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedMapping", propOrder = {
    "feedMappingId",
    "feedId",
    "placeholderType",
    "status",
    "attributeFieldMappings",
    "criterionType"
})
public class FeedMapping {

    protected Long feedMappingId;
    protected Long feedId;
    protected Integer placeholderType;
    @XmlSchemaType(name = "string")
    protected FeedMappingStatus status;
    protected List<AttributeFieldMapping> attributeFieldMappings;
    protected Integer criterionType;

    /**
     * Gets the value of the feedMappingId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFeedMappingId() {
        return feedMappingId;
    }

    /**
     * Sets the value of the feedMappingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFeedMappingId(Long value) {
        this.feedMappingId = value;
    }

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
     * Gets the value of the placeholderType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlaceholderType() {
        return placeholderType;
    }

    /**
     * Sets the value of the placeholderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlaceholderType(Integer value) {
        this.placeholderType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link FeedMappingStatus }
     *     
     */
    public FeedMappingStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedMappingStatus }
     *     
     */
    public void setStatus(FeedMappingStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the attributeFieldMappings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeFieldMappings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeFieldMappings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeFieldMapping }
     * 
     * 
     */
    public List<AttributeFieldMapping> getAttributeFieldMappings() {
        if (attributeFieldMappings == null) {
            attributeFieldMappings = new ArrayList<AttributeFieldMapping>();
        }
        return this.attributeFieldMappings;
    }

    /**
     * Gets the value of the criterionType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCriterionType() {
        return criterionType;
    }

    /**
     * Sets the value of the criterionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCriterionType(Integer value) {
        this.criterionType = value;
    }

}
