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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a <a href=
 *             "//www.google.com/adwords/displaynetwork/plan-creative-campaigns/display-ad-builder.html"
 *             >Display Ad Builder</a> template ad. A template ad is
 *             composed of a template (specified by its ID) and the data that populates
 *             the template's fields. For a list of available templates and their required
 *             fields, see <a href="/adwords/api/docs/appendix/templateads">Template Ads</a>.
 *             <span class="constraint AdxEnabled">This is disabled for AdX when it is contained within Operators: ADD, SET.</span>
 *           
 * 
 * <p>Java class for TemplateAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemplateAd">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Ad">
 *       &lt;sequence>
 *         &lt;element name="templateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="adUnionId" type="{https://adwords.google.com/api/adwords/cm/v201802}AdUnionId" minOccurs="0"/>
 *         &lt;element name="templateElements" type="{https://adwords.google.com/api/adwords/cm/v201802}TemplateElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="adAsImage" type="{https://adwords.google.com/api/adwords/cm/v201802}Image" minOccurs="0"/>
 *         &lt;element name="dimensions" type="{https://adwords.google.com/api/adwords/cm/v201802}Dimensions" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="originAdId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplateAd", propOrder = {
    "templateId",
    "adUnionId",
    "templateElements",
    "adAsImage",
    "dimensions",
    "name",
    "duration",
    "originAdId"
})
public class TemplateAd
    extends Ad
{

    protected Long templateId;
    protected AdUnionId adUnionId;
    protected List<TemplateElement> templateElements;
    protected Image adAsImage;
    protected Dimensions dimensions;
    protected String name;
    protected Integer duration;
    protected Long originAdId;

    /**
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTemplateId(Long value) {
        this.templateId = value;
    }

    /**
     * Gets the value of the adUnionId property.
     * 
     * @return
     *     possible object is
     *     {@link AdUnionId }
     *     
     */
    public AdUnionId getAdUnionId() {
        return adUnionId;
    }

    /**
     * Sets the value of the adUnionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdUnionId }
     *     
     */
    public void setAdUnionId(AdUnionId value) {
        this.adUnionId = value;
    }

    /**
     * Gets the value of the templateElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemplateElement }
     * 
     * 
     */
    public List<TemplateElement> getTemplateElements() {
        if (templateElements == null) {
            templateElements = new ArrayList<TemplateElement>();
        }
        return this.templateElements;
    }

    /**
     * Gets the value of the adAsImage property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getAdAsImage() {
        return adAsImage;
    }

    /**
     * Sets the value of the adAsImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setAdAsImage(Image value) {
        this.adAsImage = value;
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
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * Gets the value of the originAdId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginAdId() {
        return originAdId;
    }

    /**
     * Sets the value of the originAdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginAdId(Long value) {
        this.originAdId = value;
    }

}
