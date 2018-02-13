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


package com.google.api.ads.dfp.jaxws.v201802;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An {@link AudienceSegment} represents audience segment object.
 *           
 * 
 * <p>Java class for AudienceSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudienceSegment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoryIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201802}AudienceSegment.Status" minOccurs="0"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mobileWebSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idfaSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="adIdSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ppidSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dataProvider" type="{https://www.google.com/apis/ads/publisher/v201802}AudienceSegmentDataProvider" minOccurs="0"/>
 *         &lt;element name="type" type="{https://www.google.com/apis/ads/publisher/v201802}AudienceSegment.Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudienceSegment", propOrder = {
    "id",
    "name",
    "categoryIds",
    "description",
    "status",
    "size",
    "mobileWebSize",
    "idfaSize",
    "adIdSize",
    "ppidSize",
    "dataProvider",
    "type"
})
@XmlSeeAlso({
    ThirdPartyAudienceSegment.class,
    SharedAudienceSegment.class,
    FirstPartyAudienceSegment.class
})
public class AudienceSegment {

    protected Long id;
    protected String name;
    @XmlElement(type = Long.class)
    protected List<Long> categoryIds;
    protected String description;
    @XmlSchemaType(name = "string")
    protected AudienceSegmentStatus status;
    protected Long size;
    protected Long mobileWebSize;
    protected Long idfaSize;
    protected Long adIdSize;
    protected Long ppidSize;
    protected AudienceSegmentDataProvider dataProvider;
    @XmlSchemaType(name = "string")
    protected AudienceSegmentType type;

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
     * Gets the value of the categoryIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCategoryIds() {
        if (categoryIds == null) {
            categoryIds = new ArrayList<Long>();
        }
        return this.categoryIds;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AudienceSegmentStatus }
     *     
     */
    public AudienceSegmentStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudienceSegmentStatus }
     *     
     */
    public void setStatus(AudienceSegmentStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSize(Long value) {
        this.size = value;
    }

    /**
     * Gets the value of the mobileWebSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMobileWebSize() {
        return mobileWebSize;
    }

    /**
     * Sets the value of the mobileWebSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMobileWebSize(Long value) {
        this.mobileWebSize = value;
    }

    /**
     * Gets the value of the idfaSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdfaSize() {
        return idfaSize;
    }

    /**
     * Sets the value of the idfaSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdfaSize(Long value) {
        this.idfaSize = value;
    }

    /**
     * Gets the value of the adIdSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdIdSize() {
        return adIdSize;
    }

    /**
     * Sets the value of the adIdSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdIdSize(Long value) {
        this.adIdSize = value;
    }

    /**
     * Gets the value of the ppidSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPpidSize() {
        return ppidSize;
    }

    /**
     * Sets the value of the ppidSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPpidSize(Long value) {
        this.ppidSize = value;
    }

    /**
     * Gets the value of the dataProvider property.
     * 
     * @return
     *     possible object is
     *     {@link AudienceSegmentDataProvider }
     *     
     */
    public AudienceSegmentDataProvider getDataProvider() {
        return dataProvider;
    }

    /**
     * Sets the value of the dataProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudienceSegmentDataProvider }
     *     
     */
    public void setDataProvider(AudienceSegmentDataProvider value) {
        this.dataProvider = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AudienceSegmentType }
     *     
     */
    public AudienceSegmentType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudienceSegmentType }
     *     
     */
    public void setType(AudienceSegmentType value) {
        this.type = value;
    }

}
