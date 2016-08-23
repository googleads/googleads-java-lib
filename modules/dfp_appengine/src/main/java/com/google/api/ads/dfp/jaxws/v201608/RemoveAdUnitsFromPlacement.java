// Copyright 2016 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201608;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The action used for removing a group of {@link AdUnit} objects
 *             from a {@link Placement}.
 *           
 * 
 * <p>Java class for RemoveAdUnitsFromPlacement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveAdUnitsFromPlacement">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201608}AdUnitAction">
 *       &lt;sequence>
 *         &lt;element name="placementId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveAdUnitsFromPlacement", propOrder = {
    "placementId"
})
public class RemoveAdUnitsFromPlacement
    extends AdUnitAction
{

    protected Long placementId;

    /**
     * Gets the value of the placementId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlacementId() {
        return placementId;
    }

    /**
     * Sets the value of the placementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlacementId(Long value) {
        this.placementId = value;
    }

}
