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
 *             Represents data about a bidlandscape for an adgroup.
 *           
 * 
 * <p>Java class for AdGroupBidLandscape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroupBidLandscape">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}BidLandscape">
 *       &lt;sequence>
 *         &lt;element name="type" type="{https://adwords.google.com/api/adwords/cm/v201802}AdGroupBidLandscape.Type" minOccurs="0"/>
 *         &lt;element name="landscapeCurrent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroupBidLandscape", propOrder = {
    "type",
    "landscapeCurrent"
})
public class AdGroupBidLandscape
    extends BidLandscape
{

    @XmlSchemaType(name = "string")
    protected AdGroupBidLandscapeType type;
    protected Boolean landscapeCurrent;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupBidLandscapeType }
     *     
     */
    public AdGroupBidLandscapeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupBidLandscapeType }
     *     
     */
    public void setType(AdGroupBidLandscapeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the landscapeCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLandscapeCurrent() {
        return landscapeCurrent;
    }

    /**
     * Sets the value of the landscapeCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLandscapeCurrent(Boolean value) {
        this.landscapeCurrent = value;
    }

}
