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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Enhanced text ad format.
 *             
 *             <p class="caution"><b>Caution:</b> Expanded text ads do not use {@link #url url},
 *             {@link #displayUrl displayUrl}, {@link #finalAppUrls finalAppUrls}, or
 *             {@link #devicePreference devicePreference};
 *             setting these fields on an expanded text ad will cause an error.
 *             <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 *           
 * 
 * <p>Java class for ExpandedTextAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpandedTextAd">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Ad">
 *       &lt;sequence>
 *         &lt;element name="headlinePart1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="headlinePart2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ExpandedTextAd", propOrder = {
    "headlinePart1",
    "headlinePart2",
    "description",
    "path1",
    "path2"
})
public class ExpandedTextAd
    extends Ad
{

    protected String headlinePart1;
    protected String headlinePart2;
    protected String description;
    protected String path1;
    protected String path2;

    /**
     * Gets the value of the headlinePart1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadlinePart1() {
        return headlinePart1;
    }

    /**
     * Sets the value of the headlinePart1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadlinePart1(String value) {
        this.headlinePart1 = value;
    }

    /**
     * Gets the value of the headlinePart2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadlinePart2() {
        return headlinePart2;
    }

    /**
     * Sets the value of the headlinePart2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadlinePart2(String value) {
        this.headlinePart2 = value;
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
