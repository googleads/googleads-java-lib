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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             CPA Bids.
 *           
 * 
 * <p>Java class for CpaBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CpaBid">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Bids">
 *       &lt;sequence>
 *         &lt;element name="bid" type="{https://adwords.google.com/api/adwords/cm/v201802}Money" minOccurs="0"/>
 *         &lt;element name="bidSource" type="{https://adwords.google.com/api/adwords/cm/v201802}BidSource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CpaBid", propOrder = {
    "bid",
    "bidSource"
})
public class CpaBid
    extends Bids
{

    protected Money bid;
    @XmlSchemaType(name = "string")
    protected BidSource bidSource;

    /**
     * Gets the value of the bid property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getBid() {
        return bid;
    }

    /**
     * Sets the value of the bid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBid(Money value) {
        this.bid = value;
    }

    /**
     * Gets the value of the bidSource property.
     * 
     * @return
     *     possible object is
     *     {@link BidSource }
     *     
     */
    public BidSource getBidSource() {
        return bidSource;
    }

    /**
     * Sets the value of the bidSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidSource }
     *     
     */
    public void setBidSource(BidSource value) {
        this.bidSource = value;
    }

}
