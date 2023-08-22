// Copyright 2023 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202302;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Creative} represents the media for the ad being served.
 *             
 *             <p>Read more about creatives on the <a
 *             href="https://support.google.com/admanager/answer/3185155">Ad Manager Help Center</a>.
 *           
 * 
 * <p>Java class for Creative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Creative"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="advertiserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="size" type="{https://www.google.com/apis/ads/publisher/v202302}Size" minOccurs="0"/&gt;
 *         &lt;element name="previewUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="policyLabels" type="{https://www.google.com/apis/ads/publisher/v202302}CreativePolicyViolation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="appliedLabels" type="{https://www.google.com/apis/ads/publisher/v202302}AppliedLabel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lastModifiedDateTime" type="{https://www.google.com/apis/ads/publisher/v202302}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="customFieldValues" type="{https://www.google.com/apis/ads/publisher/v202302}BaseCustomFieldValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="thirdPartyDataDeclaration" type="{https://www.google.com/apis/ads/publisher/v202302}ThirdPartyDataDeclaration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Creative", propOrder = {
    "advertiserId",
    "id",
    "name",
    "size",
    "previewUrl",
    "policyLabels",
    "appliedLabels",
    "lastModifiedDateTime",
    "customFieldValues",
    "thirdPartyDataDeclaration"
})
@XmlSeeAlso({
    ClickTrackingCreative.class,
    BaseDynamicAllocationCreative.class,
    Html5Creative.class,
    InternalRedirectCreative.class,
    LegacyDfpCreative.class,
    ProgrammaticCreative.class,
    BaseRichMediaStudioCreative.class,
    TemplateCreative.class,
    ThirdPartyCreative.class,
    UnsupportedCreative.class,
    VastRedirectCreative.class,
    HasDestinationUrlCreative.class
})
public abstract class Creative {

    protected Long advertiserId;
    protected Long id;
    protected String name;
    protected Size size;
    protected String previewUrl;
    @XmlSchemaType(name = "string")
    protected List<CreativePolicyViolation> policyLabels;
    protected List<AppliedLabel> appliedLabels;
    protected DateTime lastModifiedDateTime;
    protected List<BaseCustomFieldValue> customFieldValues;
    protected ThirdPartyDataDeclaration thirdPartyDataDeclaration;

    /**
     * Gets the value of the advertiserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdvertiserId() {
        return advertiserId;
    }

    /**
     * Sets the value of the advertiserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdvertiserId(Long value) {
        this.advertiserId = value;
    }

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
     * Gets the value of the previewUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviewUrl() {
        return previewUrl;
    }

    /**
     * Sets the value of the previewUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviewUrl(String value) {
        this.previewUrl = value;
    }

    /**
     * Gets the value of the policyLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreativePolicyViolation }
     * 
     * 
     */
    public List<CreativePolicyViolation> getPolicyLabels() {
        if (policyLabels == null) {
            policyLabels = new ArrayList<CreativePolicyViolation>();
        }
        return this.policyLabels;
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
     * Gets the value of the thirdPartyDataDeclaration property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyDataDeclaration }
     *     
     */
    public ThirdPartyDataDeclaration getThirdPartyDataDeclaration() {
        return thirdPartyDataDeclaration;
    }

    /**
     * Sets the value of the thirdPartyDataDeclaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyDataDeclaration }
     *     
     */
    public void setThirdPartyDataDeclaration(ThirdPartyDataDeclaration value) {
        this.thirdPartyDataDeclaration = value;
    }

}
