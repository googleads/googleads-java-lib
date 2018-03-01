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
 *             Represents a FeedItem geo restriction.
 *           
 * 
 * <p>Java class for FeedItemGeoRestriction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedItemGeoRestriction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="geoRestriction" type="{https://adwords.google.com/api/adwords/cm/v201802}GeoRestriction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedItemGeoRestriction", propOrder = {
    "geoRestriction"
})
public class FeedItemGeoRestriction {

    @XmlSchemaType(name = "string")
    protected GeoRestriction geoRestriction;

    /**
     * Gets the value of the geoRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link GeoRestriction }
     *     
     */
    public GeoRestriction getGeoRestriction() {
        return geoRestriction;
    }

    /**
     * Sets the value of the geoRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoRestriction }
     *     
     */
    public void setGeoRestriction(GeoRestriction value) {
        this.geoRestriction = value;
    }

}
