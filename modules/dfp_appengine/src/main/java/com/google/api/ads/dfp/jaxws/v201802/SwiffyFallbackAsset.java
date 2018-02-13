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
 *             A fallback swiffy asset used for flash creatives.
 *           
 * 
 * <p>Java class for SwiffyFallbackAsset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwiffyFallbackAsset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asset" type="{https://www.google.com/apis/ads/publisher/v201802}CreativeAsset" minOccurs="0"/>
 *         &lt;element name="html5Features" type="{https://www.google.com/apis/ads/publisher/v201802}Html5Feature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="localizedInfoMessages" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwiffyFallbackAsset", propOrder = {
    "asset",
    "html5Features",
    "localizedInfoMessages"
})
public class SwiffyFallbackAsset {

    protected CreativeAsset asset;
    @XmlSchemaType(name = "string")
    protected List<Html5Feature> html5Features;
    protected List<String> localizedInfoMessages;

    /**
     * Gets the value of the asset property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeAsset }
     *     
     */
    public CreativeAsset getAsset() {
        return asset;
    }

    /**
     * Sets the value of the asset property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeAsset }
     *     
     */
    public void setAsset(CreativeAsset value) {
        this.asset = value;
    }

    /**
     * Gets the value of the html5Features property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the html5Features property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHtml5Features().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Html5Feature }
     * 
     * 
     */
    public List<Html5Feature> getHtml5Features() {
        if (html5Features == null) {
            html5Features = new ArrayList<Html5Feature>();
        }
        return this.html5Features;
    }

    /**
     * Gets the value of the localizedInfoMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localizedInfoMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalizedInfoMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLocalizedInfoMessages() {
        if (localizedInfoMessages == null) {
            localizedInfoMessages = new ArrayList<String>();
        }
        return this.localizedInfoMessages;
    }

}
