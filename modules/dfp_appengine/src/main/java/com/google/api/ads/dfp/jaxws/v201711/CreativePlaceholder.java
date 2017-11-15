// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code CreativePlaceholder} describes a slot that a creative is expected to
 *             fill. This is used primarily to help in forecasting, and also to validate
 *             that the correct creatives are associated with the line item. A
 *             {@code CreativePlaceholder} must contain a size, and it can optionally
 *             contain companions. Companions are only valid if the line item's environment
 *             type is {@link EnvironmentType#VIDEO_PLAYER}.
 *           
 * 
 * <p>Java class for CreativePlaceholder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreativePlaceholder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="size" type="{https://www.google.com/apis/ads/publisher/v201711}Size" minOccurs="0"/>
 *         &lt;element name="creativeTemplateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="companions" type="{https://www.google.com/apis/ads/publisher/v201711}CreativePlaceholder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="appliedLabels" type="{https://www.google.com/apis/ads/publisher/v201711}AppliedLabel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="effectiveAppliedLabels" type="{https://www.google.com/apis/ads/publisher/v201711}AppliedLabel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="expectedCreativeCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="creativeSizeType" type="{https://www.google.com/apis/ads/publisher/v201711}CreativeSizeType" minOccurs="0"/>
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
@XmlType(name = "CreativePlaceholder", propOrder = {
    "size",
    "creativeTemplateId",
    "companions",
    "appliedLabels",
    "effectiveAppliedLabels",
    "expectedCreativeCount",
    "creativeSizeType",
    "targetingName"
})
public class CreativePlaceholder {

    protected Size size;
    protected Long creativeTemplateId;
    protected List<CreativePlaceholder> companions;
    protected List<AppliedLabel> appliedLabels;
    protected List<AppliedLabel> effectiveAppliedLabels;
    protected Integer expectedCreativeCount;
    @XmlSchemaType(name = "string")
    protected CreativeSizeType creativeSizeType;
    protected String targetingName;

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Size }
     *     
     */
    public Size getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Size }
     *     
     */
    public void setSize(Size value) {
        this.size = value;
    }

    /**
     * Gets the value of the creativeTemplateId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreativeTemplateId() {
        return creativeTemplateId;
    }

    /**
     * Sets the value of the creativeTemplateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreativeTemplateId(Long value) {
        this.creativeTemplateId = value;
    }

    /**
     * Gets the value of the companions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreativePlaceholder }
     * 
     * 
     */
    public List<CreativePlaceholder> getCompanions() {
        if (companions == null) {
            companions = new ArrayList<CreativePlaceholder>();
        }
        return this.companions;
    }

    /**
     * Gets the value of the appliedLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppliedLabel }
     * 
     * 
     */
    public List<AppliedLabel> getAppliedLabels() {
        if (appliedLabels == null) {
            appliedLabels = new ArrayList<AppliedLabel>();
        }
        return this.appliedLabels;
    }

    /**
     * Gets the value of the effectiveAppliedLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectiveAppliedLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectiveAppliedLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppliedLabel }
     * 
     * 
     */
    public List<AppliedLabel> getEffectiveAppliedLabels() {
        if (effectiveAppliedLabels == null) {
            effectiveAppliedLabels = new ArrayList<AppliedLabel>();
        }
        return this.effectiveAppliedLabels;
    }

    /**
     * Gets the value of the expectedCreativeCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpectedCreativeCount() {
        return expectedCreativeCount;
    }

    /**
     * Sets the value of the expectedCreativeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpectedCreativeCount(Integer value) {
        this.expectedCreativeCount = value;
    }

    /**
     * Gets the value of the creativeSizeType property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeSizeType }
     *     
     */
    public CreativeSizeType getCreativeSizeType() {
        return creativeSizeType;
    }

    /**
     * Sets the value of the creativeSizeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeSizeType }
     *     
     */
    public void setCreativeSizeType(CreativeSizeType value) {
        this.creativeSizeType = value;
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
