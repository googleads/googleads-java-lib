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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code LineItemCreativeAssociation} associates a {@link Creative} or {@link CreativeSet} with a
 *             {@link LineItem} so that the creative can be served in ad units targeted by the line item.
 *           
 * 
 * <p>Java class for LineItemCreativeAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItemCreativeAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lineItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="creativeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="creativeSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="manualCreativeRotationWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="sequentialCreativeRotationIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="startDateTime" type="{https://www.google.com/apis/ads/publisher/v201802}DateTime" minOccurs="0"/>
 *         &lt;element name="startDateTimeType" type="{https://www.google.com/apis/ads/publisher/v201802}StartDateTimeType" minOccurs="0"/>
 *         &lt;element name="endDateTime" type="{https://www.google.com/apis/ads/publisher/v201802}DateTime" minOccurs="0"/>
 *         &lt;element name="destinationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sizes" type="{https://www.google.com/apis/ads/publisher/v201802}Size" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201802}LineItemCreativeAssociation.Status" minOccurs="0"/>
 *         &lt;element name="stats" type="{https://www.google.com/apis/ads/publisher/v201802}LineItemCreativeAssociationStats" minOccurs="0"/>
 *         &lt;element name="lastModifiedDateTime" type="{https://www.google.com/apis/ads/publisher/v201802}DateTime" minOccurs="0"/>
 *         &lt;element name="targetingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemCreativeAssociation", propOrder = {
    "lineItemId",
    "creativeId",
    "creativeSetId",
    "manualCreativeRotationWeight",
    "sequentialCreativeRotationIndex",
    "startDateTime",
    "startDateTimeType",
    "endDateTime",
    "destinationUrl",
    "sizes",
    "status",
    "stats",
    "lastModifiedDateTime",
    "targetingName"
})
public class LineItemCreativeAssociation {

    protected Long lineItemId;
    protected Long creativeId;
    protected Long creativeSetId;
    protected Double manualCreativeRotationWeight;
    protected Integer sequentialCreativeRotationIndex;
    protected DateTime startDateTime;
    @XmlSchemaType(name = "string")
    protected StartDateTimeType startDateTimeType;
    protected DateTime endDateTime;
    protected String destinationUrl;
    protected List<Size> sizes;
    @XmlSchemaType(name = "string")
    protected LineItemCreativeAssociationStatus status;
    protected LineItemCreativeAssociationStats stats;
    protected DateTime lastModifiedDateTime;
    protected String targetingName;

    /**
     * Gets the value of the lineItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLineItemId() {
        return lineItemId;
    }

    /**
     * Sets the value of the lineItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLineItemId(Long value) {
        this.lineItemId = value;
    }

    /**
     * Gets the value of the creativeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreativeId() {
        return creativeId;
    }

    /**
     * Sets the value of the creativeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreativeId(Long value) {
        this.creativeId = value;
    }

    /**
     * Gets the value of the creativeSetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreativeSetId() {
        return creativeSetId;
    }

    /**
     * Sets the value of the creativeSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreativeSetId(Long value) {
        this.creativeSetId = value;
    }

    /**
     * Gets the value of the manualCreativeRotationWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getManualCreativeRotationWeight() {
        return manualCreativeRotationWeight;
    }

    /**
     * Sets the value of the manualCreativeRotationWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setManualCreativeRotationWeight(Double value) {
        this.manualCreativeRotationWeight = value;
    }

    /**
     * Gets the value of the sequentialCreativeRotationIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequentialCreativeRotationIndex() {
        return sequentialCreativeRotationIndex;
    }

    /**
     * Sets the value of the sequentialCreativeRotationIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequentialCreativeRotationIndex(Integer value) {
        this.sequentialCreativeRotationIndex = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setStartDateTime(DateTime value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the startDateTimeType property.
     * 
     * @return
     *     possible object is
     *     {@link StartDateTimeType }
     *     
     */
    public StartDateTimeType getStartDateTimeType() {
        return startDateTimeType;
    }

    /**
     * Sets the value of the startDateTimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDateTimeType }
     *     
     */
    public void setStartDateTimeType(StartDateTimeType value) {
        this.startDateTimeType = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setEndDateTime(DateTime value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the destinationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationUrl() {
        return destinationUrl;
    }

    /**
     * Sets the value of the destinationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationUrl(String value) {
        this.destinationUrl = value;
    }

    /**
     * Gets the value of the sizes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sizes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSizes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Size }
     * 
     * 
     */
    public List<Size> getSizes() {
        if (sizes == null) {
            sizes = new ArrayList<Size>();
        }
        return this.sizes;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemCreativeAssociationStatus }
     *     
     */
    public LineItemCreativeAssociationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemCreativeAssociationStatus }
     *     
     */
    public void setStatus(LineItemCreativeAssociationStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the stats property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemCreativeAssociationStats }
     *     
     */
    public LineItemCreativeAssociationStats getStats() {
        return stats;
    }

    /**
     * Sets the value of the stats property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemCreativeAssociationStats }
     *     
     */
    public void setStats(LineItemCreativeAssociationStats value) {
        this.stats = value;
    }

    /**
     * Gets the value of the lastModifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    /**
     * Sets the value of the lastModifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setLastModifiedDateTime(DateTime value) {
        this.lastModifiedDateTime = value;
    }

    /**
     * Gets the value of the targetingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetingName() {
        return targetingName;
    }

    /**
     * Sets the value of the targetingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetingName(String value) {
        this.targetingName = value;
    }

}
