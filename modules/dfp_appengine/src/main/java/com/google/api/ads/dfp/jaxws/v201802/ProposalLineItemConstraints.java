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
 *             A {@code PropoalLineItemConstraints} represents all the constraints set for a {@link
 *             ProposalLineItem} and is always readonly. It comes from the {@link Product}, based on which the
 *             proposal line item is created.
 *           
 * 
 * <p>Java class for ProposalLineItemConstraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProposalLineItemConstraints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allowCreativePlaceholdersCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="builtInCreativePlaceholders" type="{https://www.google.com/apis/ads/publisher/v201802}CreativePlaceholder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="builtInRoadblockingType" type="{https://www.google.com/apis/ads/publisher/v201802}RoadblockingType" minOccurs="0"/>
 *         &lt;element name="builtInDeliveryRateType" type="{https://www.google.com/apis/ads/publisher/v201802}DeliveryRateType" minOccurs="0"/>
 *         &lt;element name="builtInCreativeRotationType" type="{https://www.google.com/apis/ads/publisher/v201802}CreativeRotationType" minOccurs="0"/>
 *         &lt;element name="builtInCompanionDeliveryOption" type="{https://www.google.com/apis/ads/publisher/v201802}CompanionDeliveryOption" minOccurs="0"/>
 *         &lt;element name="builtInFrequencyCaps" type="{https://www.google.com/apis/ads/publisher/v201802}FrequencyCap" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productBuiltInTargeting" type="{https://www.google.com/apis/ads/publisher/v201802}Targeting" minOccurs="0"/>
 *         &lt;element name="customizableAttributes" type="{https://www.google.com/apis/ads/publisher/v201802}CustomizableAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProposalLineItemConstraints", propOrder = {
    "allowCreativePlaceholdersCustomization",
    "builtInCreativePlaceholders",
    "builtInRoadblockingType",
    "builtInDeliveryRateType",
    "builtInCreativeRotationType",
    "builtInCompanionDeliveryOption",
    "builtInFrequencyCaps",
    "productBuiltInTargeting",
    "customizableAttributes"
})
public class ProposalLineItemConstraints {

    protected Boolean allowCreativePlaceholdersCustomization;
    protected List<CreativePlaceholder> builtInCreativePlaceholders;
    @XmlSchemaType(name = "string")
    protected RoadblockingType builtInRoadblockingType;
    @XmlSchemaType(name = "string")
    protected DeliveryRateType builtInDeliveryRateType;
    @XmlSchemaType(name = "string")
    protected CreativeRotationType builtInCreativeRotationType;
    @XmlSchemaType(name = "string")
    protected CompanionDeliveryOption builtInCompanionDeliveryOption;
    protected List<FrequencyCap> builtInFrequencyCaps;
    protected Targeting productBuiltInTargeting;
    protected CustomizableAttributes customizableAttributes;

    /**
     * Gets the value of the allowCreativePlaceholdersCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowCreativePlaceholdersCustomization() {
        return allowCreativePlaceholdersCustomization;
    }

    /**
     * Sets the value of the allowCreativePlaceholdersCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowCreativePlaceholdersCustomization(Boolean value) {
        this.allowCreativePlaceholdersCustomization = value;
    }

    /**
     * Gets the value of the builtInCreativePlaceholders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the builtInCreativePlaceholders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuiltInCreativePlaceholders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreativePlaceholder }
     * 
     * 
     */
    public List<CreativePlaceholder> getBuiltInCreativePlaceholders() {
        if (builtInCreativePlaceholders == null) {
            builtInCreativePlaceholders = new ArrayList<CreativePlaceholder>();
        }
        return this.builtInCreativePlaceholders;
    }

    /**
     * Gets the value of the builtInRoadblockingType property.
     * 
     * @return
     *     possible object is
     *     {@link RoadblockingType }
     *     
     */
    public RoadblockingType getBuiltInRoadblockingType() {
        return builtInRoadblockingType;
    }

    /**
     * Sets the value of the builtInRoadblockingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadblockingType }
     *     
     */
    public void setBuiltInRoadblockingType(RoadblockingType value) {
        this.builtInRoadblockingType = value;
    }

    /**
     * Gets the value of the builtInDeliveryRateType property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryRateType }
     *     
     */
    public DeliveryRateType getBuiltInDeliveryRateType() {
        return builtInDeliveryRateType;
    }

    /**
     * Sets the value of the builtInDeliveryRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryRateType }
     *     
     */
    public void setBuiltInDeliveryRateType(DeliveryRateType value) {
        this.builtInDeliveryRateType = value;
    }

    /**
     * Gets the value of the builtInCreativeRotationType property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeRotationType }
     *     
     */
    public CreativeRotationType getBuiltInCreativeRotationType() {
        return builtInCreativeRotationType;
    }

    /**
     * Sets the value of the builtInCreativeRotationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeRotationType }
     *     
     */
    public void setBuiltInCreativeRotationType(CreativeRotationType value) {
        this.builtInCreativeRotationType = value;
    }

    /**
     * Gets the value of the builtInCompanionDeliveryOption property.
     * 
     * @return
     *     possible object is
     *     {@link CompanionDeliveryOption }
     *     
     */
    public CompanionDeliveryOption getBuiltInCompanionDeliveryOption() {
        return builtInCompanionDeliveryOption;
    }

    /**
     * Sets the value of the builtInCompanionDeliveryOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanionDeliveryOption }
     *     
     */
    public void setBuiltInCompanionDeliveryOption(CompanionDeliveryOption value) {
        this.builtInCompanionDeliveryOption = value;
    }

    /**
     * Gets the value of the builtInFrequencyCaps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the builtInFrequencyCaps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuiltInFrequencyCaps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrequencyCap }
     * 
     * 
     */
    public List<FrequencyCap> getBuiltInFrequencyCaps() {
        if (builtInFrequencyCaps == null) {
            builtInFrequencyCaps = new ArrayList<FrequencyCap>();
        }
        return this.builtInFrequencyCaps;
    }

    /**
     * Gets the value of the productBuiltInTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link Targeting }
     *     
     */
    public Targeting getProductBuiltInTargeting() {
        return productBuiltInTargeting;
    }

    /**
     * Sets the value of the productBuiltInTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Targeting }
     *     
     */
    public void setProductBuiltInTargeting(Targeting value) {
        this.productBuiltInTargeting = value;
    }

    /**
     * Gets the value of the customizableAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizableAttributes }
     *     
     */
    public CustomizableAttributes getCustomizableAttributes() {
        return customizableAttributes;
    }

    /**
     * Sets the value of the customizableAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizableAttributes }
     *     
     */
    public void setCustomizableAttributes(CustomizableAttributes value) {
        this.customizableAttributes = value;
    }

}
