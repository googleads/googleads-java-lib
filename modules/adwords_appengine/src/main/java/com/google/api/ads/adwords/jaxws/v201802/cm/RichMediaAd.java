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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Data associated with a rich media ad.
 *             <span class="constraint AdxEnabled">This is disabled for AdX when it is contained within Operators: ADD, SET.</span>
 *           
 * 
 * <p>Java class for RichMediaAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RichMediaAd">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Ad">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dimensions" type="{https://adwords.google.com/api/adwords/cm/v201802}Dimensions" minOccurs="0"/>
 *         &lt;element name="snippet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impressionBeaconUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="certifiedVendorFormatId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sourceUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="richMediaAdType" type="{https://adwords.google.com/api/adwords/cm/v201802}RichMediaAd.RichMediaAdType" minOccurs="0"/>
 *         &lt;element name="adAttributes" type="{https://adwords.google.com/api/adwords/cm/v201802}RichMediaAd.AdAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RichMediaAd", propOrder = {
    "name",
    "dimensions",
    "snippet",
    "impressionBeaconUrl",
    "adDuration",
    "certifiedVendorFormatId",
    "sourceUrl",
    "richMediaAdType",
    "adAttributes"
})
@XmlSeeAlso({
    ThirdPartyRedirectAd.class
})
public abstract class RichMediaAd
    extends Ad
{

    protected String name;
    protected Dimensions dimensions;
    protected String snippet;
    protected String impressionBeaconUrl;
    protected Integer adDuration;
    protected Long certifiedVendorFormatId;
    protected String sourceUrl;
    @XmlSchemaType(name = "string")
    protected RichMediaAdRichMediaAdType richMediaAdType;
    @XmlSchemaType(name = "string")
    protected List<RichMediaAdAdAttribute> adAttributes;

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
     * Gets the value of the dimensions property.
     * 
     * @return
     *     possible object is
     *     {@link Dimensions }
     *     
     */
    public Dimensions getDimensions() {
        return dimensions;
    }

    /**
     * Sets the value of the dimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dimensions }
     *     
     */
    public void setDimensions(Dimensions value) {
        this.dimensions = value;
    }

    /**
     * Gets the value of the snippet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippet() {
        return snippet;
    }

    /**
     * Sets the value of the snippet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippet(String value) {
        this.snippet = value;
    }

    /**
     * Gets the value of the impressionBeaconUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpressionBeaconUrl() {
        return impressionBeaconUrl;
    }

    /**
     * Sets the value of the impressionBeaconUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpressionBeaconUrl(String value) {
        this.impressionBeaconUrl = value;
    }

    /**
     * Gets the value of the adDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdDuration() {
        return adDuration;
    }

    /**
     * Sets the value of the adDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdDuration(Integer value) {
        this.adDuration = value;
    }

    /**
     * Gets the value of the certifiedVendorFormatId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCertifiedVendorFormatId() {
        return certifiedVendorFormatId;
    }

    /**
     * Sets the value of the certifiedVendorFormatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCertifiedVendorFormatId(Long value) {
        this.certifiedVendorFormatId = value;
    }

    /**
     * Gets the value of the sourceUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceUrl() {
        return sourceUrl;
    }

    /**
     * Sets the value of the sourceUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceUrl(String value) {
        this.sourceUrl = value;
    }

    /**
     * Gets the value of the richMediaAdType property.
     * 
     * @return
     *     possible object is
     *     {@link RichMediaAdRichMediaAdType }
     *     
     */
    public RichMediaAdRichMediaAdType getRichMediaAdType() {
        return richMediaAdType;
    }

    /**
     * Sets the value of the richMediaAdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RichMediaAdRichMediaAdType }
     *     
     */
    public void setRichMediaAdType(RichMediaAdRichMediaAdType value) {
        this.richMediaAdType = value;
    }

    /**
     * Gets the value of the adAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RichMediaAdAdAttribute }
     * 
     * 
     */
    public List<RichMediaAdAdAttribute> getAdAttributes() {
        if (adAttributes == null) {
            adAttributes = new ArrayList<RichMediaAdAdAttribute>();
        }
        return this.adAttributes;
    }

}
