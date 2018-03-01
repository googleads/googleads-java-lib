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
 *             Target Roas bidding strategy helps you maximize revenue while averaging a specific target
 *             return on average spend (ROAS).
 *             
 *             <p>For example: If TargetRoas is 1.5, the strategy will create as much revenue as possible while
 *             ensuring that every $1.00 of clicks provides $1.50 in conversion value.
 *             
 *             <p>Note that campaigns must meet <a
 *             href="//support.google.com/adwords/answer/6268637">specific
 *             eligibility requirements</a> before they can use the <code>TargetRoasBiddingScheme</code>
 *             bidding strategy.
 *             <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 *           
 * 
 * <p>Java class for TargetRoasBiddingScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetRoasBiddingScheme">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}BiddingScheme">
 *       &lt;sequence>
 *         &lt;element name="targetRoas" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="bidCeiling" type="{https://adwords.google.com/api/adwords/cm/v201802}Money" minOccurs="0"/>
 *         &lt;element name="bidFloor" type="{https://adwords.google.com/api/adwords/cm/v201802}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetRoasBiddingScheme", propOrder = {
    "targetRoas",
    "bidCeiling",
    "bidFloor"
})
public class TargetRoasBiddingScheme
    extends BiddingScheme
{

    protected Double targetRoas;
    protected Money bidCeiling;
    protected Money bidFloor;

    /**
     * Gets the value of the targetRoas property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTargetRoas() {
        return targetRoas;
    }

    /**
     * Sets the value of the targetRoas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTargetRoas(Double value) {
        this.targetRoas = value;
    }

    /**
     * Gets the value of the bidCeiling property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getBidCeiling() {
        return bidCeiling;
    }

    /**
     * Sets the value of the bidCeiling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBidCeiling(Money value) {
        this.bidCeiling = value;
    }

    /**
     * Gets the value of the bidFloor property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getBidFloor() {
        return bidFloor;
    }

    /**
     * Sets the value of the bidFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBidFloor(Money value) {
        this.bidFloor = value;
    }

}
