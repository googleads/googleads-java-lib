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
 *             Represents Gmail ad.
 *             
 *             <p class="caution"><b>Caution:</b> Gmail ads do not use {@link #url url}, {@link #displayUrl
 *             displayUrl}, {@link #finalAppUrls finalAppUrls}, or {@link #devicePreference devicePreference};
 *             Setting these fields on a Gmail ad will cause an error.
 *             <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 *           
 * 
 * <p>Java class for GmailAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GmailAd">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Ad">
 *       &lt;sequence>
 *         &lt;element name="teaser" type="{https://adwords.google.com/api/adwords/cm/v201802}GmailTeaser" minOccurs="0"/>
 *         &lt;element name="headerImage" type="{https://adwords.google.com/api/adwords/cm/v201802}Image" minOccurs="0"/>
 *         &lt;element name="marketingImage" type="{https://adwords.google.com/api/adwords/cm/v201802}Image" minOccurs="0"/>
 *         &lt;element name="marketingImageHeadline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marketingImageDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marketingImageDisplayCallToAction" type="{https://adwords.google.com/api/adwords/cm/v201802}DisplayCallToAction" minOccurs="0"/>
 *         &lt;element name="productImages" type="{https://adwords.google.com/api/adwords/cm/v201802}ProductImage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productVideoList" type="{https://adwords.google.com/api/adwords/cm/v201802}Video" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GmailAd", propOrder = {
    "teaser",
    "headerImage",
    "marketingImage",
    "marketingImageHeadline",
    "marketingImageDescription",
    "marketingImageDisplayCallToAction",
    "productImages",
    "productVideoList"
})
public class GmailAd
    extends Ad
{

    protected GmailTeaser teaser;
    protected Image headerImage;
    protected Image marketingImage;
    protected String marketingImageHeadline;
    protected String marketingImageDescription;
    protected DisplayCallToAction marketingImageDisplayCallToAction;
    protected List<ProductImage> productImages;
    protected List<Video> productVideoList;

    /**
     * Gets the value of the teaser property.
     * 
     * @return
     *     possible object is
     *     {@link GmailTeaser }
     *     
     */
    public GmailTeaser getTeaser() {
        return teaser;
    }

    /**
     * Sets the value of the teaser property.
     * 
     * @param value
     *     allowed object is
     *     {@link GmailTeaser }
     *     
     */
    public void setTeaser(GmailTeaser value) {
        this.teaser = value;
    }

    /**
     * Gets the value of the headerImage property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getHeaderImage() {
        return headerImage;
    }

    /**
     * Sets the value of the headerImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setHeaderImage(Image value) {
        this.headerImage = value;
    }

    /**
     * Gets the value of the marketingImage property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getMarketingImage() {
        return marketingImage;
    }

    /**
     * Sets the value of the marketingImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setMarketingImage(Image value) {
        this.marketingImage = value;
    }

    /**
     * Gets the value of the marketingImageHeadline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingImageHeadline() {
        return marketingImageHeadline;
    }

    /**
     * Sets the value of the marketingImageHeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingImageHeadline(String value) {
        this.marketingImageHeadline = value;
    }

    /**
     * Gets the value of the marketingImageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingImageDescription() {
        return marketingImageDescription;
    }

    /**
     * Sets the value of the marketingImageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingImageDescription(String value) {
        this.marketingImageDescription = value;
    }

    /**
     * Gets the value of the marketingImageDisplayCallToAction property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayCallToAction }
     *     
     */
    public DisplayCallToAction getMarketingImageDisplayCallToAction() {
        return marketingImageDisplayCallToAction;
    }

    /**
     * Sets the value of the marketingImageDisplayCallToAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayCallToAction }
     *     
     */
    public void setMarketingImageDisplayCallToAction(DisplayCallToAction value) {
        this.marketingImageDisplayCallToAction = value;
    }

    /**
     * Gets the value of the productImages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productImages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductImage }
     * 
     * 
     */
    public List<ProductImage> getProductImages() {
        if (productImages == null) {
            productImages = new ArrayList<ProductImage>();
        }
        return this.productImages;
    }

    /**
     * Gets the value of the productVideoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productVideoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductVideoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Video }
     * 
     * 
     */
    public List<Video> getProductVideoList() {
        if (productVideoList == null) {
            productVideoList = new ArrayList<Video>();
        }
        return this.productVideoList;
    }

}
