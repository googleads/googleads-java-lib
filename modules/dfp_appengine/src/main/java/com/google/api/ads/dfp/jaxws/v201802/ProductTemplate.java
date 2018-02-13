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
 *             {@code ProductTemplate} is used to generate products. All generated products will
 *             inherit all attributes from their {@code ProductTemplate}, except for segmentation,
 *             which will be included in the {@link Product#targeting}. The generated products in turn will be
 *             used to create {@link ProposalLineItem proposal line items} so that almost all attributes
 *             in the product template are properties of the proposal line item.
 *           
 * 
 * <p>Java class for ProductTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationDateTime" type="{https://www.google.com/apis/ads/publisher/v201802}DateTime" minOccurs="0"/>
 *         &lt;element name="lastModifiedDateTime" type="{https://www.google.com/apis/ads/publisher/v201802}DateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameMacro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201802}ProductTemplateStatus" minOccurs="0"/>
 *         &lt;element name="productType" type="{https://www.google.com/apis/ads/publisher/v201802}ProductType" minOccurs="0"/>
 *         &lt;element name="creatorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rateType" type="{https://www.google.com/apis/ads/publisher/v201802}RateType" minOccurs="0"/>
 *         &lt;element name="roadblockingType" type="{https://www.google.com/apis/ads/publisher/v201802}RoadblockingType" minOccurs="0"/>
 *         &lt;element name="deliveryRateType" type="{https://www.google.com/apis/ads/publisher/v201802}DeliveryRateType" minOccurs="0"/>
 *         &lt;element name="creativeRotationType" type="{https://www.google.com/apis/ads/publisher/v201802}CreativeRotationType" minOccurs="0"/>
 *         &lt;element name="companionDeliveryOption" type="{https://www.google.com/apis/ads/publisher/v201802}CompanionDeliveryOption" minOccurs="0"/>
 *         &lt;element name="creativePlaceholders" type="{https://www.google.com/apis/ads/publisher/v201802}CreativePlaceholder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lineItemType" type="{https://www.google.com/apis/ads/publisher/v201802}LineItemType" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="frequencyCaps" type="{https://www.google.com/apis/ads/publisher/v201802}FrequencyCap" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productSegmentation" type="{https://www.google.com/apis/ads/publisher/v201802}ProductSegmentation" minOccurs="0"/>
 *         &lt;element name="builtInTargeting" type="{https://www.google.com/apis/ads/publisher/v201802}Targeting" minOccurs="0"/>
 *         &lt;element name="customizableAttributes" type="{https://www.google.com/apis/ads/publisher/v201802}CustomizableAttributes" minOccurs="0"/>
 *         &lt;element name="customFieldValues" type="{https://www.google.com/apis/ads/publisher/v201802}BaseCustomFieldValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="environmentType" type="{https://www.google.com/apis/ads/publisher/v201802}EnvironmentType" minOccurs="0"/>
 *         &lt;element name="videoMaxDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="productTemplateMarketplaceInfo" type="{https://www.google.com/apis/ads/publisher/v201802}ProductTemplateMarketplaceInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductTemplate", propOrder = {
    "id",
    "name",
    "creationDateTime",
    "lastModifiedDateTime",
    "description",
    "nameMacro",
    "status",
    "productType",
    "creatorId",
    "rateType",
    "roadblockingType",
    "deliveryRateType",
    "creativeRotationType",
    "companionDeliveryOption",
    "creativePlaceholders",
    "lineItemType",
    "priority",
    "frequencyCaps",
    "productSegmentation",
    "builtInTargeting",
    "customizableAttributes",
    "customFieldValues",
    "environmentType",
    "videoMaxDuration",
    "productTemplateMarketplaceInfo"
})
public class ProductTemplate {

    protected Long id;
    protected String name;
    protected DateTime creationDateTime;
    protected DateTime lastModifiedDateTime;
    protected String description;
    protected String nameMacro;
    @XmlSchemaType(name = "string")
    protected ProductTemplateStatus status;
    @XmlSchemaType(name = "string")
    protected ProductType productType;
    protected Long creatorId;
    @XmlSchemaType(name = "string")
    protected RateType rateType;
    @XmlSchemaType(name = "string")
    protected RoadblockingType roadblockingType;
    @XmlSchemaType(name = "string")
    protected DeliveryRateType deliveryRateType;
    @XmlSchemaType(name = "string")
    protected CreativeRotationType creativeRotationType;
    @XmlSchemaType(name = "string")
    protected CompanionDeliveryOption companionDeliveryOption;
    protected List<CreativePlaceholder> creativePlaceholders;
    @XmlSchemaType(name = "string")
    protected LineItemType lineItemType;
    protected Integer priority;
    protected List<FrequencyCap> frequencyCaps;
    protected ProductSegmentation productSegmentation;
    protected Targeting builtInTargeting;
    protected CustomizableAttributes customizableAttributes;
    protected List<BaseCustomFieldValue> customFieldValues;
    @XmlSchemaType(name = "string")
    protected EnvironmentType environmentType;
    protected Long videoMaxDuration;
    protected ProductTemplateMarketplaceInfo productTemplateMarketplaceInfo;

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
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setCreationDateTime(DateTime value) {
        this.creationDateTime = value;
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
     * Gets the value of the nameMacro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameMacro() {
        return nameMacro;
    }

    /**
     * Sets the value of the nameMacro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameMacro(String value) {
        this.nameMacro = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTemplateStatus }
     *     
     */
    public ProductTemplateStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTemplateStatus }
     *     
     */
    public void setStatus(ProductTemplateStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setProductType(ProductType value) {
        this.productType = value;
    }

    /**
     * Gets the value of the creatorId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * Sets the value of the creatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreatorId(Long value) {
        this.creatorId = value;
    }

    /**
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link RateType }
     *     
     */
    public RateType getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType }
     *     
     */
    public void setRateType(RateType value) {
        this.rateType = value;
    }

    /**
     * Gets the value of the roadblockingType property.
     * 
     * @return
     *     possible object is
     *     {@link RoadblockingType }
     *     
     */
    public RoadblockingType getRoadblockingType() {
        return roadblockingType;
    }

    /**
     * Sets the value of the roadblockingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadblockingType }
     *     
     */
    public void setRoadblockingType(RoadblockingType value) {
        this.roadblockingType = value;
    }

    /**
     * Gets the value of the deliveryRateType property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryRateType }
     *     
     */
    public DeliveryRateType getDeliveryRateType() {
        return deliveryRateType;
    }

    /**
     * Sets the value of the deliveryRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryRateType }
     *     
     */
    public void setDeliveryRateType(DeliveryRateType value) {
        this.deliveryRateType = value;
    }

    /**
     * Gets the value of the creativeRotationType property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeRotationType }
     *     
     */
    public CreativeRotationType getCreativeRotationType() {
        return creativeRotationType;
    }

    /**
     * Sets the value of the creativeRotationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeRotationType }
     *     
     */
    public void setCreativeRotationType(CreativeRotationType value) {
        this.creativeRotationType = value;
    }

    /**
     * Gets the value of the companionDeliveryOption property.
     * 
     * @return
     *     possible object is
     *     {@link CompanionDeliveryOption }
     *     
     */
    public CompanionDeliveryOption getCompanionDeliveryOption() {
        return companionDeliveryOption;
    }

    /**
     * Sets the value of the companionDeliveryOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanionDeliveryOption }
     *     
     */
    public void setCompanionDeliveryOption(CompanionDeliveryOption value) {
        this.companionDeliveryOption = value;
    }

    /**
     * Gets the value of the creativePlaceholders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creativePlaceholders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreativePlaceholders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreativePlaceholder }
     * 
     * 
     */
    public List<CreativePlaceholder> getCreativePlaceholders() {
        if (creativePlaceholders == null) {
            creativePlaceholders = new ArrayList<CreativePlaceholder>();
        }
        return this.creativePlaceholders;
    }

    /**
     * Gets the value of the lineItemType property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemType }
     *     
     */
    public LineItemType getLineItemType() {
        return lineItemType;
    }

    /**
     * Sets the value of the lineItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemType }
     *     
     */
    public void setLineItemType(LineItemType value) {
        this.lineItemType = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Gets the value of the frequencyCaps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frequencyCaps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrequencyCaps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrequencyCap }
     * 
     * 
     */
    public List<FrequencyCap> getFrequencyCaps() {
        if (frequencyCaps == null) {
            frequencyCaps = new ArrayList<FrequencyCap>();
        }
        return this.frequencyCaps;
    }

    /**
     * Gets the value of the productSegmentation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSegmentation }
     *     
     */
    public ProductSegmentation getProductSegmentation() {
        return productSegmentation;
    }

    /**
     * Sets the value of the productSegmentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSegmentation }
     *     
     */
    public void setProductSegmentation(ProductSegmentation value) {
        this.productSegmentation = value;
    }

    /**
     * Gets the value of the builtInTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link Targeting }
     *     
     */
    public Targeting getBuiltInTargeting() {
        return builtInTargeting;
    }

    /**
     * Sets the value of the builtInTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Targeting }
     *     
     */
    public void setBuiltInTargeting(Targeting value) {
        this.builtInTargeting = value;
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

    /**
     * Gets the value of the customFieldValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customFieldValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomFieldValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseCustomFieldValue }
     * 
     * 
     */
    public List<BaseCustomFieldValue> getCustomFieldValues() {
        if (customFieldValues == null) {
            customFieldValues = new ArrayList<BaseCustomFieldValue>();
        }
        return this.customFieldValues;
    }

    /**
     * Gets the value of the environmentType property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentType }
     *     
     */
    public EnvironmentType getEnvironmentType() {
        return environmentType;
    }

    /**
     * Sets the value of the environmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentType }
     *     
     */
    public void setEnvironmentType(EnvironmentType value) {
        this.environmentType = value;
    }

    /**
     * Gets the value of the videoMaxDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVideoMaxDuration() {
        return videoMaxDuration;
    }

    /**
     * Sets the value of the videoMaxDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVideoMaxDuration(Long value) {
        this.videoMaxDuration = value;
    }

    /**
     * Gets the value of the productTemplateMarketplaceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTemplateMarketplaceInfo }
     *     
     */
    public ProductTemplateMarketplaceInfo getProductTemplateMarketplaceInfo() {
        return productTemplateMarketplaceInfo;
    }

    /**
     * Sets the value of the productTemplateMarketplaceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTemplateMarketplaceInfo }
     *     
     */
    public void setProductTemplateMarketplaceInfo(ProductTemplateMarketplaceInfo value) {
        this.productTemplateMarketplaceInfo = value;
    }

}
