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
 *             The product channel exclusivity dimension, which limits the availability of an offer between only
 *             local, only online, or both. Only supported by campaigns of
 *             {@link AdvertisingChannelType#SHOPPING}.
 *           
 * 
 * <p>Java class for ProductChannelExclusivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductChannelExclusivity">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}ProductDimension">
 *       &lt;sequence>
 *         &lt;element name="channelExclusivity" type="{https://adwords.google.com/api/adwords/cm/v201802}ShoppingProductChannelExclusivity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductChannelExclusivity", propOrder = {
    "channelExclusivity"
})
public class ProductChannelExclusivity
    extends ProductDimension
{

    @XmlSchemaType(name = "string")
    protected ShoppingProductChannelExclusivity channelExclusivity;

    /**
     * Gets the value of the channelExclusivity property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingProductChannelExclusivity }
     *     
     */
    public ShoppingProductChannelExclusivity getChannelExclusivity() {
        return channelExclusivity;
    }

    /**
     * Sets the value of the channelExclusivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingProductChannelExclusivity }
     *     
     */
    public void setChannelExclusivity(ShoppingProductChannelExclusivity value) {
        this.channelExclusivity = value;
    }

}
