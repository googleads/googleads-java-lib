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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             {@code LineItem} is an advertiser's commitment to purchase a specific number
 *             of ad impressions, clicks, or time.
 *           
 * 
 * <p>Java class for LineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItem">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201802}LineItemSummary">
 *       &lt;sequence>
 *         &lt;element name="targeting" type="{https://www.google.com/apis/ads/publisher/v201802}Targeting" minOccurs="0"/>
 *         &lt;element name="creativeTargetings" type="{https://www.google.com/apis/ads/publisher/v201802}CreativeTargeting" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItem", propOrder = {
    "targeting",
    "creativeTargetings"
})
public class LineItem
    extends LineItemSummary
{

    protected Targeting targeting;
    protected List<CreativeTargeting> creativeTargetings;

    /**
     * Gets the value of the targeting property.
     * 
     * @return
     *     possible object is
     *     {@link Targeting }
     *     
     */
    public Targeting getTargeting() {
        return targeting;
    }

    /**
     * Sets the value of the targeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Targeting }
     *     
     */
    public void setTargeting(Targeting value) {
        this.targeting = value;
    }

    /**
     * Gets the value of the creativeTargetings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creativeTargetings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreativeTargetings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreativeTargeting }
     * 
     * 
     */
    public List<CreativeTargeting> getCreativeTargetings() {
        if (creativeTargetings == null) {
            creativeTargetings = new ArrayList<CreativeTargeting>();
        }
        return this.creativeTargetings;
    }

}
