// Copyright 2018 Google LLC
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


package com.google.api.ads.adwords.jaxws.v201809.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a responsive search ad.
 *             
 *             <p><strong>Important</strong></p>
 *             
 *             <p>
 *             <ul>
 *             <li>Responsive search ads are in beta and may not be available to all AdWords advertisers.</li>
 *             <li>Per the <a href="https://support.google.com/adwordspolicy/answer/54818">AdWords Terms &amp;
 *             Conditions</a> for features in beta, you may not disclose any non-public information.</li>
 *             <li>Responsive search ads will learn and improve over time, so make sure to regularly monitor the
 *             performance and status of your ads.</li>
 *             <li>Responsive search ads are currently available in English, French, German, Spanish,
 *             Portuguese, Italian, Swedish, Dutch, Russian, Japanese, Polish, Turkish, Danish, and
 *             Norwegian, with other languages on the way.</li>
 *             <li>Assets can be shown in any order, so make sure that they make sense individually or in
 *             combination, and don?t violate our policies or local law.</li>
 *             <li>Even after ads are assembled, they may not serve.</li>
 *             <li>If you have text that should appear in every ad, then you must pin it to either Headline
 *             position 1, Headline position 2, or Description position 1, and also make sure it is less
 *             than 80 characters long.</li>
 *             </ul>
 *             </p>
 *             
 *             <p>To increase the likelihood that your ad shows, be sure to provide at least 5 distinct
 *             headlines and 2 distinct descriptions that don't repeat the same or similar phrases. Providing
 *             redundant content will restrict the system's ability to assemble combinations.
 *             <a href="https://support.google.com/adwords/answer/9023565">See example ads</a></p>
 *             
 *             <p>Help center documentation
 *             <ul>
 *             <li><a href="https://support.google.com/adwords/answer/7684791">About responsive search
 *             ads</a></li>
 *             <li><a href="https://support.google.com/adwords/answer/9023565">Create a responsive search ad
 *             (see examples)</a></li>
 *             </ul>
 *             </p>
 *             
 *             <p class="caution"><b>Caution:</b> Responsive search ads do not use {@link #url url}, {@link
 *             #displayUrl displayUrl}, {@link #finalAppUrls finalAppUrls}, or {@link #devicePreference
 *             devicePreference}; setting these fields on a responsive search ad will cause an error.</p>
 *             <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 *           
 * 
 * <p>Java class for ResponsiveSearchAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsiveSearchAd">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201809}Ad">
 *       &lt;sequence>
 *         &lt;element name="headlines" type="{https://adwords.google.com/api/adwords/cm/v201809}AssetLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="descriptions" type="{https://adwords.google.com/api/adwords/cm/v201809}AssetLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="path1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="path2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsiveSearchAd", propOrder = {
    "headlines",
    "descriptions",
    "path1",
    "path2"
})
public class ResponsiveSearchAd
    extends Ad
{

    protected List<AssetLink> headlines;
    protected List<AssetLink> descriptions;
    protected String path1;
    protected String path2;

    /**
     * Gets the value of the headlines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headlines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeadlines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetLink }
     * 
     * 
     */
    public List<AssetLink> getHeadlines() {
        if (headlines == null) {
            headlines = new ArrayList<AssetLink>();
        }
        return this.headlines;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetLink }
     * 
     * 
     */
    public List<AssetLink> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<AssetLink>();
        }
        return this.descriptions;
    }

    /**
     * Gets the value of the path1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath1() {
        return path1;
    }

    /**
     * Sets the value of the path1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath1(String value) {
        this.path1 = value;
    }

    /**
     * Gets the value of the path2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath2() {
        return path2;
    }

    /**
     * Sets the value of the path2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath2(String value) {
        this.path2 = value;
    }

}
